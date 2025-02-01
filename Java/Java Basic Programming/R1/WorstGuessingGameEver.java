import javax.swing.*;

public class WorstGuessingGameEver {
    public static void main(String[] args) {
        int secretNumber = 4;  // Secret number stored in a variable
        String input = JOptionPane.showInputDialog("TEH WORST NUBMER GESSING GAME EVAR!!!!!!!1!\n"
                + "I'M THKING OF A NBR FROM 1-10. TRY 2 GESS!");
        
        int guess = Integer.parseInt(input);
        
        if (guess == secretNumber) {
            System.out.println("LOL!!! U GOT IT!  I CANT BELEIVE U GESSED IT WAS " + secretNumber + "!");
        } else {
            System.out.println("W00T!  U SUX0R!!!  I PWN J00!!!  IT WAS " + secretNumber + "!");
        }
        
        System.exit(0);
    }
}
