// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: myproject.proto

package co.overlead.gRPC;

public final class myproject {
  private myproject() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_myproject_AddNewProjectReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_myproject_AddNewProjectReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_myproject_AddNewProjectRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_myproject_AddNewProjectRes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_myproject_UpdateProjectReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_myproject_UpdateProjectReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_myproject_UpdateProjectRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_myproject_UpdateProjectRes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_myproject_DeleteProjectReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_myproject_DeleteProjectReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_myproject_DeleteProjectRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_myproject_DeleteProjectRes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_myproject_GetAllProjectReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_myproject_GetAllProjectReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_myproject_GetAllProjectRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_myproject_GetAllProjectRes_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017myproject.proto\022\tmyproject\"f\n\020AddNewPr" +
      "ojectReq\022\020\n\010userName\030\001 \001(\t\022\023\n\013projectNam" +
      "e\030\002 \001(\t\022\r\n\005start\030\003 \001(\t\022\013\n\003end\030\004 \001(\t\022\017\n\007p" +
      "rivate\030\005 \001(\t\"D\n\020AddNewProjectRes\022\016\n\006stat" +
      "us\030\001 \001(\t\022\021\n\tprojectId\030\002 \001(\t\022\r\n\005error\030\003 \001" +
      "(\t\"y\n\020UpdateProjectReq\022\021\n\tprojectId\030\001 \001(" +
      "\t\022\020\n\010userName\030\002 \001(\t\022\023\n\013projectName\030\003 \001(\t" +
      "\022\r\n\005start\030\004 \001(\t\022\013\n\003end\030\005 \001(\t\022\017\n\007private\030" +
      "\006 \001(\t\"1\n\020UpdateProjectRes\022\016\n\006status\030\001 \001(" +
      "\t\022\r\n\005error\030\002 \001(\t\"7\n\020DeleteProjectReq\022\020\n\010" +
      "userName\030\001 \001(\t\022\021\n\tprojectId\030\002 \001(\t\"1\n\020Del" +
      "eteProjectRes\022\016\n\006status\030\001 \001(\t\022\r\n\005error\030\002" +
      " \001(\t\"$\n\020GetAllProjectReq\022\020\n\010userName\030\001 \001" +
      "(\t\"\206\001\n\020GetAllProjectRes\022\021\n\tprojectId\030\001 \001" +
      "(\t\022\023\n\013projectName\030\002 \001(\t\022\r\n\005start\030\003 \001(\t\022\013" +
      "\n\003end\030\004 \001(\t\022\017\n\007private\030\005 \001(\t\022\016\n\006status\030\006" +
      " \001(\t\022\r\n\005error\030\007 \001(\t2\301\002\n\tMyproject\022K\n\radd" +
      "NewProject\022\033.myproject.AddNewProjectReq\032" +
      "\033.myproject.AddNewProjectRes\"\000\022K\n\rupdate" +
      "Project\022\033.myproject.UpdateProjectReq\032\033.m" +
      "yproject.UpdateProjectRes\"\000\022K\n\rdeletePro" +
      "ject\022\033.myproject.DeleteProjectReq\032\033.mypr" +
      "oject.DeleteProjectRes\"\000\022M\n\rgetAllProjec" +
      "t\022\033.myproject.GetAllProjectReq\032\033.myproje" +
      "ct.GetAllProjectRes\"\0000\001B$\n\020co.overlead.g" +
      "RPCB\tmyprojectP\001\242\002\002mpb\006proto3"
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
    internal_static_myproject_AddNewProjectReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_myproject_AddNewProjectReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_myproject_AddNewProjectReq_descriptor,
        new java.lang.String[] { "UserName", "ProjectName", "Start", "End", "Private", });
    internal_static_myproject_AddNewProjectRes_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_myproject_AddNewProjectRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_myproject_AddNewProjectRes_descriptor,
        new java.lang.String[] { "Status", "ProjectId", "Error", });
    internal_static_myproject_UpdateProjectReq_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_myproject_UpdateProjectReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_myproject_UpdateProjectReq_descriptor,
        new java.lang.String[] { "ProjectId", "UserName", "ProjectName", "Start", "End", "Private", });
    internal_static_myproject_UpdateProjectRes_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_myproject_UpdateProjectRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_myproject_UpdateProjectRes_descriptor,
        new java.lang.String[] { "Status", "Error", });
    internal_static_myproject_DeleteProjectReq_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_myproject_DeleteProjectReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_myproject_DeleteProjectReq_descriptor,
        new java.lang.String[] { "UserName", "ProjectId", });
    internal_static_myproject_DeleteProjectRes_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_myproject_DeleteProjectRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_myproject_DeleteProjectRes_descriptor,
        new java.lang.String[] { "Status", "Error", });
    internal_static_myproject_GetAllProjectReq_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_myproject_GetAllProjectReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_myproject_GetAllProjectReq_descriptor,
        new java.lang.String[] { "UserName", });
    internal_static_myproject_GetAllProjectRes_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_myproject_GetAllProjectRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_myproject_GetAllProjectRes_descriptor,
        new java.lang.String[] { "ProjectId", "ProjectName", "Start", "End", "Private", "Status", "Error", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}