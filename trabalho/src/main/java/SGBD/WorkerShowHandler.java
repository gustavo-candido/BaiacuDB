package SGBD;

import com.baiacu.raft.RaftClientRunner;
import com.proto.baiacu.Key;
import com.proto.baiacu.ShowRequest;
import com.proto.baiacu.ShowResponse;
import com.proto.baiacu.Value;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class WorkerShowHandler implements Callable<ShowResponse> {
    private ShowRequest request;

    public WorkerShowHandler(ShowRequest request) {
        this.request = request;
    }

    public ShowRequest getRequest() {
        return request;
    }

    public void setRequest(ShowRequest request) {
        this.request = request;
    }

    @Override
    public ShowResponse call() throws Exception {
        Key key = request.getKey();
        RaftClientRunner client  = new RaftClientRunner();
        ShowResponse showResponse = client.get(key);
        return showResponse;
    }
}
