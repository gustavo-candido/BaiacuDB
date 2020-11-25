import io.grpc.stub.StreamObserver;

public class HelloWorldServiceImpl extends HelloWorldServiceGrpc.HelloWorldServiceImplBase {
    @Override
    public void hello(
            Helloworld.HelloRequest request,
            StreamObserver<Helloworld.HelloResponse> responseObserver) {
        System.out.println(
                "Handling hello endpoint: " + request.toString());


        String text = request.getText() + " World";
        Helloworld.HelloResponse response =
                Helloworld.HelloResponse.newBuilder()
                        .setText(text).build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
