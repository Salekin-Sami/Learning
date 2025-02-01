public class BoxPattern {
    public static void main(String[] args) {
        // Number of boxes
        int boxes = 2;
        // Rows in each box
        int rowsInBox = 3;

        // Loop for each box
        for (int i = 0; i < boxes; i++) {
            // Top border
            System.out.println("+===+===+");

            // Rows inside the box
            for (int j = 0; j < rowsInBox; j++) {
                System.out.println("|   |   |");
            }
        }

        // Final bottom border
        System.out.println("+===+===+");
    }
}
