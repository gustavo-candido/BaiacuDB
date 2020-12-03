package com.baiacu.server;

import SGBD.Ruler;
import com.proto.baiacu.*;
import io.grpc.stub.StreamObserver;
import java.util.concurrent.ExecutionException;


public class BaiacuServiceImpl extends BaiacuServiceGrpc.BaiacuServiceImplBase  {
    private Ruler ruler;

    public BaiacuServiceImpl(Ruler ruler) {
        this.ruler = ruler;
    }


    @Override
    public void store(StoreRequest request, StreamObserver<StoreResponse> responseObserver) {
        Key key = request.getKeyValue().getKey();
        Value value = request.getKeyValue().getValue();

        StoreResponse response = StoreResponse.newBuilder()
                .setStatus("SUCESS")
                .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void show(ShowRequest request, StreamObserver<ShowResponse> responseObserver) {
        Key key = request.getKey();
        System.out.println("Cheguei");
        try {
            ShowResponse response = ruler.showHandler(request);
            responseObserver.onNext(response);
            responseObserver.onCompleted();
        } catch (Exception e) {
            System.out.println("Deu ruim na show");
        }
        System.out.println("Sai");

    }

    @Override
    public void destroy(DestroyRequest request, StreamObserver<DestroyResponse> responseObserver) {
        Key key = request.getKey();

        super.destroy(request, responseObserver);

        DestroyResponse response = DestroyResponse.newBuilder()
//           Todo .setValue()
            .setStatus("SUCCESS")
            .build();

        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void destroyByVersion(DestroyByVersionRequest request, StreamObserver<DestroyByVersionResponse> responseObserver) {
        super.destroyByVersion(request, responseObserver);
    }

    @Override
    public void testAndSet(TestAndSetRequest request, StreamObserver<TestAndSetResponse> responseObserver) {
        super.testAndSet(request, responseObserver);
    }

}
