class SharedResource {
    synchronized void printNumbers() throws InterruptedException {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
            Thread.sleep(100);
        }
        System.out.println();
        notify();
        wait();
    }

    synchronized void printAlphabets() throws InterruptedException {
        for (char c = 'A'; c <= 'J'; c++) {
            System.out.print(c + " ");
            Thread.sleep(100);
        }
        System.out.println();
        notify();
        wait();
    }
}

public class SynchronizedExample {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        Thread t1 = new Thread(() -> {
            try {
                resource.printNumbers();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        Thread t2 = new Thread(() -> {
            try {
                resource.printAlphabets();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        });

        t1.start();
        t2.start();
    }
}