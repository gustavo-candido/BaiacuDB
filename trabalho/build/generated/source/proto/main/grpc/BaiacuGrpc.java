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
public final class BaiacuGrpc {

  private BaiacuGrpc() {}

  public static final String SERVICE_NAME = "Baiacu";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<BaiacuOuterClass.storeRequest,
      BaiacuOuterClass.storeResponse> getStoreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Store",
      requestType = BaiacuOuterClass.storeRequest.class,
      responseType = BaiacuOuterClass.storeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<BaiacuOuterClass.storeRequest,
      BaiacuOuterClass.storeResponse> getStoreMethod() {
    io.grpc.MethodDescriptor<BaiacuOuterClass.storeRequest, BaiacuOuterClass.storeResponse> getStoreMethod;
    if ((getStoreMethod = BaiacuGrpc.getStoreMethod) == null) {
      synchronized (BaiacuGrpc.class) {
        if ((getStoreMethod = BaiacuGrpc.getStoreMethod) == null) {
          BaiacuGrpc.getStoreMethod = getStoreMethod =
              io.grpc.MethodDescriptor.<BaiacuOuterClass.storeRequest, BaiacuOuterClass.storeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Store"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BaiacuOuterClass.storeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BaiacuOuterClass.storeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BaiacuMethodDescriptorSupplier("Store"))
              .build();
        }
      }
    }
    return getStoreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<BaiacuOuterClass.showRequest,
      BaiacuOuterClass.showResponse> getShowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Show",
      requestType = BaiacuOuterClass.showRequest.class,
      responseType = BaiacuOuterClass.showResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<BaiacuOuterClass.showRequest,
      BaiacuOuterClass.showResponse> getShowMethod() {
    io.grpc.MethodDescriptor<BaiacuOuterClass.showRequest, BaiacuOuterClass.showResponse> getShowMethod;
    if ((getShowMethod = BaiacuGrpc.getShowMethod) == null) {
      synchronized (BaiacuGrpc.class) {
        if ((getShowMethod = BaiacuGrpc.getShowMethod) == null) {
          BaiacuGrpc.getShowMethod = getShowMethod =
              io.grpc.MethodDescriptor.<BaiacuOuterClass.showRequest, BaiacuOuterClass.showResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Show"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BaiacuOuterClass.showRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BaiacuOuterClass.showResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BaiacuMethodDescriptorSupplier("Show"))
              .build();
        }
      }
    }
    return getShowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<BaiacuOuterClass.destroyRequest,
      BaiacuOuterClass.destroyResponse> getDestroyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Destroy",
      requestType = BaiacuOuterClass.destroyRequest.class,
      responseType = BaiacuOuterClass.destroyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<BaiacuOuterClass.destroyRequest,
      BaiacuOuterClass.destroyResponse> getDestroyMethod() {
    io.grpc.MethodDescriptor<BaiacuOuterClass.destroyRequest, BaiacuOuterClass.destroyResponse> getDestroyMethod;
    if ((getDestroyMethod = BaiacuGrpc.getDestroyMethod) == null) {
      synchronized (BaiacuGrpc.class) {
        if ((getDestroyMethod = BaiacuGrpc.getDestroyMethod) == null) {
          BaiacuGrpc.getDestroyMethod = getDestroyMethod =
              io.grpc.MethodDescriptor.<BaiacuOuterClass.destroyRequest, BaiacuOuterClass.destroyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Destroy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BaiacuOuterClass.destroyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BaiacuOuterClass.destroyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BaiacuMethodDescriptorSupplier("Destroy"))
              .build();
        }
      }
    }
    return getDestroyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<BaiacuOuterClass.destroyByVersionRequest,
      BaiacuOuterClass.destroyByVersionResponse> getDestroyByVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DestroyByVersion",
      requestType = BaiacuOuterClass.destroyByVersionRequest.class,
      responseType = BaiacuOuterClass.destroyByVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<BaiacuOuterClass.destroyByVersionRequest,
      BaiacuOuterClass.destroyByVersionResponse> getDestroyByVersionMethod() {
    io.grpc.MethodDescriptor<BaiacuOuterClass.destroyByVersionRequest, BaiacuOuterClass.destroyByVersionResponse> getDestroyByVersionMethod;
    if ((getDestroyByVersionMethod = BaiacuGrpc.getDestroyByVersionMethod) == null) {
      synchronized (BaiacuGrpc.class) {
        if ((getDestroyByVersionMethod = BaiacuGrpc.getDestroyByVersionMethod) == null) {
          BaiacuGrpc.getDestroyByVersionMethod = getDestroyByVersionMethod =
              io.grpc.MethodDescriptor.<BaiacuOuterClass.destroyByVersionRequest, BaiacuOuterClass.destroyByVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DestroyByVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BaiacuOuterClass.destroyByVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BaiacuOuterClass.destroyByVersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BaiacuMethodDescriptorSupplier("DestroyByVersion"))
              .build();
        }
      }
    }
    return getDestroyByVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<BaiacuOuterClass.testAndSetRequest,
      BaiacuOuterClass.testAndSetResponse> getTestAndSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "testAndSet",
      requestType = BaiacuOuterClass.testAndSetRequest.class,
      responseType = BaiacuOuterClass.testAndSetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<BaiacuOuterClass.testAndSetRequest,
      BaiacuOuterClass.testAndSetResponse> getTestAndSetMethod() {
    io.grpc.MethodDescriptor<BaiacuOuterClass.testAndSetRequest, BaiacuOuterClass.testAndSetResponse> getTestAndSetMethod;
    if ((getTestAndSetMethod = BaiacuGrpc.getTestAndSetMethod) == null) {
      synchronized (BaiacuGrpc.class) {
        if ((getTestAndSetMethod = BaiacuGrpc.getTestAndSetMethod) == null) {
          BaiacuGrpc.getTestAndSetMethod = getTestAndSetMethod =
              io.grpc.MethodDescriptor.<BaiacuOuterClass.testAndSetRequest, BaiacuOuterClass.testAndSetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "testAndSet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BaiacuOuterClass.testAndSetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  BaiacuOuterClass.testAndSetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BaiacuMethodDescriptorSupplier("testAndSet"))
              .build();
        }
      }
    }
    return getTestAndSetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BaiacuStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BaiacuStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BaiacuStub>() {
        @java.lang.Override
        public BaiacuStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BaiacuStub(channel, callOptions);
        }
      };
    return BaiacuStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BaiacuBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BaiacuBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BaiacuBlockingStub>() {
        @java.lang.Override
        public BaiacuBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BaiacuBlockingStub(channel, callOptions);
        }
      };
    return BaiacuBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BaiacuFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BaiacuFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BaiacuFutureStub>() {
        @java.lang.Override
        public BaiacuFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BaiacuFutureStub(channel, callOptions);
        }
      };
    return BaiacuFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class BaiacuImplBase implements io.grpc.BindableService {

    /**
     */
    public void store(BaiacuOuterClass.storeRequest request,
        io.grpc.stub.StreamObserver<BaiacuOuterClass.storeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStoreMethod(), responseObserver);
    }

