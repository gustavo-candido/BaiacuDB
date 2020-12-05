package SGBD.storage;

import java.io.IOException;
import java.util.HashMap;

public class exampleStorage {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        HashMap<Integer,Integer> m = new HashMap<Integer, Integer>();
        HashMap<Integer,Integer> n;
        StoreDiskService storeDiskService = new StoreDiskService();
        ReadDiskService readDiskService = new ReadDiskService();

        for(int i=0; i<5; i++) {
            m.put(i, 1<<i);
        }

        storeDiskService.run(m, "src/main/java/SGBD/storage/baiacu-disk-data");



        n = (HashMap<Integer, Integer>) readDiskService.run("src/main/java/SGBD/storage/baiacu-disk-data");

        System.out.println(n);
    }
}
