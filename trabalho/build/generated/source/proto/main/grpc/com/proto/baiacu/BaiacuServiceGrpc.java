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
  private static volatile io.grpc.MethodDescriptor<com.proto.baiacu.storeRequest,
      com.proto.baiacu.storeResponse> getStoreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Store",
      requestType = com.proto.baiacu.storeRequest.class,
      responseType = com.proto.baiacu.storeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.baiacu.storeRequest,
      com.proto.baiacu.storeResponse> getStoreMethod() {
    io.grpc.MethodDescriptor<com.proto.baiacu.storeRequest, com.proto.baiacu.storeResponse> getStoreMethod;
    if ((getStoreMethod = BaiacuServiceGrpc.getStoreMethod) == null) {
      synchronized (BaiacuServiceGrpc.class) {
        if ((getStoreMethod = BaiacuServiceGrpc.getStoreMethod) == null) {
          BaiacuServiceGrpc.getStoreMethod = getStoreMethod =
              io.grpc.MethodDescriptor.<com.proto.baiacu.storeRequest, com.proto.baiacu.storeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Store"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.baiacu.storeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.baiacu.storeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BaiacuServiceMethodDescriptorSupplier("Store"))
              .build();
        }
      }
    }
    return getStoreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.baiacu.showRequest,
      com.proto.baiacu.showResponse> getShowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Show",
      requestType = com.proto.baiacu.showRequest.class,
      responseType = com.proto.baiacu.showResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.baiacu.showRequest,
      com.proto.baiacu.showResponse> getShowMethod() {
    io.grpc.MethodDescriptor<com.proto.baiacu.showRequest, com.proto.baiacu.showResponse> getShowMethod;
    if ((getShowMethod = BaiacuServiceGrpc.getShowMethod) == null) {
      synchronized (BaiacuServiceGrpc.class) {
        if ((getShowMethod = BaiacuServiceGrpc.getShowMethod) == null) {
          BaiacuServiceGrpc.getShowMethod = getShowMethod =
              io.grpc.MethodDescriptor.<com.proto.baiacu.showRequest, com.proto.baiacu.showResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Show"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.baiacu.showRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.baiacu.showResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BaiacuServiceMethodDescriptorSupplier("Show"))
              .build();
        }
      }
    }
    return getShowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.baiacu.destroyRequest,
      com.proto.baiacu.destroyResponse> getDestroyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Destroy",
      requestType = com.proto.baiacu.destroyRequest.class,
      responseType = com.proto.baiacu.destroyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.baiacu.destroyRequest,
      com.proto.baiacu.destroyResponse> getDestroyMethod() {
    io.grpc.MethodDescriptor<com.proto.baiacu.destroyRequest, com.proto.baiacu.destroyResponse> getDestroyMethod;
    if ((getDestroyMethod = BaiacuServiceGrpc.getDestroyMethod) == null) {
      synchronized (BaiacuServiceGrpc.class) {
        if ((getDestroyMethod = BaiacuServiceGrpc.getDestroyMethod) == null) {
          BaiacuServiceGrpc.getDestroyMethod = getDestroyMethod =
              io.grpc.MethodDescriptor.<com.proto.baiacu.destroyRequest, com.proto.baiacu.destroyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Destroy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.baiacu.destroyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.baiacu.destroyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BaiacuServiceMethodDescriptorSupplier("Destroy"))
              .build();
        }
      }
    }
    return getDestroyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.baiacu.destroyByVersionRequest,
      com.proto.baiacu.destroyByVersionResponse> getDestroyByVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DestroyByVersion",
      requestType = com.proto.baiacu.destroyByVersionRequest.class,
      responseType = com.proto.baiacu.destroyByVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.baiacu.destroyByVersionRequest,
      com.proto.baiacu.destroyByVersionResponse> getDestroyByVersionMethod() {
    io.grpc.MethodDescriptor<com.proto.baiacu.destroyByVersionRequest, com.proto.baiacu.destroyByVersionResponse> getDestroyByVersionMethod;
    if ((getDestroyByVersionMethod = BaiacuServiceGrpc.getDestroyByVersionMethod) == null) {
      synchronized (BaiacuServiceGrpc.class) {
        if ((getDestroyByVersionMethod = BaiacuServiceGrpc.getDestroyByVersionMethod) == null) {
          BaiacuServiceGrpc.getDestroyByVersionMethod = getDestroyByVersionMethod =
              io.grpc.MethodDescriptor.<com.proto.baiacu.destroyByVersionRequest, com.proto.baiacu.destroyByVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DestroyByVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.baiacu.destroyByVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.baiacu.destroyByVersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BaiacuServiceMethodDescriptorSupplier("DestroyByVersion"))
              .build();
        }
      }
    }
    return getDestroyByVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.baiacu.testAndSetRequest,
      com.proto.baiacu.testAndSetResponse> getTestAndSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "testAndSet",
      requestType = com.proto.baiacu.testAndSetRequest.class,
      responseType = com.proto.baiacu.testAndSetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.baiacu.testAndSetRequest,
      com.proto.baiacu.testAndSetResponse> getTestAndSetMethod() {
    io.grpc.MethodDescriptor<com.proto.baiacu.testAndSetRequest, com.proto.baiacu.testAndSetResponse> getTestAndSetMethod;
    if ((getTestAndSetMethod = BaiacuServiceGrpc.getTestAndSetMethod) == null) {
      synchronized (BaiacuServiceGrpc.class) {
        if ((getTestAndSetMethod = BaiacuServiceGrpc.getTestAndSetMethod) == null) {
          BaiacuServiceGrpc.getTestAndSetMethod = getTestAndSetMethod =
              io.grpc.MethodDescriptor.<com.proto.baiacu.testAndSetRequest, com.proto.baiacu.testAndSetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "testAndSet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.baiacu.testAndSetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.proto.baiacu.testAndSetResponse.getDefaultInstance()))
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
    public void store(com.proto.baiacu.storeRequest request,
        io.grpc.stub.StreamObserver<com.proto.baiacu.storeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStoreMethod(), responseObserver);
    }

    /**
     */
    public void show(com.proto.baiacu.showRequest request,
        io.grpc.stub.StreamObserver<com.proto.baiacu.showResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getShowMethod(), responseObserver);
    }

    /**
     */
    public void destroy(com.proto.baiacu.destroyRequest request,
        io.grpc.stub.StreamObserver<com.proto.baiacu.destroyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDestroyMethod(), responseObserver);
    }

    /**
     */
    public void destroyByVersion(com.proto.baiacu.destroyByVersionRequest request,
        io.grpc.stub.StreamObserver<com.proto.baiacu.destroyByVersionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDestroyByVersionMethod(), responseObserver);
    }

    /**
     */
    public void testAndSet(com.proto.baiacu.testAndSetRequest request,
        io.grpc.stub.StreamObserver<com.proto.baiacu.testAndSetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTestAndSetMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStoreMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.baiacu.storeRequest,
                com.proto.baiacu.storeResponse>(
                  this, METHODID_STORE)))
          .addMethod(
            getShowMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.baiacu.showRequest,
                com.proto.baiacu.showResponse>(
                  this, METHODID_SHOW)))
          .addMethod(
            getDestroyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.baiacu.destroyRequest,
                com.proto.baiacu.destroyResponse>(
                  this, METHODID_DESTROY)))
          .addMethod(
            getDestroyByVersionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.baiacu.destroyByVersionRequest,
                com.proto.baiacu.destroyByVersionResponse>(
                  this, METHODID_DESTROY_BY_VERSION)))
          .addMethod(
            getTestAndSetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.proto.baiacu.testAndSetRequest,
                com.proto.baiacu.testAndSetResponse>(
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
    public void store(com.proto.baiacu.storeRequest request,
        io.grpc.stub.StreamObserver<com.proto.baiacu.storeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStoreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void show(com.proto.baiacu.showRequest request,
        io.grpc.stub.StreamObserver<com.proto.baiacu.showResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getShowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void destroy(com.proto.baiacu.destroyRequest request,
        io.grpc.stub.StreamObserver<com.proto.baiacu.destroyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDestroyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void destroyByVersion(com.proto.baiacu.destroyByVersionRequest request,
        io.grpc.stub.StreamObserver<com.proto.baiacu.destroyByVersionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDestroyByVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void testAndSet(com.proto.baiacu.testAndSetRequest request,
        io.grpc.stub.StreamObserver<com.proto.baiacu.testAndSetResponse> responseObserver) {
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
    public com.proto.baiacu.storeResponse store(com.proto.baiacu.storeRequest request) {
      return blockingUnaryCall(
          getChannel(), getStoreMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.baiacu.showResponse show(com.proto.baiacu.showRequest request) {
      return blockingUnaryCall(
          getChannel(), getShowMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.baiacu.destroyResponse destroy(com.proto.baiacu.destroyRequest request) {
      return blockingUnaryCall(
          getChannel(), getDestroyMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.baiacu.destroyByVersionResponse destroyByVersion(com.proto.baiacu.destroyByVersionRequest request) {
      return blockingUnaryCall(
          getChannel(), getDestroyByVersionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.proto.baiacu.testAndSetResponse testAndSet(com.proto.baiacu.testAndSetRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<com.proto.baiacu.storeResponse> store(
        com.proto.baiacu.storeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStoreMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.baiacu.showResponse> show(
        com.proto.baiacu.showRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getShowMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.baiacu.destroyResponse> destroy(
        com.proto.baiacu.destroyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDestroyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.baiacu.destroyByVersionResponse> destroyByVersion(
        com.proto.baiacu.destroyByVersionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDestroyByVersionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.baiacu.testAndSetResponse> testAndSet(
        com.proto.baiacu.testAndSetRequest request) {
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
          serviceImpl.store((com.proto.baiacu.storeRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.baiacu.storeResponse>) responseObserver);
          break;
        case METHODID_SHOW:
          serviceImpl.show((com.proto.baiacu.showRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.baiacu.showResponse>) responseObserver);
          break;
        case METHODID_DESTROY:
          serviceImpl.destroy((com.proto.baiacu.destroyRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.baiacu.destroyResponse>) responseObserver);
          break;
        case METHODID_DESTROY_BY_VERSION:
          serviceImpl.destroyByVersion((com.proto.baiacu.destroyByVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.baiacu.destroyByVersionResponse>) responseObserver);
          break;
        case METHODID_TEST_AND_SET:
          serviceImpl.testAndSet((com.proto.baiacu.testAndSetRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.baiacu.testAndSetResponse>) responseObserver);
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
