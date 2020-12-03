package SGBD;

import com.google.protobuf.ByteString;
import com.proto.baiacu.Key;
import com.proto.baiacu.ShowRequest;
import com.proto.baiacu.ShowResponse;

import com.proto.baiacu.Value;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Ruler {
    static private int MAX_T = 1;
    private HashMap<Key, Value> data = new HashMap<Key, Value>();
    private ExecutorService pool = Executors.newFixedThreadPool(MAX_T);



    public HashMap<Key, Value> getData() {
        return data;
    }

    public void setData(
        HashMap<Key, Value> data) {
        this.data = data;
    }

    public void storeHandler() { }

    public ShowResponse showHandler(ShowRequest request)
        throws ExecutionException, InterruptedException {
        Future<ShowResponse> submit = pool.submit(new WorkerShow(data, request));

        try {
            return submit.get();
        } catch (InterruptedException e) {
            System.out.println("Deu errado no Ruler");
            e.printStackTrace();
            return null;
        }


    }

    public void destroyHandler() {
    }

    public void destroyByVersionHandler(){
    }

    public void testAndSetHandler() {
    }
}
