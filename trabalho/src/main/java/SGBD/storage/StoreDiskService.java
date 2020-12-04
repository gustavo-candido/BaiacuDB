package SGBD.storage;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StoreDiskService {
    public void run(Object obj, String file_path) throws IOException {
        FileOutputStream fileToStore = new FileOutputStream(file_path);
        ObjectOutputStream outputStream = new ObjectOutputStream(fileToStore);

        outputStream.writeObject(obj);

        outputStream.close();
        fileToStore.close();
    }
}
