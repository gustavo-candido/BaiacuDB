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
    internal_static_baiacu_Key_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_baiacu_Key_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_baiacu_Value_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_baiacu_Value_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_baiacu_KeyValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_baiacu_KeyValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_baiacu_StoreRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_baiacu_StoreRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_baiacu_StoreResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_baiacu_StoreResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_baiacu_ShowRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_baiacu_ShowRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_baiacu_ShowResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_baiacu_ShowResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_baiacu_DestroyRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_baiacu_DestroyRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_baiacu_DestroyResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_baiacu_DestroyResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_baiacu_DestroyByVersionRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_baiacu_DestroyByVersionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_baiacu_DestroyByVersionResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_baiacu_DestroyByVersionResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_baiacu_TestAndSetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_baiacu_TestAndSetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_baiacu_TestAndSetResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_baiacu_TestAndSetResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023baiacu/baiacu.proto\022\006baiacu\"\022\n\003Key\022\013\n\003" +
      "key\030\001 \001(\t\"9\n\005Value\022\017\n\007version\030\002 \001(\003\022\021\n\tt" +
      "imestamp\030\003 \001(\003\022\014\n\004data\030\004 \001(\014\"B\n\010KeyValue" +
      "\022\030\n\003key\030\001 \001(\0132\013.baiacu.Key\022\034\n\005value\030\002 \001(" +
      "\0132\r.baiacu.Value\"2\n\014StoreRequest\022\"\n\010keyV" +
      "alue\030\001 \001(\0132\020.baiacu.KeyValue\"C\n\rStoreRes" +
      "ponse\022\016\n\006status\030\001 \001(\t\022\"\n\010keyValue\030\002 \001(\0132" +
      "\020.baiacu.KeyValue\"1\n\013ShowRequest\022\"\n\010keyV" +
      "alue\030\001 \001(\0132\020.baiacu.KeyValue\"B\n\014ShowResp" +
      "onse\022\016\n\006status\030\001 \001(\t\022\"\n\010keyValue\030\002 \001(\0132\020" +
      ".baiacu.KeyValue\"4\n\016DestroyRequest\022\"\n\010ke" +
      "yValue\030\001 \001(\0132\020.baiacu.KeyValue\"E\n\017Destro" +
      "yResponse\022\016\n\006status\030\001 \001(\t\022\"\n\010keyValue\030\002 " +
      "\001(\0132\020.baiacu.KeyValue\"=\n\027DestroyByVersio" +
      "nRequest\022\"\n\010keyValue\030\001 \001(\0132\020.baiacu.KeyV" +
      "alue\"N\n\030DestroyByVersionResponse\022\016\n\006stat" +
      "us\030\001 \001(\t\022\"\n\010keyValue\030\002 \001(\0132\020.baiacu.KeyV" +
      "alue\"7\n\021TestAndSetRequest\022\"\n\010keyValue\030\001 " +
      "\001(\0132\020.baiacu.KeyValue\"H\n\022TestAndSetRespo" +
      "nse\022\016\n\006status\030\001 \001(\t\022\"\n\010keyValue\030\002 \001(\0132\020." +
      "baiacu.KeyValue2\332\002\n\rBaiacuService\0226\n\005Sto" +
      "re\022\024.baiacu.StoreRequest\032\025.baiacu.StoreR" +
      "esponse\"\000\0223\n\004Show\022\023.baiacu.ShowRequest\032\024" +
      ".baiacu.ShowResponse\"\000\022<\n\007Destroy\022\026.baia" +
      "cu.DestroyRequest\032\027.baiacu.DestroyRespon" +
      "se\"\000\022W\n\020DestroyByVersion\022\037.baiacu.Destro" +
      "yByVersionRequest\032 .baiacu.DestroyByVers" +
      "ionResponse\"\000\022E\n\ntestAndSet\022\031.baiacu.Tes" +
      "tAndSetRequest\032\032.baiacu.TestAndSetRespon" +
      "se\"\000B\024\n\020com.proto.baiacuP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_baiacu_Key_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_baiacu_Key_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_baiacu_Key_descriptor,
        new java.lang.String[] { "Key", });
    internal_static_baiacu_Value_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_baiacu_Value_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_baiacu_Value_descriptor,
        new java.lang.String[] { "Version", "Timestamp", "Data", });
    internal_static_baiacu_KeyValue_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_baiacu_KeyValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_baiacu_KeyValue_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_baiacu_StoreRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_baiacu_StoreRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_baiacu_StoreRequest_descriptor,
        new java.lang.String[] { "KeyValue", });
    internal_static_baiacu_StoreResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_baiacu_StoreResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_baiacu_StoreResponse_descriptor,
        new java.lang.String[] { "Status", "KeyValue", });
    internal_static_baiacu_ShowRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_baiacu_ShowRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_baiacu_ShowRequest_descriptor,
        new java.lang.String[] { "KeyValue", });
    internal_static_baiacu_ShowResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_baiacu_ShowResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_baiacu_ShowResponse_descriptor,
        new java.lang.String[] { "Status", "KeyValue", });
    internal_static_baiacu_DestroyRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_baiacu_DestroyRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_baiacu_DestroyRequest_descriptor,
        new java.lang.String[] { "KeyValue", });
    internal_static_baiacu_DestroyResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_baiacu_DestroyResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_baiacu_DestroyResponse_descriptor,
        new java.lang.String[] { "Status", "KeyValue", });
    internal_static_baiacu_DestroyByVersionRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_baiacu_DestroyByVersionRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_baiacu_DestroyByVersionRequest_descriptor,
        new java.lang.String[] { "KeyValue", });
    internal_static_baiacu_DestroyByVersionResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_baiacu_DestroyByVersionResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_baiacu_DestroyByVersionResponse_descriptor,
        new java.lang.String[] { "Status", "KeyValue", });
    internal_static_baiacu_TestAndSetRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_baiacu_TestAndSetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_baiacu_TestAndSetRequest_descriptor,
        new java.lang.String[] { "KeyValue", });
    internal_static_baiacu_TestAndSetResponse_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_baiacu_TestAndSetResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_baiacu_TestAndSetResponse_descriptor,
        new java.lang.String[] { "Status", "KeyValue", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
