// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: dailyschedule.proto

package co.overlead.gRPC;

public final class dailyschedule {
  private dailyschedule() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dailyschedule_AddNewDailyScheduleReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dailyschedule_AddNewDailyScheduleReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dailyschedule_AddNewDailyScheduleRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dailyschedule_AddNewDailyScheduleRes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dailyschedule_UpdateDailyScheduleReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dailyschedule_UpdateDailyScheduleReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dailyschedule_UpdateDailyScheduleRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dailyschedule_UpdateDailyScheduleRes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dailyschedule_DeleteDailyScheduleReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dailyschedule_DeleteDailyScheduleReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dailyschedule_DeleteDailyScheduleRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dailyschedule_DeleteDailyScheduleRes_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dailyschedule_GetAllDailyScheduleReq_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dailyschedule_GetAllDailyScheduleReq_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_dailyschedule_GetAllDailyScheduleRes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_dailyschedule_GetAllDailyScheduleRes_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023dailyschedule.proto\022\rdailyschedule\"\214\001\n" +
      "\026AddNewDailyScheduleReq\022\020\n\010userName\030\001 \001(" +
      "\t\022\021\n\tprojectId\030\002 \001(\t\022\014\n\004date\030\003 \001(\t\022\021\n\tid" +
      "backlog\030\004 \001(\t\022\014\n\004task\030\005 \001(\t\022\016\n\006status\030\006 " +
      "\001(\t\022\016\n\006review\030\007 \001(\t\"P\n\026AddNewDailySchedu" +
      "leRes\022\016\n\006status\030\001 \001(\t\022\027\n\017dailyscheduleId" +
      "\030\002 \001(\t\022\r\n\005error\030\003 \001(\t\"\214\001\n\026UpdateDailySch" +
      "eduleReq\022\020\n\010userName\030\001 \001(\t\022\021\n\tprojectId\030" +
      "\002 \001(\t\022\014\n\004date\030\003 \001(\t\022\021\n\tidbacklog\030\004 \001(\t\022\014" +
      "\n\004task\030\005 \001(\t\022\016\n\006status\030\006 \001(\t\022\016\n\006review\030\007" +
      " \001(\t\"7\n\026UpdateDailyScheduleRes\022\016\n\006status" +
      "\030\001 \001(\t\022\r\n\005error\030\002 \001(\t\"V\n\026DeleteDailySche" +
      "duleReq\022\020\n\010userName\030\001 \001(\t\022\021\n\tprojectId\030\002" +
      " \001(\t\022\027\n\017dailyscheduleId\030\003 \001(\t\"7\n\026DeleteD" +
      "ailyScheduleRes\022\016\n\006status\030\001 \001(\t\022\r\n\005error" +
      "\030\002 \001(\t\"=\n\026GetAllDailyScheduleReq\022\020\n\010user" +
      "Name\030\001 \001(\t\022\021\n\tprojectId\030\002 \001(\t\"g\n\026GetAllD" +
      "ailyScheduleRes\022\014\n\004date\030\001 \001(\t\022\021\n\tidbackl" +
      "og\030\002 \001(\t\022\014\n\004task\030\003 \001(\t\022\016\n\006status\030\004 \001(\t\022\016" +
      "\n\006review\030\005 \001(\t2\255\003\n\rDailyschedule\022e\n\023addN" +
      "ewDailySchedule\022%.dailyschedule.AddNewDa" +
      "ilyScheduleReq\032%.dailyschedule.AddNewDai" +
      "lyScheduleRes\"\000\022e\n\023updateDailySchedule\022%" +
      ".dailyschedule.UpdateDailyScheduleReq\032%." +
      "dailyschedule.UpdateDailyScheduleRes\"\000\022e" +
      "\n\023deleteDailySchedule\022%.dailyschedule.De" +
      "leteDailyScheduleReq\032%.dailyschedule.Del" +
      "eteDailyScheduleRes\"\000\022g\n\023getAllDailySche" +
      "dule\022%.dailyschedule.GetAllDailySchedule" +
      "Req\032%.dailyschedule.GetAllDailyScheduleR" +
      "es\"\0000\001B(\n\020co.overlead.gRPCB\rdailyschedul" +
      "eP\001\242\002\002dsb\006proto3"
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
    internal_static_dailyschedule_AddNewDailyScheduleReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_dailyschedule_AddNewDailyScheduleReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dailyschedule_AddNewDailyScheduleReq_descriptor,
        new java.lang.String[] { "UserName", "ProjectId", "Date", "Idbacklog", "Task", "Status", "Review", });
    internal_static_dailyschedule_AddNewDailyScheduleRes_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_dailyschedule_AddNewDailyScheduleRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dailyschedule_AddNewDailyScheduleRes_descriptor,
        new java.lang.String[] { "Status", "DailyscheduleId", "Error", });
    internal_static_dailyschedule_UpdateDailyScheduleReq_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_dailyschedule_UpdateDailyScheduleReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dailyschedule_UpdateDailyScheduleReq_descriptor,
        new java.lang.String[] { "UserName", "ProjectId", "Date", "Idbacklog", "Task", "Status", "Review", });
    internal_static_dailyschedule_UpdateDailyScheduleRes_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_dailyschedule_UpdateDailyScheduleRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dailyschedule_UpdateDailyScheduleRes_descriptor,
        new java.lang.String[] { "Status", "Error", });
    internal_static_dailyschedule_DeleteDailyScheduleReq_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_dailyschedule_DeleteDailyScheduleReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dailyschedule_DeleteDailyScheduleReq_descriptor,
        new java.lang.String[] { "UserName", "ProjectId", "DailyscheduleId", });
    internal_static_dailyschedule_DeleteDailyScheduleRes_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_dailyschedule_DeleteDailyScheduleRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dailyschedule_DeleteDailyScheduleRes_descriptor,
        new java.lang.String[] { "Status", "Error", });
    internal_static_dailyschedule_GetAllDailyScheduleReq_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_dailyschedule_GetAllDailyScheduleReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dailyschedule_GetAllDailyScheduleReq_descriptor,
        new java.lang.String[] { "UserName", "ProjectId", });
    internal_static_dailyschedule_GetAllDailyScheduleRes_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_dailyschedule_GetAllDailyScheduleRes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_dailyschedule_GetAllDailyScheduleRes_descriptor,
        new java.lang.String[] { "Date", "Idbacklog", "Task", "Status", "Review", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
