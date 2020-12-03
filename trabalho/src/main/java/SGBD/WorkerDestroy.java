package SGBD;

import com.proto.baiacu.*;

import java.util.HashMap;
import java.util.concurrent.Callable;

public class WorkerDestroy implements Callable<DestroyResponse> {
    private HashMap<Key, Value> hashMap;
    private DestroyRequest request;

    public WorkerDestroy(HashMap<Key, Value> hashMap, DestroyRequest request) {
        this.hashMap = hashMap;
        this.request = request;
    }

    public DestroyRequest getRequest() {
        return request;
    }

    public void setRequest(DestroyRequest request) {
        this.request = request;
    }

//    TODO: null
    @Override
    public DestroyResponse call() throws Exception {
        Key key = request.getKey();

        if ( !hashMap.containsKey(key)) {
            return  DestroyResponse.newBuilder()
                .setStatus("ERROR")
                .build();
        }

        Value value = hashMap.get(key);

        hashMap.remove(key);

        return DestroyResponse.newBuilder()
            .setStatus("SUCCESS")
            .setValue(value)
            .build();
    }
}
