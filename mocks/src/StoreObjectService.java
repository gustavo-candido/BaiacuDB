import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Hashtable;

public class StoreObjectService {
    public static void main(String[] args) throws IOException {
        long time = System.nanoTime();
        System.out.println("Start program " + (System.nanoTime() - time)/1000000.0 + " milliseconds");
        FileOutputStream fileToStore = new FileOutputStream("./src/files/storeObject");
        System.out.println("Finish open file " + (System.nanoTime() - time)/1000000.0 + " milliseconds");
        ObjectOutputStream outputStream = new ObjectOutputStream(fileToStore);
        System.out.println("Finish open stream " + (System.nanoTime() - time)/1000000.0 + " milliseconds");

        Hashtable<Integer,Integer> m = new Hashtable<>();

        for(int i=0; i<1000000; i++) {
            m.put(i,i);
        }

        System.out.println("Finish create object " + (System.nanoTime() - time)/1000000.0 + " milliseconds");
        outputStream.writeObject(m);
        System.out.println("Finish store object " + (System.nanoTime() - time)/1000000.0 + " milliseconds");

        outputStream.close();
        fileToStore.close();

    }
}
