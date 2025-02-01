public class CharacterPattern {
    public static void main(String[] args) {
        printOutput();
    }

    public static void printOutput() {
        // Print the first line of dashes
        for (int i = 0; i < 40; i++) {
            System.out.print("-");
        }
        System.out.println();

        // Print the second line with the pattern
        for (int i = 0; i < 40; i++) {
            if (i % 4 == 0) {
                System.out.print("_");
            } else if (i % 4 == 1) {
                System.out.print("-");
            } else if (i % 4 == 2) {
                System.out.print("^");
            } else {
                System.out.print("-");
            }
        }
        System.out.println();

        // Print the third line of numbers
        for (int i = 0; i < 40; i++) {
            System.out.print(i % 10); // Print digits 0-9 repeatedly
        }
        System.out.println();

        // Print the last line of dashes
        for (int i = 0; i < 40; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
