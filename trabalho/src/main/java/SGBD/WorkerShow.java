package SGBD;

import com.proto.baiacu.Key;
import com.proto.baiacu.ShowRequest;
import com.proto.baiacu.ShowResponse;
import com.proto.baiacu.Value;
import java.util.HashMap;
import java.util.concurrent.Callable;

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

    public ShowResponse getResponse() {
        return response;
    }

    public void setResponse(ShowResponse response) {
        this.response = response;
    }

    @Override
    public ShowResponse call() throws Exception {
        System.out.println("Rodei");
        return response;
    }
}