    /**
     */
    public void show(BaiacuOuterClass.showRequest request,
        io.grpc.stub.StreamObserver<BaiacuOuterClass.showResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getShowMethod(), responseObserver);
    }

    /**
     */
    public void destroy(BaiacuOuterClass.destroyRequest request,
        io.grpc.stub.StreamObserver<BaiacuOuterClass.destroyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDestroyMethod(), responseObserver);
    }

    /**
     */
    public void destroyByVersion(BaiacuOuterClass.destroyByVersionRequest request,
        io.grpc.stub.StreamObserver<BaiacuOuterClass.destroyByVersionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDestroyByVersionMethod(), responseObserver);
    }

    /**
     */
    public void testAndSet(BaiacuOuterClass.testAndSetRequest request,
        io.grpc.stub.StreamObserver<BaiacuOuterClass.testAndSetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTestAndSetMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStoreMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                BaiacuOuterClass.storeRequest,
                BaiacuOuterClass.storeResponse>(
                  this, METHODID_STORE)))
          .addMethod(
            getShowMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                BaiacuOuterClass.showRequest,
                BaiacuOuterClass.showResponse>(
                  this, METHODID_SHOW)))
          .addMethod(
            getDestroyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                BaiacuOuterClass.destroyRequest,
                BaiacuOuterClass.destroyResponse>(
                  this, METHODID_DESTROY)))
          .addMethod(
            getDestroyByVersionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                BaiacuOuterClass.destroyByVersionRequest,
                BaiacuOuterClass.destroyByVersionResponse>(
                  this, METHODID_DESTROY_BY_VERSION)))
          .addMethod(
            getTestAndSetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                BaiacuOuterClass.testAndSetRequest,
                BaiacuOuterClass.testAndSetResponse>(
                  this, METHODID_TEST_AND_SET)))
          .build();
    }
  }

  /**
   */
  public static final class BaiacuStub extends io.grpc.stub.AbstractAsyncStub<BaiacuStub> {
    private BaiacuStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BaiacuStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BaiacuStub(channel, callOptions);
    }

    /**
     */
    public void store(BaiacuOuterClass.storeRequest request,
        io.grpc.stub.StreamObserver<BaiacuOuterClass.storeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStoreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void show(BaiacuOuterClass.showRequest request,
        io.grpc.stub.StreamObserver<BaiacuOuterClass.showResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getShowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void destroy(BaiacuOuterClass.destroyRequest request,
        io.grpc.stub.StreamObserver<BaiacuOuterClass.destroyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDestroyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void destroyByVersion(BaiacuOuterClass.destroyByVersionRequest request,
        io.grpc.stub.StreamObserver<BaiacuOuterClass.destroyByVersionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDestroyByVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void testAndSet(BaiacuOuterClass.testAndSetRequest request,
        io.grpc.stub.StreamObserver<BaiacuOuterClass.testAndSetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTestAndSetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BaiacuBlockingStub extends io.grpc.stub.AbstractBlockingStub<BaiacuBlockingStub> {
    private BaiacuBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BaiacuBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BaiacuBlockingStub(channel, callOptions);
    }

    /**
     */
    public BaiacuOuterClass.storeResponse store(BaiacuOuterClass.storeRequest request) {
      return blockingUnaryCall(
          getChannel(), getStoreMethod(), getCallOptions(), request);
    }

    /**
     */
    public BaiacuOuterClass.showResponse show(BaiacuOuterClass.showRequest request) {
      return blockingUnaryCall(
          getChannel(), getShowMethod(), getCallOptions(), request);
    }

    /**
     */
    public BaiacuOuterClass.destroyResponse destroy(BaiacuOuterClass.destroyRequest request) {
      return blockingUnaryCall(
          getChannel(), getDestroyMethod(), getCallOptions(), request);
    }

    /**
     */
    public BaiacuOuterClass.destroyByVersionResponse destroyByVersion(BaiacuOuterClass.destroyByVersionRequest request) {
      return blockingUnaryCall(
          getChannel(), getDestroyByVersionMethod(), getCallOptions(), request);
    }

    /**
     */
    public BaiacuOuterClass.testAndSetResponse testAndSet(BaiacuOuterClass.testAndSetRequest request) {
      return blockingUnaryCall(
          getChannel(), getTestAndSetMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BaiacuFutureStub extends io.grpc.stub.AbstractFutureStub<BaiacuFutureStub> {
    private BaiacuFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BaiacuFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BaiacuFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<BaiacuOuterClass.storeResponse> store(
        BaiacuOuterClass.storeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStoreMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<BaiacuOuterClass.showResponse> show(
        BaiacuOuterClass.showRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getShowMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<BaiacuOuterClass.destroyResponse> destroy(
        BaiacuOuterClass.destroyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDestroyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<BaiacuOuterClass.destroyByVersionResponse> destroyByVersion(
        BaiacuOuterClass.destroyByVersionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDestroyByVersionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<BaiacuOuterClass.testAndSetResponse> testAndSet(
        BaiacuOuterClass.testAndSetRequest request) {
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
    private final BaiacuImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BaiacuImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_STORE:
          serviceImpl.store((BaiacuOuterClass.storeRequest) request,
              (io.grpc.stub.StreamObserver<BaiacuOuterClass.storeResponse>) responseObserver);
          break;
        case METHODID_SHOW:
          serviceImpl.show((BaiacuOuterClass.showRequest) request,
              (io.grpc.stub.StreamObserver<BaiacuOuterClass.showResponse>) responseObserver);
          break;
        case METHODID_DESTROY:
          serviceImpl.destroy((BaiacuOuterClass.destroyRequest) request,
              (io.grpc.stub.StreamObserver<BaiacuOuterClass.destroyResponse>) responseObserver);
          break;
        case METHODID_DESTROY_BY_VERSION:
          serviceImpl.destroyByVersion((BaiacuOuterClass.destroyByVersionRequest) request,
              (io.grpc.stub.StreamObserver<BaiacuOuterClass.destroyByVersionResponse>) responseObserver);
          break;
        case METHODID_TEST_AND_SET:
          serviceImpl.testAndSet((BaiacuOuterClass.testAndSetRequest) request,
              (io.grpc.stub.StreamObserver<BaiacuOuterClass.testAndSetResponse>) responseObserver);
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

  private static abstract class BaiacuBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BaiacuBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return BaiacuOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Baiacu");
    }
  }

  private static final class BaiacuFileDescriptorSupplier
      extends BaiacuBaseDescriptorSupplier {
    BaiacuFileDescriptorSupplier() {}
  }

  private static final class BaiacuMethodDescriptorSupplier
      extends BaiacuBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BaiacuMethodDescriptorSupplier(String methodName) {
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
      synchronized (BaiacuGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BaiacuFileDescriptorSupplier())
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
