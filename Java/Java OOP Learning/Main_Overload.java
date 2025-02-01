import java.util.*;

class vehicle{
    private String brand;
    private String name;

    public vehicle(String brand, String name){
        this.brand = brand;
        this.name = name;
    }

    public void info(){
        System.out.println("The brand is " + getBrand() + " and the model name is " + getName());
    }

    public String getBrand(){
        return brand;
    }
    public String getName(){
        return name;
    }
}

class Car extends vehicle{
    private String model;
    private int wheel_no;

    public Car(String brand, String name, String model,int wheel_no){
        super(brand,name);
        this.model = model;
        this.wheel_no = wheel_no;
    }

    public void info(){
        super.info();
        System.out.println("Model name is " + getModel());
        System.out.println("Wheel no is " + getWheel_no());

    }

    public String getModel(){
        return model;
    }
    public int getWheel_no(){
        return wheel_no;
    }
}


public class Main_Overload{
    public static void main(String[] args){
        Car x = new Car("Ford","Chevy","Roadmaster",4);
        System.out.println("Car details:");
        x.info();

    }
}