package com.github.igorperikov.heimdallr.init;

import com.github.igorperikov.heimdallr.HeimdallrNode;
import com.github.igorperikov.heimdallr.init.handler.ClientInboundChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.serialization.ClassResolvers;
import io.netty.handler.codec.serialization.ObjectDecoder;
import io.netty.handler.codec.serialization.ObjectEncoder;

public class NodeClientChannelInitializer extends ChannelInitializer<SocketChannel> {
    private final HeimdallrNode node;

    public NodeClientChannelInitializer(HeimdallrNode node) {
        this.node = node;
    }

    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ch.pipeline().addLast(
                new ObjectEncoder(),
                new ObjectDecoder(1024876, ClassResolvers.cacheDisabled(this.getClass().getClassLoader())),
                new ClientInboundChannelHandler(node)
        );
    }
}