public class StarFigure {
    public static void main(String[] args) {
        int totalLines = 5; // Total number of lines to print

        for (int i = 0; i < totalLines; i++) {
            // Print leading slashes
            for (int j = 0; j < totalLines - i - 1; j++) {
                System.out.print("/");
            }

            // Print stars
            for (int j = 0; j < (2 * i + 1); j++) {
                System.out.print("*");
            }

            // Print trailing slashes
            for (int j = 0; j < totalLines - i - 1; j++) {
                System.out.print("\\");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
