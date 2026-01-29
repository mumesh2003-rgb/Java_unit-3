import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("data.txt");
        fw.write("Java File Handling Example");
        fw.close();
        System.out.println("File written successfully");
    }
}
