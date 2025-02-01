public class Person {
    String name;
    int age;

    // Constructor to initialize name and age
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to print person's details
    void printDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        // Creating two Person objects
        Person person1 = new Person("Alice", 25);
        Person person2 = new Person("Bob", 30);

        // Printing their details
        person1.printDetails();
        person2.printDetails();
    }
}
