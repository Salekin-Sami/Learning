public class MultiTasking {
    public static void main(String[] args) {
        Thread task1 = new Thread(() -> {
            for (char c = 'a'; c <= 'z'; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        });

        Thread task2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                System.out.print("@ ");
            }
            System.out.println();
        });

        Thread task3 = new Thread(() -> {
            for (int i = 1; i <= 100; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        });

        task1.start();
        task2.start();
        task3.start();
    }
}