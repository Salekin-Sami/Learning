import java.util.*;
public class AskingQuestions{
    public static void main(String[] args)
    {
        Scanner Keyboard = new Scanner(System.in);

        int age;
        String height;
        double weight;
        System.out.print("How old are you? ");
        age = Keyboard.nextInt();
        System.out.print("\nHow tall are you? ");
        height= Keyboard.next();
        System.out.print("How much do you weight? ");
        weight = Keyboard.nextDouble();

        System.out.println("So you're " + age + " years old and you weigh " + weight + " And you're " + height + " tall.");
        Keyboard.close();
    }
}