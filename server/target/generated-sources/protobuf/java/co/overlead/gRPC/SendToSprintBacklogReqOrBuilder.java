// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: productbacklog.proto

package co.overlead.gRPC;

public interface SendToSprintBacklogReqOrBuilder extends
    // @@protoc_insertion_point(interface_extends:productbacklog.SendToSprintBacklogReq)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string userName = 1;</code>
   */
  java.lang.String getUserName();
  /**
   * <code>string userName = 1;</code>
   */
  com.google.protobuf.ByteString
      getUserNameBytes();

  /**
   * <code>string projectId = 2;</code>
   */
  java.lang.String getProjectId();
  /**
   * <code>string projectId = 2;</code>
   */
  com.google.protobuf.ByteString
      getProjectIdBytes();

  /**
   * <code>string productbacklogId = 3;</code>
   */
  java.lang.String getProductbacklogId();
  /**
   * <code>string productbacklogId = 3;</code>
   */
  com.google.protobuf.ByteString
      getProductbacklogIdBytes();

  /**
   * <pre>
   *return in form mm/hh/dd/mm/yyyy       phut/gio/ngay/thang/nam
   * </pre>
   *
   * <code>string start = 4;</code>
   */
  java.lang.String getStart();
  /**
   * <pre>
   *return in form mm/hh/dd/mm/yyyy       phut/gio/ngay/thang/nam
   * </pre>
   *
   * <code>string start = 4;</code>
   */
  com.google.protobuf.ByteString
      getStartBytes();

  /**
   * <pre>
   *return in form mm/hh/dd/mm/yyyy 	
   * </pre>
   *
   * <code>string deadline = 5;</code>
   */
  java.lang.String getDeadline();
  /**
   * <pre>
   *return in form mm/hh/dd/mm/yyyy 	
   * </pre>
   *
   * <code>string deadline = 5;</code>
   */
  com.google.protobuf.ByteString
      getDeadlineBytes();
}
