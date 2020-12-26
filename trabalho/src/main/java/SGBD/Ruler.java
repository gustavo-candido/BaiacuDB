package SGBD;

import SGBD.storage.ReadDiskService;
import com.proto.baiacu.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

public class Ruler {
    private int MAX_T = 8;
    private String FILE_PATH = "src/main/java/SGBD/storage/baiacu-disk-data";
    private long DISK_STORAGE_PERIOD = 3 * 1000; // 3 seg
    private HashMap<Key, Value> data;
    private ExecutorService pool = Executors.newFixedThreadPool(MAX_T);
    Semaphore sem = new Semaphore(1);


    public HashMap<Key, Value> getData() {
        return data;
    }

    public Ruler() throws IOException, ClassNotFoundException {
        ReadDiskService readDiskService = new ReadDiskService();
        data = (HashMap<Key, Value>) readDiskService.run(FILE_PATH);


        // TODO: Agora quem vai fazer escrita é o Ratis
        /*new Timer().scheduleAtFixedRate(new TimerTask(){
            @Override
            public void run(){
                StoreDiskService storeDiskService = new StoreDiskService();
                try {
                    storeDiskService.run(data, FILE_PATH);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        },0,DISK_STORAGE_PERIOD);*/
    }

    public void setData(
        HashMap<Key, Value> data) {
        this.data = data;
    }

    public StoreResponse storeHandler(StoreRequest request) throws InterruptedException {
        sem.acquire();
        Future<StoreResponse> submit = pool.submit(new WorkerStoreHandler(request));
        try {
            StoreResponse storeResponse = submit.get();



            sem.release();
            return storeResponse;
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
            sem.release();
            return null;
        }
    }

    public ShowResponse showHandler(ShowRequest request)
        throws ExecutionException, InterruptedException {
        sem.acquire();
        sem.release();
        Future<ShowResponse> submit = pool.submit(new WorkerShow(data, request));
        try {
            return submit.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public DestroyResponse destroyHandler(DestroyRequest request)
        throws ExecutionException, InterruptedException {
        sem.acquire();
        Future<DestroyResponse> submit = pool.submit(new WorkerDestroy(data, request));
        try {
            DestroyResponse destroyResponse = submit.get();
            sem.release();
            return destroyResponse;
        } catch (InterruptedException e) {
            e.printStackTrace();
            sem.release();
            return null;
        }
    }

    public DestroyByVersionResponse destroyByVersionHandler(DestroyByVersionRequest request)
        throws InterruptedException {
        sem.acquire();
        Future<DestroyByVersionResponse> submit = pool.submit(new WorkerDestroyByVersion(data, request));
        try {
            DestroyByVersionResponse destroyByVersionResponse = submit.get();
            sem.release();
            return destroyByVersionResponse;
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
            sem.release();
            return null;
        }
    }

    public TestAndSetResponse testAndSetHandler(TestAndSetRequest request)
        throws InterruptedException {
        Future<TestAndSetResponse> submit = pool.submit(new WorkerTestAndSet(data, request));
        sem.acquire();
        try {
            TestAndSetResponse testAndSetResponse = submit.get();
            sem.release();
            return testAndSetResponse;
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
            sem.release();
            return null;
        }
    }
}
