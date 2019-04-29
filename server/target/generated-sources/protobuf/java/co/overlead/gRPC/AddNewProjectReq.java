// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: myproject.proto

package co.overlead.gRPC;

/**
 * Protobuf type {@code myproject.AddNewProjectReq}
 */
public  final class AddNewProjectReq extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:myproject.AddNewProjectReq)
    AddNewProjectReqOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddNewProjectReq.newBuilder() to construct.
  private AddNewProjectReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddNewProjectReq() {
    userName_ = "";
    projectName_ = "";
    start_ = "";
    end_ = "";
    private_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AddNewProjectReq(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            userName_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            projectName_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            start_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            end_ = s;
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            private_ = s;
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return co.overlead.gRPC.myproject.internal_static_myproject_AddNewProjectReq_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return co.overlead.gRPC.myproject.internal_static_myproject_AddNewProjectReq_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            co.overlead.gRPC.AddNewProjectReq.class, co.overlead.gRPC.AddNewProjectReq.Builder.class);
  }

  public static final int USERNAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object userName_;
  /**
   * <code>string userName = 1;</code>
   */
  public java.lang.String getUserName() {
    java.lang.Object ref = userName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userName_ = s;
      return s;
    }
  }
  /**
   * <code>string userName = 1;</code>
   */
  public com.google.protobuf.ByteString
      getUserNameBytes() {
    java.lang.Object ref = userName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      userName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROJECTNAME_FIELD_NUMBER = 2;
  private volatile java.lang.Object projectName_;
  /**
   * <code>string projectName = 2;</code>
   */
  public java.lang.String getProjectName() {
    java.lang.Object ref = projectName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectName_ = s;
      return s;
    }
  }
  /**
   * <code>string projectName = 2;</code>
   */
  public com.google.protobuf.ByteString
      getProjectNameBytes() {
    java.lang.Object ref = projectName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      projectName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int START_FIELD_NUMBER = 3;
  private volatile java.lang.Object start_;
  /**
   * <pre>
   *return in form mm/hh/dd/mm/yyyy       phut/gio/ngay/thang/nam
   * </pre>
   *
   * <code>string start = 3;</code>
   */
  public java.lang.String getStart() {
    java.lang.Object ref = start_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      start_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *return in form mm/hh/dd/mm/yyyy       phut/gio/ngay/thang/nam
   * </pre>
   *
   * <code>string start = 3;</code>
   */
  public com.google.protobuf.ByteString
      getStartBytes() {
    java.lang.Object ref = start_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      start_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int END_FIELD_NUMBER = 4;
  private volatile java.lang.Object end_;
  /**
   * <pre>
   *return in form mm/hh/dd/mm/yyyy 
   * </pre>
   *
   * <code>string end = 4;</code>
   */
  public java.lang.String getEnd() {
    java.lang.Object ref = end_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      end_ = s;
      return s;
    }
  }
  /**
   * <pre>
   *return in form mm/hh/dd/mm/yyyy 
   * </pre>
   *
   * <code>string end = 4;</code>
   */
  public com.google.protobuf.ByteString
      getEndBytes() {
    java.lang.Object ref = end_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      end_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRIVATE_FIELD_NUMBER = 5;
  private volatile java.lang.Object private_;
  /**
   * <code>string private = 5;</code>
   */
  public java.lang.String getPrivate() {
    java.lang.Object ref = private_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      private_ = s;
      return s;
    }
  }
  /**
   * <code>string private = 5;</code>
   */
  public com.google.protobuf.ByteString
      getPrivateBytes() {
    java.lang.Object ref = private_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      private_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getUserNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, userName_);
    }
    if (!getProjectNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, projectName_);
    }
    if (!getStartBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, start_);
    }
    if (!getEndBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, end_);
    }
    if (!getPrivateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, private_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getUserNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, userName_);
    }
    if (!getProjectNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, projectName_);
    }
    if (!getStartBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, start_);
    }
    if (!getEndBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, end_);
    }
    if (!getPrivateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, private_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof co.overlead.gRPC.AddNewProjectReq)) {
      return super.equals(obj);
    }
    co.overlead.gRPC.AddNewProjectReq other = (co.overlead.gRPC.AddNewProjectReq) obj;

    if (!getUserName()
        .equals(other.getUserName())) return false;
    if (!getProjectName()
        .equals(other.getProjectName())) return false;
    if (!getStart()
        .equals(other.getStart())) return false;
    if (!getEnd()
        .equals(other.getEnd())) return false;
    if (!getPrivate()
        .equals(other.getPrivate())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + USERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getUserName().hashCode();
    hash = (37 * hash) + PROJECTNAME_FIELD_NUMBER;
    hash = (53 * hash) + getProjectName().hashCode();
    hash = (37 * hash) + START_FIELD_NUMBER;
    hash = (53 * hash) + getStart().hashCode();
    hash = (37 * hash) + END_FIELD_NUMBER;
    hash = (53 * hash) + getEnd().hashCode();
    hash = (37 * hash) + PRIVATE_FIELD_NUMBER;
    hash = (53 * hash) + getPrivate().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static co.overlead.gRPC.AddNewProjectReq parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static co.overlead.gRPC.AddNewProjectReq parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static co.overlead.gRPC.AddNewProjectReq parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static co.overlead.gRPC.AddNewProjectReq parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static co.overlead.gRPC.AddNewProjectReq parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static co.overlead.gRPC.AddNewProjectReq parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static co.overlead.gRPC.AddNewProjectReq parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static co.overlead.gRPC.AddNewProjectReq parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static co.overlead.gRPC.AddNewProjectReq parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static co.overlead.gRPC.AddNewProjectReq parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static co.overlead.gRPC.AddNewProjectReq parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static co.overlead.gRPC.AddNewProjectReq parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(co.overlead.gRPC.AddNewProjectReq prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
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
   * Protobuf type {@code myproject.AddNewProjectReq}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:myproject.AddNewProjectReq)
      co.overlead.gRPC.AddNewProjectReqOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return co.overlead.gRPC.myproject.internal_static_myproject_AddNewProjectReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return co.overlead.gRPC.myproject.internal_static_myproject_AddNewProjectReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              co.overlead.gRPC.AddNewProjectReq.class, co.overlead.gRPC.AddNewProjectReq.Builder.class);
    }

    // Construct using co.overlead.gRPC.AddNewProjectReq.newBuilder()
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
    @java.lang.Override
    public Builder clear() {
      super.clear();
      userName_ = "";

      projectName_ = "";

      start_ = "";

      end_ = "";

      private_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return co.overlead.gRPC.myproject.internal_static_myproject_AddNewProjectReq_descriptor;
    }

    @java.lang.Override
    public co.overlead.gRPC.AddNewProjectReq getDefaultInstanceForType() {
      return co.overlead.gRPC.AddNewProjectReq.getDefaultInstance();
    }

    @java.lang.Override
    public co.overlead.gRPC.AddNewProjectReq build() {
      co.overlead.gRPC.AddNewProjectReq result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public co.overlead.gRPC.AddNewProjectReq buildPartial() {
      co.overlead.gRPC.AddNewProjectReq result = new co.overlead.gRPC.AddNewProjectReq(this);
      result.userName_ = userName_;
      result.projectName_ = projectName_;
      result.start_ = start_;
      result.end_ = end_;
      result.private_ = private_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof co.overlead.gRPC.AddNewProjectReq) {
        return mergeFrom((co.overlead.gRPC.AddNewProjectReq)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(co.overlead.gRPC.AddNewProjectReq other) {
      if (other == co.overlead.gRPC.AddNewProjectReq.getDefaultInstance()) return this;
      if (!other.getUserName().isEmpty()) {
        userName_ = other.userName_;
        onChanged();
      }
      if (!other.getProjectName().isEmpty()) {
        projectName_ = other.projectName_;
        onChanged();
      }
      if (!other.getStart().isEmpty()) {
        start_ = other.start_;
        onChanged();
      }
      if (!other.getEnd().isEmpty()) {
        end_ = other.end_;
        onChanged();
      }
      if (!other.getPrivate().isEmpty()) {
        private_ = other.private_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      co.overlead.gRPC.AddNewProjectReq parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (co.overlead.gRPC.AddNewProjectReq) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object userName_ = "";
    /**
     * <code>string userName = 1;</code>
     */
    public java.lang.String getUserName() {
      java.lang.Object ref = userName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string userName = 1;</code>
     */
    public com.google.protobuf.ByteString
        getUserNameBytes() {
      java.lang.Object ref = userName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        userName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string userName = 1;</code>
     */
    public Builder setUserName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      userName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string userName = 1;</code>
     */
    public Builder clearUserName() {
      
      userName_ = getDefaultInstance().getUserName();
      onChanged();
      return this;
    }
    /**
     * <code>string userName = 1;</code>
     */
    public Builder setUserNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      userName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object projectName_ = "";
    /**
     * <code>string projectName = 2;</code>
     */
    public java.lang.String getProjectName() {
      java.lang.Object ref = projectName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string projectName = 2;</code>
     */
    public com.google.protobuf.ByteString
        getProjectNameBytes() {
      java.lang.Object ref = projectName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        projectName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string projectName = 2;</code>
     */
    public Builder setProjectName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      projectName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string projectName = 2;</code>
     */
    public Builder clearProjectName() {
      
      projectName_ = getDefaultInstance().getProjectName();
      onChanged();
      return this;
    }
    /**
     * <code>string projectName = 2;</code>
     */
    public Builder setProjectNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      projectName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object start_ = "";
    /**
     * <pre>
     *return in form mm/hh/dd/mm/yyyy       phut/gio/ngay/thang/nam
     * </pre>
     *
     * <code>string start = 3;</code>
     */
    public java.lang.String getStart() {
      java.lang.Object ref = start_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        start_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *return in form mm/hh/dd/mm/yyyy       phut/gio/ngay/thang/nam
     * </pre>
     *
     * <code>string start = 3;</code>
     */
    public com.google.protobuf.ByteString
        getStartBytes() {
      java.lang.Object ref = start_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        start_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *return in form mm/hh/dd/mm/yyyy       phut/gio/ngay/thang/nam
     * </pre>
     *
     * <code>string start = 3;</code>
     */
    public Builder setStart(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      start_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *return in form mm/hh/dd/mm/yyyy       phut/gio/ngay/thang/nam
     * </pre>
     *
     * <code>string start = 3;</code>
     */
    public Builder clearStart() {
      
      start_ = getDefaultInstance().getStart();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *return in form mm/hh/dd/mm/yyyy       phut/gio/ngay/thang/nam
     * </pre>
     *
     * <code>string start = 3;</code>
     */
    public Builder setStartBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      start_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object end_ = "";
    /**
     * <pre>
     *return in form mm/hh/dd/mm/yyyy 
     * </pre>
     *
     * <code>string end = 4;</code>
     */
    public java.lang.String getEnd() {
      java.lang.Object ref = end_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        end_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     *return in form mm/hh/dd/mm/yyyy 
     * </pre>
     *
     * <code>string end = 4;</code>
     */
    public com.google.protobuf.ByteString
        getEndBytes() {
      java.lang.Object ref = end_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        end_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     *return in form mm/hh/dd/mm/yyyy 
     * </pre>
     *
     * <code>string end = 4;</code>
     */
    public Builder setEnd(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      end_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     *return in form mm/hh/dd/mm/yyyy 
     * </pre>
     *
     * <code>string end = 4;</code>
     */
    public Builder clearEnd() {
      
      end_ = getDefaultInstance().getEnd();
      onChanged();
      return this;
    }
    /**
     * <pre>
     *return in form mm/hh/dd/mm/yyyy 
     * </pre>
     *
     * <code>string end = 4;</code>
     */
    public Builder setEndBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      end_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object private_ = "";
    /**
     * <code>string private = 5;</code>
     */
    public java.lang.String getPrivate() {
      java.lang.Object ref = private_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        private_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string private = 5;</code>
     */
    public com.google.protobuf.ByteString
        getPrivateBytes() {
      java.lang.Object ref = private_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        private_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string private = 5;</code>
     */
    public Builder setPrivate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      private_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string private = 5;</code>
     */
    public Builder clearPrivate() {
      
      private_ = getDefaultInstance().getPrivate();
      onChanged();
      return this;
    }
    /**
     * <code>string private = 5;</code>
     */
    public Builder setPrivateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      private_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:myproject.AddNewProjectReq)
  }

  // @@protoc_insertion_point(class_scope:myproject.AddNewProjectReq)
  private static final co.overlead.gRPC.AddNewProjectReq DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new co.overlead.gRPC.AddNewProjectReq();
  }

  public static co.overlead.gRPC.AddNewProjectReq getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddNewProjectReq>
      PARSER = new com.google.protobuf.AbstractParser<AddNewProjectReq>() {
    @java.lang.Override
    public AddNewProjectReq parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AddNewProjectReq(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AddNewProjectReq> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddNewProjectReq> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public co.overlead.gRPC.AddNewProjectReq getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

