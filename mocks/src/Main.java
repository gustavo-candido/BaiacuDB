import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Timestamp;
import java.util.HashMap;
import storage.ReadFileService;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        long time = System.nanoTime();
        System.out.println("Start program " + (System.nanoTime() - time)/1000000.0 + " milliseconds");
        FileInputStream fileToRead = new FileInputStream("./src/files/storeObject");
        System.out.println("Finish open file " + (System.nanoTime() - time)/1000000.0 + " milliseconds");
        ObjectInputStream inputStream = new ObjectInputStream(fileToRead);
        System.out.println("Finish open stream " + (System.nanoTime() - time)/1000000.0 + " milliseconds");


        //noinspection unchecked
        HashMap<Integer,Integer> o = (HashMap<Integer, Integer>) inputStream.readObject();
        System.out.println("Finish read " + (System.nanoTime() - time)/1000000.0 + " milliseconds");
        System.out.println(o.get(3));
        inputStream.close();
        fileToRead.close();

    }
}
