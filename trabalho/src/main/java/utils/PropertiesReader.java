package utils;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

public class PropertiesReader {

    public static void main (String[] args) throws IOException {

        PropertiesReader pr = new PropertiesReader();
        InputStream is = pr.getFileFromResourceAsStream("config.properties");
        Properties p = new Properties();
        p.load(is);
        String host = p.getProperty("host");
        String process1 = p.getProperty("process1");

        System.out.println(host);
        System.out.println(process1);

    }


    public InputStream getFileFromResourceAsStream(String fileName) {

        // The class loader that loaded the class
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream inputStream = classLoader.getResourceAsStream(fileName);

        // the stream holding the file content
        if (inputStream == null) {
            throw new IllegalArgumentException("file not found! " + fileName);
        } else {
            return inputStream;
        }
    }

    private static void printInputStream(InputStream is) {

        try (InputStreamReader streamReader =
                     new InputStreamReader(is, StandardCharsets.UTF_8);
             BufferedReader reader = new BufferedReader(streamReader)) {

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
