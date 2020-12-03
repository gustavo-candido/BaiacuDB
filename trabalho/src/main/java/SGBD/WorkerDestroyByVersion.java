package SGBD;

import com.proto.baiacu.*;

import com.sun.xml.internal.bind.v2.TODO;
import java.util.HashMap;
import java.util.concurrent.Callable;

public class WorkerDestroyByVersion implements Callable<DestroyByVersionResponse> {
    private HashMap<Key, Value> hashMap;
    private DestroyByVersionRequest request;
    private DestroyByVersionResponse response;

    public WorkerDestroyByVersion(HashMap<Key, Value> hashMap, DestroyByVersionRequest request) {
        this.hashMap = hashMap;
        this.request = request;
    }

    public HashMap<Key, Value> getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap<Key, Value> hashMap) {
        this.hashMap = hashMap;
    }

    public DestroyByVersionRequest getRequest() {
        return request;
    }

    public void setRequest(DestroyByVersionRequest request) {
        this.request = request;
    }

//    TODO null
    @Override
    public DestroyByVersionResponse call() throws Exception {
        Key key = request.getKey();

        if (!hashMap.containsKey(key)) {
            return  DestroyByVersionResponse.newBuilder()
                .setStatus("ERROR_NE")
                .build();
        }

        Value value = hashMap.get(key);
        long version = value.getVersion();

        if (version != request.getVersion()) {
            return  DestroyByVersionResponse.newBuilder()
                .setStatus("ERROR_WV")
                .build();
        }

        hashMap.remove(key);

        return DestroyByVersionResponse.newBuilder()
            .setStatus("SUCCESS")
            .setValue(value)
            .build();
    }
}
