// Let's double check later!
import java.util.*;
public class BMIcalc{
    public static void main(String[] args){
        double Weight, height, Conv_Height;
        Scanner Keyboard = new Scanner(System.in);
        System.out.print("Enter your Weight in kg: ");
        Weight = Keyboard.nextDouble();
        System.out.print("\nEnter your Height in feet & inch: ");
        height = Keyboard.nextDouble();
        Conv_Height = F2M(height);
        double BMI = Weight/ (Conv_Height * Conv_Height);
        DisplayResult(BMI);
        Keyboard.close();
    }
    public static double F2M(double height){
        double feet = height % 10;
        double inch = (height % feet)* 10;
        // 1 ft = 0.3048 m
        // 1 in = 0.0254 m
        double meter = feet * 0.3048 + inch * 0.0254;
        return meter;
    }
    public static void DisplayResult(double BMI){
         if(BMI >= 40){
            System.out.println("Your BMI is " + BMI + ". Which is Obese Category");
        }
        else if(BMI <= 18.4){
            System.out.println("Your BMI is " + BMI + ". Which is Underweight Category") ;           
        }
        else if(BMI < 24.9){
            System.out.println("Your BMI is " + BMI + ". Which is Normal Category")  ;          
        }
        else if(BMI < 39.9){
            System.out.println("Your BMI is " + BMI + ". Which is Overweight Category") ;           
        }
    }
}