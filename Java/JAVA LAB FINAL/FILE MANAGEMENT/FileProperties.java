import java.io.File;

public class FileProperties {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Sirajus Salekin Sami\\Desktop\\Programming\\Java\\JAVA LAB FINAL\\FILE MANAGEMENT\\example.txt");

        System.out.println("File Name: " + file.getName());
        System.out.println("Path: " + file.getAbsolutePath());
        System.out.println("Parent: " + file.getParent());
        System.out.println("Size: " + file.length() + " bytes");
        System.out.println("Last Modified: " + file.lastModified());
    }
}