package com.github.igorperikov.mightywatcher

import com.github.igorperikov.mightywatcher.entity.Issue
import com.github.igorperikov.mightywatcher.external.RestGithubApiClient
import com.github.igorperikov.mightywatcher.service.ImportService
import com.github.igorperikov.mightywatcher.utils.ParallelExecutor
import org.slf4j.LoggerFactory
import java.time.Duration
import java.time.Instant
import java.time.LocalDate
import java.time.ZoneOffset
import java.util.*
import kotlin.collections.LinkedHashMap

typealias Issues = MutableList<Issue>

const val TOKEN_ENV_NAME = "TOKEN"
const val INCLUDE_LANG_ENV_NAME = "INCLUDE"
const val EXCLUDE_REPOS_ENV_NAME = "EXCLUDE"

object Launcher {
    @JvmStatic
    private val log = LoggerFactory.getLogger(this.javaClass)

    private val importService = ImportService(
        RestGithubApiClient(
            requireNotNull(System.getenv(TOKEN_ENV_NAME), { "$TOKEN_ENV_NAME should be set" })
        )
    )

    @JvmStatic
    fun main(args: Array<String>) {
        val parallelExecutor = ParallelExecutor() // TODO: support providing another parallelism level via env variable
        printResult(
            parallelExecutor.execute(importService.getSearchTasks()) { searchTask ->
                importService.fetchIssues(
                    searchTask.repository,
                    searchTask.label
                )
            }
                .asSequence()
                .flatten()
                .distinctBy { it.htmlUrl }
                .sortedByDescending { it.createdAt }
                .toMutableList()
        )
    }

    private fun printResult(issues: Issues) {
        for ((timeGroup, issuesInTimeGroup) in groupByTime(issues)) {
            log.info("{}", timeGroup)
            for (issue in issuesInTimeGroup) {
                log.info(" {}", issue)
            }
        }
    }

    private fun groupByTime(issues: Issues): LinkedHashMap<TimeGroup, Issues> {
        val today = LocalDate.now().atStartOfDay().toInstant(ZoneOffset.UTC)
        val yesterday = today.minus(Duration.ofDays(1))
        val thisWeek = today.minus(Duration.ofDays(7))
        val thisMonth = today.minus(Duration.ofDays(30))
        val older = Instant.MIN

        val timeGroups = arrayOf(
            TimeGroup(older, "older"),
            TimeGroup(thisMonth, "this month"),
            TimeGroup(thisWeek, "this week"),
            TimeGroup(yesterday, "yesterday"),
            TimeGroup(today, "today")
        )
        val issuesByTimeGroup = LinkedHashMap<TimeGroup, Issues>()
        for (issue in issues) {
            issuesByTimeGroup.computeIfAbsent(findTimeGroup(timeGroups, issue)) { mutableListOf() }.add(issue)
        }
        return issuesByTimeGroup
    }

    private fun findTimeGroup(timeGroups: Array<TimeGroup>, issue: Issue): TimeGroup {
        val insertionPoint = Arrays.binarySearch(timeGroups, TimeGroup(issue.createdAt))
        return if (insertionPoint >= 0) {
            timeGroups[insertionPoint]
        } else {
            timeGroups[-insertionPoint - 1 - 1]
        }
    }

    private class TimeGroup(val time: Instant, val name: String = "") : Comparable<TimeGroup> {
        override fun compareTo(other: TimeGroup): Int {
            return time.compareTo(other.time)
        }

        override fun equals(other: Any?): Boolean {
            if (this === other) return true
            return if (other is TimeGroup) {
                name == other.name
            } else {
                false
            }
        }

        override fun hashCode(): Int {
            return name.hashCode()
        }

        override fun toString(): String {
            return "${name.toUpperCase()}:"
        }
    }
}
