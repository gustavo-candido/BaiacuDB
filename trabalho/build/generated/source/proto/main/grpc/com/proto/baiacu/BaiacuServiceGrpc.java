package com.proto.baiacu;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: baiacu/baiacu.proto")
public final class BaiacuServiceGrpc {

  private BaiacuServiceGrpc() {}

  public static final String SERVICE_NAME = "baiacu.BaiacuService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.baiacu.StoreRequest,
      com.proto.baiacu.StoreResponse> getStoreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Store",
      requestType = com.proto.baiacu.StoreRequest.class,
      responseType = com.proto.baiacu.StoreResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.baiacu.StoreRequest,
      com.proto.baiacu.StoreResponse> getStoreMethod() {
    io.grpc.MethodDescriptor<com.proto.baiacu.StoreRequest, com.proto.baiacu.StoreResponse> getStoreMethod;
    if ((getStoreMethod = BaiacuServiceGrpc.getStoreMethod) == null) {
      synchronized (BaiacuServiceGrpc.class) {
        if ((getStoreMethod = BaiacuServiceGrpc.getStoreMethod) == null) {
          BaiacuServiceGrpc.getStoreMethod = getStoreMethod =
              io.grpc.MethodDescriptor.<com.proto.baiacu.StoreRequest, com.proto.baiacu.StoreResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Store"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.baiacu.StoreRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.baiacu.StoreResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BaiacuServiceMethodDescriptorSupplier("Store"))
              .build();
        }
      }
    }
    return getStoreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.baiacu.ShowRequest,
      com.proto.baiacu.ShowResponse> getShowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Show",
      requestType = com.proto.baiacu.ShowRequest.class,
      responseType = com.proto.baiacu.ShowResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.baiacu.ShowRequest,
      com.proto.baiacu.ShowResponse> getShowMethod() {
    io.grpc.MethodDescriptor<com.proto.baiacu.ShowRequest, com.proto.baiacu.ShowResponse> getShowMethod;
    if ((getShowMethod = BaiacuServiceGrpc.getShowMethod) == null) {
      synchronized (BaiacuServiceGrpc.class) {
        if ((getShowMethod = BaiacuServiceGrpc.getShowMethod) == null) {
          BaiacuServiceGrpc.getShowMethod = getShowMethod =
              io.grpc.MethodDescriptor.<com.proto.baiacu.ShowRequest, com.proto.baiacu.ShowResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Show"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.baiacu.ShowRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.baiacu.ShowResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BaiacuServiceMethodDescriptorSupplier("Show"))
              .build();
        }
      }
    }
    return getShowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.baiacu.DestroyRequest,
      com.proto.baiacu.DestroyResponse> getDestroyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Destroy",
      requestType = com.proto.baiacu.DestroyRequest.class,
      responseType = com.proto.baiacu.DestroyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.baiacu.DestroyRequest,
      com.proto.baiacu.DestroyResponse> getDestroyMethod() {
    io.grpc.MethodDescriptor<com.proto.baiacu.DestroyRequest, com.proto.baiacu.DestroyResponse> getDestroyMethod;
    if ((getDestroyMethod = BaiacuServiceGrpc.getDestroyMethod) == null) {
      synchronized (BaiacuServiceGrpc.class) {
        if ((getDestroyMethod = BaiacuServiceGrpc.getDestroyMethod) == null) {
          BaiacuServiceGrpc.getDestroyMethod = getDestroyMethod =
              io.grpc.MethodDescriptor.<com.proto.baiacu.DestroyRequest, com.proto.baiacu.DestroyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Destroy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.baiacu.DestroyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.baiacu.DestroyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BaiacuServiceMethodDescriptorSupplier("Destroy"))
              .build();
        }
      }
    }
    return getDestroyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.baiacu.DestroyByVersionRequest,
      com.proto.baiacu.DestroyByVersionResponse> getDestroyByVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DestroyByVersion",
      requestType = com.proto.baiacu.DestroyByVersionRequest.class,
      responseType = com.proto.baiacu.DestroyByVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.baiacu.DestroyByVersionRequest,
      com.proto.baiacu.DestroyByVersionResponse> getDestroyByVersionMethod() {
    io.grpc.MethodDescriptor<com.proto.baiacu.DestroyByVersionRequest, com.proto.baiacu.DestroyByVersionResponse> getDestroyByVersionMethod;
    if ((getDestroyByVersionMethod = BaiacuServiceGrpc.getDestroyByVersionMethod) == null) {
      synchronized (BaiacuServiceGrpc.class) {
        if ((getDestroyByVersionMethod = BaiacuServiceGrpc.getDestroyByVersionMethod) == null) {
          BaiacuServiceGrpc.getDestroyByVersionMethod = getDestroyByVersionMethod =
              io.grpc.MethodDescriptor.<com.proto.baiacu.DestroyByVersionRequest, com.proto.baiacu.DestroyByVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DestroyByVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.baiacu.DestroyByVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.baiacu.DestroyByVersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BaiacuServiceMethodDescriptorSupplier("DestroyByVersion"))
              .build();
        }
      }
    }
    return getDestroyByVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.baiacu.TestAndSetRequest,
      com.proto.baiacu.TestAndSetResponse> getTestAndSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "testAndSet",
      requestType = com.proto.baiacu.TestAndSetRequest.class,
      responseType = com.proto.baiacu.TestAndSetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.baiacu.TestAndSetRequest,
      com.proto.baiacu.TestAndSetResponse> getTestAndSetMethod() {
    io.grpc.MethodDescriptor<com.proto.baiacu.TestAndSetRequest, com.proto.baiacu.TestAndSetResponse> getTestAndSetMethod;
    if ((getTestAndSetMethod = BaiacuServiceGrpc.getTestAndSetMethod) == null) {
      synchronized (BaiacuServiceGrpc.class) {
        if ((getTestAndSetMethod = BaiacuServiceGrpc.getTestAndSetMethod) == null) {
          BaiacuServiceGrpc.getTestAndSetMethod = getTestAndSetMethod =
              io.grpc.MethodDescriptor.<com.proto.baiacu.TestAndSetRequest, com.proto.baiacu.TestAndSetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "testAndSet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.baiacu.TestAndSetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.baiacu.TestAndSetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BaiacuServiceMethodDescriptorSupplier("testAndSet"))
              .build();
        }
      }
    }
    return getTestAndSetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BaiacuServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BaiacuServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BaiacuServiceStub>() {
        @java.lang.Override
        public BaiacuServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BaiacuServiceStub(channel, callOptions);
        }
      };
    return BaiacuServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BaiacuServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BaiacuServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BaiacuServiceBlockingStub>() {
        @java.lang.Override
        public BaiacuServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BaiacuServiceBlockingStub(channel, callOptions);
        }
      };
    return BaiacuServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BaiacuServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BaiacuServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BaiacuServiceFutureStub>() {
        @java.lang.Override
        public BaiacuServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BaiacuServiceFutureStub(channel, callOptions);
        }
      };
    return BaiacuServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class BaiacuServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void store(com.proto.baiacu.StoreRequest request,
        io.grpc.stub.StreamObserver<com.proto.baiacu.StoreResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStoreMethod(), responseObserver);
    }

    /**
     */
    public void show(com.proto.baiacu.ShowRequest request,
        io.grpc.stub.StreamObserver<com.proto.baiacu.ShowResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getShowMethod(), responseObserver);
    }

    /**
     */
    public void destroy(com.proto.baiacu.DestroyRequest request,
        io.grpc.stub.StreamObserver<com.proto.baiacu.DestroyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDestroyMethod(), responseObserver);
    }

    /**
     */
    public void destroyByVersion(com.proto.baiacu.DestroyByVersionRequest request,
        io.grpc.stub.StreamObserver<com.proto.baiacu.DestroyByVersionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDestroyByVersionMethod(), responseObserver);
    }

    /**
     */
    public void testAndSet(com.proto.baiacu.TestAndSetRequest request,
        io.grpc.stub.StreamObserver<com.proto.baiacu.TestAndSetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTestAndSetMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStoreMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.baiacu.StoreRequest,
                com.proto.baiacu.StoreResponse>(
                  this, METHODID_STORE)))
          .addMethod(
            getShowMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.baiacu.ShowRequest,
                com.proto.baiacu.ShowResponse>(
                  this, METHODID_SHOW)))
          .addMethod(
            getDestroyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.baiacu.DestroyRequest,
                com.proto.baiacu.DestroyResponse>(
                  this, METHODID_DESTROY)))
          .addMethod(
            getDestroyByVersionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.baiacu.DestroyByVersionRequest,
                com.proto.baiacu.DestroyByVersionResponse>(
                  this, METHODID_DESTROY_BY_VERSION)))
          .addMethod(
            getTestAndSetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.baiacu.TestAndSetRequest,
                com.proto.baiacu.TestAndSetResponse>(
                  this, METHODID_TEST_AND_SET)))
          .build();
    }
  }

  /**
   */
  public static final class BaiacuServiceStub extends io.grpc.stub.AbstractAsyncStub<BaiacuServiceStub> {
    private BaiacuServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BaiacuServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BaiacuServiceStub(channel, callOptions);
    }

    /**
     */
    public void store(com.proto.baiacu.StoreRequest request,
        io.grpc.stub.StreamObserver<com.proto.baiacu.StoreResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStoreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void show(com.proto.baiacu.ShowRequest request,
        io.grpc.stub.StreamObserver<com.proto.baiacu.ShowResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getShowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void destroy(com.proto.baiacu.DestroyRequest request,
        io.grpc.stub.StreamObserver<com.proto.baiacu.DestroyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDestroyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void destroyByVersion(com.proto.baiacu.DestroyByVersionRequest request,
        io.grpc.stub.StreamObserver<com.proto.baiacu.DestroyByVersionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDestroyByVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void testAndSet(com.proto.baiacu.TestAndSetRequest request,
        io.grpc.stub.StreamObserver<com.proto.baiacu.TestAndSetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTestAndSetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BaiacuServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<BaiacuServiceBlockingStub> {
    private BaiacuServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BaiacuServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BaiacuServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.baiacu.StoreResponse store(com.proto.baiacu.StoreRequest request) {
      return blockingUnaryCall(
          getChannel(), getStoreMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.baiacu.ShowResponse show(com.proto.baiacu.ShowRequest request) {
      return blockingUnaryCall(
          getChannel(), getShowMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.baiacu.DestroyResponse destroy(com.proto.baiacu.DestroyRequest request) {
      return blockingUnaryCall(
          getChannel(), getDestroyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.baiacu.DestroyByVersionResponse destroyByVersion(com.proto.baiacu.DestroyByVersionRequest request) {
      return blockingUnaryCall(
          getChannel(), getDestroyByVersionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.baiacu.TestAndSetResponse testAndSet(com.proto.baiacu.TestAndSetRequest request) {
      return blockingUnaryCall(
          getChannel(), getTestAndSetMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BaiacuServiceFutureStub extends io.grpc.stub.AbstractFutureStub<BaiacuServiceFutureStub> {
    private BaiacuServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BaiacuServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BaiacuServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.baiacu.StoreResponse> store(
        com.proto.baiacu.StoreRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStoreMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.baiacu.ShowResponse> show(
        com.proto.baiacu.ShowRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getShowMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.baiacu.DestroyResponse> destroy(
        com.proto.baiacu.DestroyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDestroyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.baiacu.DestroyByVersionResponse> destroyByVersion(
        com.proto.baiacu.DestroyByVersionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDestroyByVersionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.baiacu.TestAndSetResponse> testAndSet(
        com.proto.baiacu.TestAndSetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTestAndSetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_STORE = 0;
  private static final int METHODID_SHOW = 1;
  private static final int METHODID_DESTROY = 2;
  private static final int METHODID_DESTROY_BY_VERSION = 3;
  private static final int METHODID_TEST_AND_SET = 4;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BaiacuServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BaiacuServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STORE:
          serviceImpl.store((com.proto.baiacu.StoreRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.baiacu.StoreResponse>) responseObserver);
          break;
        case METHODID_SHOW:
          serviceImpl.show((com.proto.baiacu.ShowRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.baiacu.ShowResponse>) responseObserver);
          break;
        case METHODID_DESTROY:
          serviceImpl.destroy((com.proto.baiacu.DestroyRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.baiacu.DestroyResponse>) responseObserver);
          break;
        case METHODID_DESTROY_BY_VERSION:
          serviceImpl.destroyByVersion((com.proto.baiacu.DestroyByVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.baiacu.DestroyByVersionResponse>) responseObserver);
          break;
        case METHODID_TEST_AND_SET:
          serviceImpl.testAndSet((com.proto.baiacu.TestAndSetRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.baiacu.TestAndSetResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class BaiacuServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BaiacuServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.proto.baiacu.Baiacu.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BaiacuService");
    }
  }

  private static final class BaiacuServiceFileDescriptorSupplier
      extends BaiacuServiceBaseDescriptorSupplier {
    BaiacuServiceFileDescriptorSupplier() {}
  }

  private static final class BaiacuServiceMethodDescriptorSupplier
      extends BaiacuServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BaiacuServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (BaiacuServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BaiacuServiceFileDescriptorSupplier())
              .addMethod(getStoreMethod())
              .addMethod(getShowMethod())
              .addMethod(getDestroyMethod())
              .addMethod(getDestroyByVersionMethod())
              .addMethod(getTestAndSetMethod())
              .build();
        }
      }
    }
    return result;
  }
}
