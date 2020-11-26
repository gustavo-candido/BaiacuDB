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

  public static final String SERVICE_NAME = "BaiacuService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<Baiacu.storeRequest,
      Baiacu.storeResponse> getStoreMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Store",
      requestType = Baiacu.storeRequest.class,
      responseType = Baiacu.storeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Baiacu.storeRequest,
      Baiacu.storeResponse> getStoreMethod() {
    io.grpc.MethodDescriptor<Baiacu.storeRequest, Baiacu.storeResponse> getStoreMethod;
    if ((getStoreMethod = BaiacuServiceGrpc.getStoreMethod) == null) {
      synchronized (BaiacuServiceGrpc.class) {
        if ((getStoreMethod = BaiacuServiceGrpc.getStoreMethod) == null) {
          BaiacuServiceGrpc.getStoreMethod = getStoreMethod =
              io.grpc.MethodDescriptor.<Baiacu.storeRequest, Baiacu.storeResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Store"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Baiacu.storeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Baiacu.storeResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BaiacuServiceMethodDescriptorSupplier("Store"))
              .build();
        }
      }
    }
    return getStoreMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Baiacu.showRequest,
      Baiacu.showResponse> getShowMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Show",
      requestType = Baiacu.showRequest.class,
      responseType = Baiacu.showResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Baiacu.showRequest,
      Baiacu.showResponse> getShowMethod() {
    io.grpc.MethodDescriptor<Baiacu.showRequest, Baiacu.showResponse> getShowMethod;
    if ((getShowMethod = BaiacuServiceGrpc.getShowMethod) == null) {
      synchronized (BaiacuServiceGrpc.class) {
        if ((getShowMethod = BaiacuServiceGrpc.getShowMethod) == null) {
          BaiacuServiceGrpc.getShowMethod = getShowMethod =
              io.grpc.MethodDescriptor.<Baiacu.showRequest, Baiacu.showResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Show"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Baiacu.showRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Baiacu.showResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BaiacuServiceMethodDescriptorSupplier("Show"))
              .build();
        }
      }
    }
    return getShowMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Baiacu.destroyRequest,
      Baiacu.destroyResponse> getDestroyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Destroy",
      requestType = Baiacu.destroyRequest.class,
      responseType = Baiacu.destroyResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Baiacu.destroyRequest,
      Baiacu.destroyResponse> getDestroyMethod() {
    io.grpc.MethodDescriptor<Baiacu.destroyRequest, Baiacu.destroyResponse> getDestroyMethod;
    if ((getDestroyMethod = BaiacuServiceGrpc.getDestroyMethod) == null) {
      synchronized (BaiacuServiceGrpc.class) {
        if ((getDestroyMethod = BaiacuServiceGrpc.getDestroyMethod) == null) {
          BaiacuServiceGrpc.getDestroyMethod = getDestroyMethod =
              io.grpc.MethodDescriptor.<Baiacu.destroyRequest, Baiacu.destroyResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Destroy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Baiacu.destroyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Baiacu.destroyResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BaiacuServiceMethodDescriptorSupplier("Destroy"))
              .build();
        }
      }
    }
    return getDestroyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Baiacu.destroyByVersionRequest,
      Baiacu.destroyByVersionResponse> getDestroyByVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DestroyByVersion",
      requestType = Baiacu.destroyByVersionRequest.class,
      responseType = Baiacu.destroyByVersionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Baiacu.destroyByVersionRequest,
      Baiacu.destroyByVersionResponse> getDestroyByVersionMethod() {
    io.grpc.MethodDescriptor<Baiacu.destroyByVersionRequest, Baiacu.destroyByVersionResponse> getDestroyByVersionMethod;
    if ((getDestroyByVersionMethod = BaiacuServiceGrpc.getDestroyByVersionMethod) == null) {
      synchronized (BaiacuServiceGrpc.class) {
        if ((getDestroyByVersionMethod = BaiacuServiceGrpc.getDestroyByVersionMethod) == null) {
          BaiacuServiceGrpc.getDestroyByVersionMethod = getDestroyByVersionMethod =
              io.grpc.MethodDescriptor.<Baiacu.destroyByVersionRequest, Baiacu.destroyByVersionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DestroyByVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Baiacu.destroyByVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Baiacu.destroyByVersionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BaiacuServiceMethodDescriptorSupplier("DestroyByVersion"))
              .build();
        }
      }
    }
    return getDestroyByVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<Baiacu.testAndSetRequest,
      Baiacu.testAndSetResponse> getTestAndSetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "testAndSet",
      requestType = Baiacu.testAndSetRequest.class,
      responseType = Baiacu.testAndSetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<Baiacu.testAndSetRequest,
      Baiacu.testAndSetResponse> getTestAndSetMethod() {
    io.grpc.MethodDescriptor<Baiacu.testAndSetRequest, Baiacu.testAndSetResponse> getTestAndSetMethod;
    if ((getTestAndSetMethod = BaiacuServiceGrpc.getTestAndSetMethod) == null) {
      synchronized (BaiacuServiceGrpc.class) {
        if ((getTestAndSetMethod = BaiacuServiceGrpc.getTestAndSetMethod) == null) {
          BaiacuServiceGrpc.getTestAndSetMethod = getTestAndSetMethod =
              io.grpc.MethodDescriptor.<Baiacu.testAndSetRequest, Baiacu.testAndSetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "testAndSet"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Baiacu.testAndSetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  Baiacu.testAndSetResponse.getDefaultInstance()))
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
    public void store(Baiacu.storeRequest request,
        io.grpc.stub.StreamObserver<Baiacu.storeResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStoreMethod(), responseObserver);
    }

    /**
     */
    public void show(Baiacu.showRequest request,
        io.grpc.stub.StreamObserver<Baiacu.showResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getShowMethod(), responseObserver);
    }

    /**
     */
    public void destroy(Baiacu.destroyRequest request,
        io.grpc.stub.StreamObserver<Baiacu.destroyResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDestroyMethod(), responseObserver);
    }

    /**
     */
    public void destroyByVersion(Baiacu.destroyByVersionRequest request,
        io.grpc.stub.StreamObserver<Baiacu.destroyByVersionResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDestroyByVersionMethod(), responseObserver);
    }

    /**
     */
    public void testAndSet(Baiacu.testAndSetRequest request,
        io.grpc.stub.StreamObserver<Baiacu.testAndSetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTestAndSetMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStoreMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Baiacu.storeRequest,
                Baiacu.storeResponse>(
                  this, METHODID_STORE)))
          .addMethod(
            getShowMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Baiacu.showRequest,
                Baiacu.showResponse>(
                  this, METHODID_SHOW)))
          .addMethod(
            getDestroyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Baiacu.destroyRequest,
                Baiacu.destroyResponse>(
                  this, METHODID_DESTROY)))
          .addMethod(
            getDestroyByVersionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Baiacu.destroyByVersionRequest,
                Baiacu.destroyByVersionResponse>(
                  this, METHODID_DESTROY_BY_VERSION)))
          .addMethod(
            getTestAndSetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                Baiacu.testAndSetRequest,
                Baiacu.testAndSetResponse>(
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
    public void store(Baiacu.storeRequest request,
        io.grpc.stub.StreamObserver<Baiacu.storeResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStoreMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void show(Baiacu.showRequest request,
        io.grpc.stub.StreamObserver<Baiacu.showResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getShowMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void destroy(Baiacu.destroyRequest request,
        io.grpc.stub.StreamObserver<Baiacu.destroyResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDestroyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void destroyByVersion(Baiacu.destroyByVersionRequest request,
        io.grpc.stub.StreamObserver<Baiacu.destroyByVersionResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDestroyByVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void testAndSet(Baiacu.testAndSetRequest request,
        io.grpc.stub.StreamObserver<Baiacu.testAndSetResponse> responseObserver) {
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
    public Baiacu.storeResponse store(Baiacu.storeRequest request) {
      return blockingUnaryCall(
          getChannel(), getStoreMethod(), getCallOptions(), request);
    }

    /**
     */
    public Baiacu.showResponse show(Baiacu.showRequest request) {
      return blockingUnaryCall(
          getChannel(), getShowMethod(), getCallOptions(), request);
    }

    /**
     */
    public Baiacu.destroyResponse destroy(Baiacu.destroyRequest request) {
      return blockingUnaryCall(
          getChannel(), getDestroyMethod(), getCallOptions(), request);
    }

    /**
     */
    public Baiacu.destroyByVersionResponse destroyByVersion(Baiacu.destroyByVersionRequest request) {
      return blockingUnaryCall(
          getChannel(), getDestroyByVersionMethod(), getCallOptions(), request);
    }

    /**
     */
    public Baiacu.testAndSetResponse testAndSet(Baiacu.testAndSetRequest request) {
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
    public com.google.common.util.concurrent.ListenableFuture<Baiacu.storeResponse> store(
        Baiacu.storeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStoreMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Baiacu.showResponse> show(
        Baiacu.showRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getShowMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Baiacu.destroyResponse> destroy(
        Baiacu.destroyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDestroyMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Baiacu.destroyByVersionResponse> destroyByVersion(
        Baiacu.destroyByVersionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDestroyByVersionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<Baiacu.testAndSetResponse> testAndSet(
        Baiacu.testAndSetRequest request) {
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
          serviceImpl.store((Baiacu.storeRequest) request,
              (io.grpc.stub.StreamObserver<Baiacu.storeResponse>) responseObserver);
          break;
        case METHODID_SHOW:
          serviceImpl.show((Baiacu.showRequest) request,
              (io.grpc.stub.StreamObserver<Baiacu.showResponse>) responseObserver);
          break;
        case METHODID_DESTROY:
          serviceImpl.destroy((Baiacu.destroyRequest) request,
              (io.grpc.stub.StreamObserver<Baiacu.destroyResponse>) responseObserver);
          break;
        case METHODID_DESTROY_BY_VERSION:
          serviceImpl.destroyByVersion((Baiacu.destroyByVersionRequest) request,
              (io.grpc.stub.StreamObserver<Baiacu.destroyByVersionResponse>) responseObserver);
          break;
        case METHODID_TEST_AND_SET:
          serviceImpl.testAndSet((Baiacu.testAndSetRequest) request,
              (io.grpc.stub.StreamObserver<Baiacu.testAndSetResponse>) responseObserver);
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
      return Baiacu.getDescriptor();
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
