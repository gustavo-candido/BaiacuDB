package SGBD;

import com.proto.baiacu.*;

import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class WorkerStore implements Callable<StoreResponse> {
    private HashMap<Key, Value> hashMap;
    private StoreRequest request;
    private StoreResponse response;

    public WorkerStore(HashMap<Key, Value> hashMap, StoreRequest request) {
        this.hashMap = hashMap;
        this.request = request;
    }

    public HashMap<Key, Value> getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap<Key, Value> hashMap) {
        this.hashMap = hashMap;
    }

    public StoreRequest getRequest() {
        return request;
    }

    public void setRequest(StoreRequest request) {
        this.request = request;
    }

//    retorna a tupla (e,v') onde e=SUCCESS e v'=NULL se k-v foi inserido
//    retorna a tupla (e,v') onde e=ERROR e v'=(ver,ts,data) se já existia uma entrada no banco de dados com a chave k e vers, ts e data correspondem, respectivamente, à versão, timestamp e dados de tal entrada
//    Todo: Null não tá dando certo

    @Override
    public StoreResponse call() throws Exception {
        Key key = request.getKeyValue().getKey();

        // já existe key
        if (hashMap.containsKey(key)) {
            return  StoreResponse.newBuilder()
                .setStatus("ERROR")
                .setValue(hashMap.get(key))
                .build();
        }

        Value reqData = request.getKeyValue().getValue();

        Value value = Value.newBuilder()
            .setVersion(1)
            .setData(reqData.getData())
            .setTimestamp(reqData.getTimestamp())
            .build();

        this.hashMap.put(key,value);

        return StoreResponse.newBuilder()
            .setStatus("SUCCESS")
            .build();
    }
}
