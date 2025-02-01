import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileSizeReader {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\Sirajus Salekin Sami\\Desktop\\Programming\\Java\\JAVA LAB FINAL\\FILE MANAGEMENT\\example.txt");
        System.out.println("File size: " + file.length() + " bytes");

        int n = 10; // Number of bytes to read

        // Using FileInputStream
            FileInputStream fis = new FileInputStream(file);
            byte[] buffer = new byte[n];
            fis.read(buffer);
            System.out.println("FileInputStream Read: " + new String(buffer));
        
        // Using FileReader
            FileReader fr = new FileReader(file);
            char[] buffer1 = new char[n];
            fr.read(buffer1);
            System.out.println("FileReader Read: " + new String(buffer1));
        
    }
}