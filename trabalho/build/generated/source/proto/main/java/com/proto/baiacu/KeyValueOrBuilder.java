// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: baiacu/baiacu.proto

package com.proto.baiacu;

public interface KeyValueOrBuilder extends
    // @@protoc_insertion_point(interface_extends:baiacu.KeyValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 version = 1;</code>
   * @return The version.
   */
  long getVersion();

  /**
   * <code>int64 timestamp = 2;</code>
   * @return The timestamp.
   */
  long getTimestamp();

  /**
   * <pre>
   * o formato disso em java é ByteString
   * </pre>
   *
   * <code>bytes data = 3;</code>
   * @return The data.
   */
  com.google.protobuf.ByteString getData();
}
