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
//    Todo: Null não tá dando certo

    @Override
    public StoreResponse call() throws Exception {
        Key key = request.getKeyValue().getKey();

        RaftClientRunner client  = new RaftClientRunner();

        // já existe key
   /*     if (hashMap.containsKey(key)) {
            return  StoreResponse.newBuilder()
                .setStatus("ERROR")
                .setValue(hashMap.get(key))
                .build();
        }
*/

        Value reqData = request.getKeyValue().getValue();

        Value value = Value.newBuilder()
            .setVersion(0)
            .setData(reqData.getData())
            .setTimestamp(reqData.getTimestamp())
            .build();

        String keyString = key.getKey();
        String contentString = value.getData().toStringUtf8();
        String timestampString =  String.valueOf(value.getTimestamp());
        String versionString = String.valueOf(value.getVersion());

        StoreResponse response = client.add(keyString,contentString,timestampString,versionString);

        return response;
    }
}
