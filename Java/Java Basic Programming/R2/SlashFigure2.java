public class SlashFigure2 {
    // Global constant for height
    public static final int HEIGHT = 7; // Change this to 4 for the other size

    public static void main(String[] args) {
        // Loop to generate the top half of the figure
        for (int i = 0; i < HEIGHT; i++) {
            // Print leading slashes
            for (int j = 0; j < i; j++) {
                System.out.print("\\");
            }

            // Print exclamation marks
            for (int j = 0; j < (2 * (HEIGHT - i) - 2); j++) {
                System.out.print("!");
            }

            // Print trailing slashes
            for (int j = 0; j < i; j++) {
                System.out.print("/");
            }

            // Move to the next line
            System.out.println();
        }
    }
}
