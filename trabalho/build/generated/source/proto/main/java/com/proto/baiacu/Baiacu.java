// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: baiacu/baiacu.proto

package com.proto.baiacu;

public final class Baiacu {
  private Baiacu() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_baiacu_KeyValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_baiacu_KeyValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_baiacu_storeRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_baiacu_storeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_baiacu_storeResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_baiacu_storeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_baiacu_showRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_baiacu_showRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_baiacu_showResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_baiacu_showResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_baiacu_destroyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_baiacu_destroyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_baiacu_destroyResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_baiacu_destroyResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_baiacu_destroyByVersionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_baiacu_destroyByVersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_baiacu_destroyByVersionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_baiacu_destroyByVersionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_baiacu_testAndSetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_baiacu_testAndSetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_baiacu_testAndSetResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_baiacu_testAndSetResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023baiacu/baiacu.proto\022\006baiacu\"<\n\010KeyValu" +
      "e\022\017\n\007version\030\001 \001(\003\022\021\n\ttimestamp\030\002 \001(\003\022\014\n" +
      "\004data\030\003 \001(\014\"2\n\014storeRequest\022\"\n\010keyValue\030" +
      "\001 \001(\0132\020.baiacu.KeyValue\"C\n\rstoreResponse" +
      "\022\016\n\006status\030\001 \001(\t\022\"\n\010keyValue\030\002 \001(\0132\020.bai" +
      "acu.KeyValue\"1\n\013showRequest\022\"\n\010keyValue\030" +
      "\001 \001(\0132\020.baiacu.KeyValue\"B\n\014showResponse\022" +
      "\016\n\006status\030\001 \001(\t\022\"\n\010keyValue\030\002 \001(\0132\020.baia" +
      "cu.KeyValue\"4\n\016destroyRequest\022\"\n\010keyValu" +
      "e\030\001 \001(\0132\020.baiacu.KeyValue\"E\n\017destroyResp" +
      "onse\022\016\n\006status\030\001 \001(\t\022\"\n\010keyValue\030\002 \001(\0132\020" +
      ".baiacu.KeyValue\"=\n\027destroyByVersionRequ" +
      "est\022\"\n\010keyValue\030\001 \001(\0132\020.baiacu.KeyValue\"" +
      "N\n\030destroyByVersionResponse\022\016\n\006status\030\001 " +
      "\001(\t\022\"\n\010keyValue\030\002 \001(\0132\020.baiacu.KeyValue\"" +
      "7\n\021testAndSetRequest\022\"\n\010keyValue\030\001 \001(\0132\020" +
      ".baiacu.KeyValue\"H\n\022testAndSetResponse\022\016" +
      "\n\006status\030\001 \001(\t\022\"\n\010keyValue\030\002 \001(\0132\020.baiac" +
      "u.KeyValue2\332\002\n\rBaiacuService\0226\n\005Store\022\024." +
      "baiacu.storeRequest\032\025.baiacu.storeRespon" +
      "se\"\000\0223\n\004Show\022\023.baiacu.showRequest\032\024.baia" +
      "cu.showResponse\"\000\022<\n\007Destroy\022\026.baiacu.de" +
      "stroyRequest\032\027.baiacu.destroyResponse\"\000\022" +
      "W\n\020DestroyByVersion\022\037.baiacu.destroyByVe" +
      "rsionRequest\032 .baiacu.destroyByVersionRe" +
      "sponse\"\000\022E\n\ntestAndSet\022\031.baiacu.testAndS" +
      "etRequest\032\032.baiacu.testAndSetResponse\"\000B" +
      "\024\n\020com.proto.baiacuP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_baiacu_KeyValue_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_baiacu_KeyValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_baiacu_KeyValue_descriptor,
        new java.lang.String[] { "Version", "Timestamp", "Data", });
    internal_static_baiacu_storeRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_baiacu_storeRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_baiacu_storeRequest_descriptor,
        new java.lang.String[] { "KeyValue", });
    internal_static_baiacu_storeResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_baiacu_storeResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_baiacu_storeResponse_descriptor,
        new java.lang.String[] { "Status", "KeyValue", });
    internal_static_baiacu_showRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_baiacu_showRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_baiacu_showRequest_descriptor,
        new java.lang.String[] { "KeyValue", });
    internal_static_baiacu_showResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_baiacu_showResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_baiacu_showResponse_descriptor,
        new java.lang.String[] { "Status", "KeyValue", });
    internal_static_baiacu_destroyRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_baiacu_destroyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_baiacu_destroyRequest_descriptor,
        new java.lang.String[] { "KeyValue", });
    internal_static_baiacu_destroyResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_baiacu_destroyResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_baiacu_destroyResponse_descriptor,
        new java.lang.String[] { "Status", "KeyValue", });
    internal_static_baiacu_destroyByVersionRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_baiacu_destroyByVersionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_baiacu_destroyByVersionRequest_descriptor,
        new java.lang.String[] { "KeyValue", });
    internal_static_baiacu_destroyByVersionResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_baiacu_destroyByVersionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_baiacu_destroyByVersionResponse_descriptor,
        new java.lang.String[] { "Status", "KeyValue", });
    internal_static_baiacu_testAndSetRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_baiacu_testAndSetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_baiacu_testAndSetRequest_descriptor,
        new java.lang.String[] { "KeyValue", });
    internal_static_baiacu_testAndSetResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_baiacu_testAndSetResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_baiacu_testAndSetResponse_descriptor,
        new java.lang.String[] { "Status", "KeyValue", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}