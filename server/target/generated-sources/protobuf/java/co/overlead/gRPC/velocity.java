// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: velocity.proto

package co.overlead.gRPC;

public final class velocity {
  private velocity() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_velocity_GetAllTeamTaskVelocityReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_velocity_GetAllTeamTaskVelocityReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_velocity_GetAllTeamTaskVelocityRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_velocity_GetAllTeamTaskVelocityRes_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016velocity.proto\022\010velocity\"@\n\031GetAllTeam" +
      "TaskVelocityReq\022\020\n\010username\030\001 \001(\t\022\021\n\tpro" +
      "jectId\030\002 \001(\t\"O\n\031GetAllTeamTaskVelocityRe" +
      "s\022\016\n\006status\030\001 \001(\t\022\023\n\013AllTeamTask\030\002 \001(\t\022\r" +
      "\n\005error\030\003 \001(\t2j\n\010Velocity\022^\n\016getAllTeamT" +
      "ask\022#.velocity.GetAllTeamTaskVelocityReq" +
      "\032#.velocity.GetAllTeamTaskVelocityRes\"\0000" +
      "\001B\"\n\020co.overlead.gRPCB\010velocityP\001\242\002\001vb\006p" +
      "roto3"
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
    internal_static_velocity_GetAllTeamTaskVelocityReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_velocity_GetAllTeamTaskVelocityReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_velocity_GetAllTeamTaskVelocityReq_descriptor,
        new java.lang.String[] { "Username", "ProjectId", });
    internal_static_velocity_GetAllTeamTaskVelocityRes_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_velocity_GetAllTeamTaskVelocityRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_velocity_GetAllTeamTaskVelocityRes_descriptor,
        new java.lang.String[] { "Status", "AllTeamTask", "Error", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}