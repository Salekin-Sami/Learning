import java.io.*;
import java.util.Random;

public class RandomAccessFileExample {
    public static void main(String[] args) throws IOException {
        try (RandomAccessFile raf = new RandomAccessFile("numbers.txt", "rw")) {
            Random random = new Random();

            // Write 50 random numbers
            for (int i = 0; i < 50; i++) {
                int num = random.nextInt(51) + 100; // 100 to 150
                raf.writeInt(num);
            }

            // Read and modify a random number
            raf.seek(4 * 10); // 10th number (4 bytes per integer)
            int num = raf.readInt();
            System.out.println("Original 10th number: " + num);

            raf.seek(4 * 10);
            raf.writeInt(num + 10);
            System.out.println("Modified 10th number: " + (num + 10));
        }
    }
}