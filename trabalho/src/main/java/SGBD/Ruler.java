package SGBD;

import com.proto.baiacu.*;

import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Ruler {
    private int MAX_T = 1;
    private HashMap<Key, Value> data = new HashMap<>();
    private ExecutorService pool = Executors.newFixedThreadPool(MAX_T);



    public HashMap<Key, Value> getData() {
        return data;
    }

    public void setData(
        HashMap<Key, Value> data) {
        this.data = data;
    }

    public StoreResponse storeHandler(StoreRequest request) throws InterruptedException {
//        System.out.println(request);
//        TimeUnit.SECONDS.sleep(20);
        Future<StoreResponse> submit = pool.submit(new WorkerStore(data, request));
        try {
            return submit.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
            return null;
        }
    }

    public ShowResponse showHandler(ShowRequest request)
        throws ExecutionException, InterruptedException {
        TimeUnit.SECONDS.sleep(20);
        Future<ShowResponse> submit = pool.submit(new WorkerShow(data, request));
        try {
            return submit.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }


    }

    public DestroyResponse destroyHandler(DestroyRequest request) throws ExecutionException {
        Future<DestroyResponse> submit = pool.submit(new WorkerDestroy(data, request));
        try {
            return submit.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }


    }

    public DestroyByVersionResponse destroyByVersionHandler(DestroyByVersionRequest request){
        Future<DestroyByVersionResponse> submit = pool.submit(new WorkerDestroyByVersion(data, request));
        try {
            return submit.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
            return null;
        }
    }

    public TestAndSetResponse testAndSetHandler(TestAndSetRequest request) {
        Future<TestAndSetResponse> submit = pool.submit(new WorkerTestAndSet(data, request));
        try {
            return submit.get();
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
            return null;
        }
    }
}
