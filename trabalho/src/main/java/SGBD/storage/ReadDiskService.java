package SGBD.storage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadDiskService {
    public Object run(String file_path) throws IOException, ClassNotFoundException {
        FileInputStream fileToRead = new FileInputStream(file_path);
        ObjectInputStream inputStream = new ObjectInputStream(fileToRead);

        Object obj = inputStream.readObject();
        inputStream.close();
        fileToRead.close();

        return obj;
    }
}
