// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: counter.proto

package examples.gRPC;

public final class CounterProto {
  private CounterProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_counter_UserReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_counter_UserReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_counter_SetBalanceReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_counter_SetBalanceReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_counter_SetBalanceReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_counter_SetBalanceReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_counter_GetBalanceReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_counter_GetBalanceReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_counter_Result_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_counter_Result_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_counter_BalanceReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_counter_BalanceReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rcounter.proto\022\007counter\"\033\n\007UserReq\022\020\n\010u" +
      "sername\030\001 \001(\t\"8\n\rSetBalanceReq\022\020\n\010userna" +
      "me\030\001 \001(\t\022\025\n\rbalanceChange\030\002 \001(\003\":\n\017SetBa" +
      "lanceReply\022\020\n\010username\030\001 \001(\t\022\025\n\rbalanceC" +
      "hange\030\002 \001(\003\"\"\n\017GetBalanceReply\022\017\n\007balanc" +
      "e\030\002 \001(\003\"\030\n\006Result\022\016\n\006result\030\001 \001(\t\"\037\n\014Bal" +
      "anceReply\022\017\n\007balance\030\001 \001(\0032\301\001\n\016CounterSe" +
      "rvice\0221\n\nCreateUser\022\020.counter.UserReq\032\017." +
      "counter.Result\"\000\022:\n\nGetBalance\022\020.counter" +
      ".UserReq\032\030.counter.GetBalanceReply\"\000\022@\n\n" +
      "SetBalance\022\026.counter.SetBalanceReq\032\030.cou" +
      "nter.GetBalanceReply\"\000B#\n\rexamples.gRPCB" +
      "\014CounterProtoP\001\242\002\001Cb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_counter_UserReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_counter_UserReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_counter_UserReq_descriptor,
        new java.lang.String[] { "Username", });
    internal_static_counter_SetBalanceReq_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_counter_SetBalanceReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_counter_SetBalanceReq_descriptor,
        new java.lang.String[] { "Username", "BalanceChange", });
    internal_static_counter_SetBalanceReply_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_counter_SetBalanceReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_counter_SetBalanceReply_descriptor,
        new java.lang.String[] { "Username", "BalanceChange", });
    internal_static_counter_GetBalanceReply_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_counter_GetBalanceReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_counter_GetBalanceReply_descriptor,
        new java.lang.String[] { "Balance", });
    internal_static_counter_Result_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_counter_Result_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_counter_Result_descriptor,
        new java.lang.String[] { "Result", });
    internal_static_counter_BalanceReply_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_counter_BalanceReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_counter_BalanceReply_descriptor,
        new java.lang.String[] { "Balance", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
