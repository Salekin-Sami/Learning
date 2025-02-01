public class DesignPrinter {
    public static void main(String[] args) {
        printDesign();
    }

    public static void printDesign() {
        int height = 5; // Number of rows

        for (int i = 0; i < height; i++) {
            // Print leading dashes
            for (int j = height - i - 1; j > 0; j--) {
                System.out.print("-");
            }

            // Print the odd number for the current row
            int numberToPrint = 2 * i + 1; // This will generate 1, 3, 5, 7, 9
            for (int j = 0; j < numberToPrint; j++) {
                System.out.print(numberToPrint); // Print the current odd number
            }

            // Print trailing dashes
            for (int j = height - i - 1; j > 0; j--) {
                System.out.print("-");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
