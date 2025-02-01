import java.io.*;

public class FileMerger {
    public static void main(String[] args) throws IOException {
        try (
            FileInputStream fis1 = new FileInputStream("C:\\Users\\Sirajus Salekin Sami\\Desktop\\Programming\\File1.txt");
            FileInputStream fis2 = new FileInputStream("C:\\Users\\Sirajus Salekin Sami\\Desktop\\Programming\\File2.txt");
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Sirajus Salekin Sami\\Desktop\\Programming\\File3.txt")
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead;

            // Copy first half of File3.txt
            while ((bytesRead = fis1.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }

            // Copy last half of File3.txt
            while ((bytesRead = fis2.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
        }
        System.out.println("File3.txt created successfully!");
    }
}