// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dto.proto

package com.github.igorperikov.heimdallr.generated;

/**
 * Protobuf type {@code heimdallr.ClusterState}
 */
public  final class ClusterState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:heimdallr.ClusterState)
    ClusterStateOrBuilder {
  // Use ClusterState.newBuilder() to construct.
  private ClusterState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ClusterState() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private ClusterState(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              nodes_ = com.google.protobuf.MapField.newMapField(
                  NodesDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, com.github.igorperikov.heimdallr.generated.NodeDefinition>
            nodes__ = input.readMessage(
                NodesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            nodes_.getMutableMap().put(
                nodes__.getKey(), nodes__.getValue());
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.github.igorperikov.heimdallr.generated.HeimdallrOuter.internal_static_heimdallr_ClusterState_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetNodes();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.github.igorperikov.heimdallr.generated.HeimdallrOuter.internal_static_heimdallr_ClusterState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.github.igorperikov.heimdallr.generated.ClusterState.class, com.github.igorperikov.heimdallr.generated.ClusterState.Builder.class);
  }

  public static final int NODES_FIELD_NUMBER = 1;
  private static final class NodesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, com.github.igorperikov.heimdallr.generated.NodeDefinition> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, com.github.igorperikov.heimdallr.generated.NodeDefinition>newDefaultInstance(
                com.github.igorperikov.heimdallr.generated.HeimdallrOuter.internal_static_heimdallr_ClusterState_NodesEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.MESSAGE,
                com.github.igorperikov.heimdallr.generated.NodeDefinition.getDefaultInstance());
  }
  private com.google.protobuf.MapField<
      java.lang.String, com.github.igorperikov.heimdallr.generated.NodeDefinition> nodes_;
  private com.google.protobuf.MapField<java.lang.String, com.github.igorperikov.heimdallr.generated.NodeDefinition>
  internalGetNodes() {
    if (nodes_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          NodesDefaultEntryHolder.defaultEntry);
    }
    return nodes_;
  }

  public int getNodesCount() {
    return internalGetNodes().getMap().size();
  }
  /**
   * <code>map&lt;string, .heimdallr.NodeDefinition&gt; nodes = 1;</code>
   */

  public boolean containsNodes(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetNodes().getMap().containsKey(key);
  }
  /**
   * Use {@link #getNodesMap()} instead.
   */
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, com.github.igorperikov.heimdallr.generated.NodeDefinition> getNodes() {
    return getNodesMap();
  }
  /**
   * <code>map&lt;string, .heimdallr.NodeDefinition&gt; nodes = 1;</code>
   */

  public java.util.Map<java.lang.String, com.github.igorperikov.heimdallr.generated.NodeDefinition> getNodesMap() {
    return internalGetNodes().getMap();
  }
  /**
   * <code>map&lt;string, .heimdallr.NodeDefinition&gt; nodes = 1;</code>
   */

  public com.github.igorperikov.heimdallr.generated.NodeDefinition getNodesOrDefault(
      java.lang.String key,
      com.github.igorperikov.heimdallr.generated.NodeDefinition defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, com.github.igorperikov.heimdallr.generated.NodeDefinition> map =
        internalGetNodes().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, .heimdallr.NodeDefinition&gt; nodes = 1;</code>
   */

  public com.github.igorperikov.heimdallr.generated.NodeDefinition getNodesOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, com.github.igorperikov.heimdallr.generated.NodeDefinition> map =
        internalGetNodes().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetNodes(),
        NodesDefaultEntryHolder.defaultEntry,
        1);
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, com.github.igorperikov.heimdallr.generated.NodeDefinition> entry
         : internalGetNodes().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, com.github.igorperikov.heimdallr.generated.NodeDefinition>
      nodes__ = NodesDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, nodes__);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.github.igorperikov.heimdallr.generated.ClusterState)) {
      return super.equals(obj);
    }
    com.github.igorperikov.heimdallr.generated.ClusterState other = (com.github.igorperikov.heimdallr.generated.ClusterState) obj;

    boolean result = true;
    result = result && internalGetNodes().equals(
        other.internalGetNodes());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (!internalGetNodes().getMap().isEmpty()) {
      hash = (37 * hash) + NODES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetNodes().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.github.igorperikov.heimdallr.generated.ClusterState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.igorperikov.heimdallr.generated.ClusterState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.igorperikov.heimdallr.generated.ClusterState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.igorperikov.heimdallr.generated.ClusterState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.igorperikov.heimdallr.generated.ClusterState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.github.igorperikov.heimdallr.generated.ClusterState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.github.igorperikov.heimdallr.generated.ClusterState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.igorperikov.heimdallr.generated.ClusterState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.igorperikov.heimdallr.generated.ClusterState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.github.igorperikov.heimdallr.generated.ClusterState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.github.igorperikov.heimdallr.generated.ClusterState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.github.igorperikov.heimdallr.generated.ClusterState parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.github.igorperikov.heimdallr.generated.ClusterState prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code heimdallr.ClusterState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:heimdallr.ClusterState)
      com.github.igorperikov.heimdallr.generated.ClusterStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.github.igorperikov.heimdallr.generated.HeimdallrOuter.internal_static_heimdallr_ClusterState_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetNodes();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableNodes();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.github.igorperikov.heimdallr.generated.HeimdallrOuter.internal_static_heimdallr_ClusterState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.github.igorperikov.heimdallr.generated.ClusterState.class, com.github.igorperikov.heimdallr.generated.ClusterState.Builder.class);
    }

    // Construct using com.github.igorperikov.heimdallr.generated.ClusterState.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      internalGetMutableNodes().clear();
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.github.igorperikov.heimdallr.generated.HeimdallrOuter.internal_static_heimdallr_ClusterState_descriptor;
    }

    public com.github.igorperikov.heimdallr.generated.ClusterState getDefaultInstanceForType() {
      return com.github.igorperikov.heimdallr.generated.ClusterState.getDefaultInstance();
    }

    public com.github.igorperikov.heimdallr.generated.ClusterState build() {
      com.github.igorperikov.heimdallr.generated.ClusterState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public com.github.igorperikov.heimdallr.generated.ClusterState buildPartial() {
      com.github.igorperikov.heimdallr.generated.ClusterState result = new com.github.igorperikov.heimdallr.generated.ClusterState(this);
      int from_bitField0_ = bitField0_;
      result.nodes_ = internalGetNodes();
      result.nodes_.makeImmutable();
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.github.igorperikov.heimdallr.generated.ClusterState) {
        return mergeFrom((com.github.igorperikov.heimdallr.generated.ClusterState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.github.igorperikov.heimdallr.generated.ClusterState other) {
      if (other == com.github.igorperikov.heimdallr.generated.ClusterState.getDefaultInstance()) return this;
      internalGetMutableNodes().mergeFrom(
          other.internalGetNodes());
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.github.igorperikov.heimdallr.generated.ClusterState parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.github.igorperikov.heimdallr.generated.ClusterState) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.String, com.github.igorperikov.heimdallr.generated.NodeDefinition> nodes_;
    private com.google.protobuf.MapField<java.lang.String, com.github.igorperikov.heimdallr.generated.NodeDefinition>
    internalGetNodes() {
      if (nodes_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            NodesDefaultEntryHolder.defaultEntry);
      }
      return nodes_;
    }
    private com.google.protobuf.MapField<java.lang.String, com.github.igorperikov.heimdallr.generated.NodeDefinition>
    internalGetMutableNodes() {
      onChanged();;
      if (nodes_ == null) {
        nodes_ = com.google.protobuf.MapField.newMapField(
            NodesDefaultEntryHolder.defaultEntry);
      }
      if (!nodes_.isMutable()) {
        nodes_ = nodes_.copy();
      }
      return nodes_;
    }

    public int getNodesCount() {
      return internalGetNodes().getMap().size();
    }
    /**
     * <code>map&lt;string, .heimdallr.NodeDefinition&gt; nodes = 1;</code>
     */

    public boolean containsNodes(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetNodes().getMap().containsKey(key);
    }
    /**
     * Use {@link #getNodesMap()} instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.github.igorperikov.heimdallr.generated.NodeDefinition> getNodes() {
      return getNodesMap();
    }
    /**
     * <code>map&lt;string, .heimdallr.NodeDefinition&gt; nodes = 1;</code>
     */

    public java.util.Map<java.lang.String, com.github.igorperikov.heimdallr.generated.NodeDefinition> getNodesMap() {
      return internalGetNodes().getMap();
    }
    /**
     * <code>map&lt;string, .heimdallr.NodeDefinition&gt; nodes = 1;</code>
     */

    public com.github.igorperikov.heimdallr.generated.NodeDefinition getNodesOrDefault(
        java.lang.String key,
        com.github.igorperikov.heimdallr.generated.NodeDefinition defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, com.github.igorperikov.heimdallr.generated.NodeDefinition> map =
          internalGetNodes().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, .heimdallr.NodeDefinition&gt; nodes = 1;</code>
     */

    public com.github.igorperikov.heimdallr.generated.NodeDefinition getNodesOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, com.github.igorperikov.heimdallr.generated.NodeDefinition> map =
          internalGetNodes().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearNodes() {
      internalGetMutableNodes().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, .heimdallr.NodeDefinition&gt; nodes = 1;</code>
     */

    public Builder removeNodes(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableNodes().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, com.github.igorperikov.heimdallr.generated.NodeDefinition>
    getMutableNodes() {
      return internalGetMutableNodes().getMutableMap();
    }
    /**
     * <code>map&lt;string, .heimdallr.NodeDefinition&gt; nodes = 1;</code>
     */
    public Builder putNodes(
        java.lang.String key,
        com.github.igorperikov.heimdallr.generated.NodeDefinition value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableNodes().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, .heimdallr.NodeDefinition&gt; nodes = 1;</code>
     */

    public Builder putAllNodes(
        java.util.Map<java.lang.String, com.github.igorperikov.heimdallr.generated.NodeDefinition> values) {
      internalGetMutableNodes().getMutableMap()
          .putAll(values);
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:heimdallr.ClusterState)
  }

  // @@protoc_insertion_point(class_scope:heimdallr.ClusterState)
  private static final com.github.igorperikov.heimdallr.generated.ClusterState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.github.igorperikov.heimdallr.generated.ClusterState();
  }

  public static com.github.igorperikov.heimdallr.generated.ClusterState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ClusterState>
      PARSER = new com.google.protobuf.AbstractParser<ClusterState>() {
    public ClusterState parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new ClusterState(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<ClusterState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ClusterState> getParserForType() {
    return PARSER;
  }

  public com.github.igorperikov.heimdallr.generated.ClusterState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
