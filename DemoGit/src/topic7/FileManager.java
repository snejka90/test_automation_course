package topic7;

import java.io.*;

public class FileManager {
    static void writeToFile(String path, String data) {
        File file = new File(path);
        FileWriter writer = null;
        try {
            if(!file.exists())
                file.createNewFile();

            writer = new FileWriter(file);
            writer.write(data);
            writer.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    static void appendData(String path, String data) {
        FileWriter writer = null;
        try {
            writer = (FileWriter) new FileWriter(path).append(data);
            writer.append(data);
            writer.close();
        } catch (IOException e) {
            System.out.println(e.getStackTrace());
        }
    }

    static String readFile(String path) {
        FileReader reader = null;
        try {
            reader = new FileReader(path);
            return reader.toString();
        } catch (FileNotFoundException e) {
            System.out.println(e.getStackTrace());
        }
        return"";
    }
}
