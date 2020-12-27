package SGBD;

import com.baiacu.raft.RaftClientRunner;
import com.proto.baiacu.*;

import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class WorkerStoreHandler implements Callable<StoreResponse> {
    private StoreRequest request;

    public WorkerStoreHandler(StoreRequest request) {
        this.request = request;
    }

    public StoreRequest getRequest() {
        return request;
    }

//    retorna a tupla (e,v') onde e=SUCCESS e v'=NULL se k-v foi inserido
//    retorna a tupla (e,v') onde e=ERROR e v'=(ver,ts,data) se já existia uma entrada no banco de dados com a chave k e vers, ts e data correspondem, respectivamente, à versão, timestamp e dados de tal entrada

    @Override
    public StoreResponse call() throws Exception {
        Key key = request.getKeyValue().getKey();

        RaftClientRunner client  = new RaftClientRunner();

        Value reqData = request.getKeyValue().getValue();

        Value value = Value.newBuilder()
            .setVersion(1)
            .setData(reqData.getData())
            .setTimestamp(reqData.getTimestamp())
            .build();


        StoreResponse response = client.add(key,value);
        return response;
    }
}
