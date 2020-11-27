package storage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;

public class ReadFileService {
    File file;

    public ReadFileService(String filePath) {
        this.file = new File(filePath);
    }

    public void run() {
        try {
            InputStream inputStream = new FileInputStream(file);
            Scanner sc = new Scanner(inputStream);
            String s = sc.nextLine();

            System.out.println(s);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
