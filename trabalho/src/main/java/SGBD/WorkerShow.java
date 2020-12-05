package SGBD;

import com.proto.baiacu.Key;
import com.proto.baiacu.ShowRequest;
import com.proto.baiacu.ShowResponse;
import com.proto.baiacu.Value;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class WorkerShow implements Callable<ShowResponse> {
    private HashMap<Key, Value> hashMap;
    private ShowRequest request;
    private ShowResponse response;

    public WorkerShow(HashMap<Key, Value> hashMap, ShowRequest request) {
        this.hashMap = hashMap;
        this.request = request;
    }

    public HashMap<Key, Value> getHashMap() {
        return hashMap;
    }

    public void setHashMap(HashMap<Key, Value> hashMap) {
        this.hashMap = hashMap;
    }

    public ShowRequest getRequest() {
        return request;
    }

    public void setRequest(ShowRequest request) {
        this.request = request;
    }

    @Override
    public ShowResponse call() throws Exception {
        Value value = this.hashMap.get(request.getKey());
        Key key = request.getKey();

        if (!hashMap.containsKey(key)) {
            return ShowResponse.newBuilder()
                .setStatus("ERROR")
                .build();
        }

        return ShowResponse.newBuilder()
            .setStatus("SUCCESS")
            .setValue(value)
            .build();
    }
}
