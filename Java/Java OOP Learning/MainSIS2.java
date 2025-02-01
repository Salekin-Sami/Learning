import java.util.*;

class Student {
    private String ID;
    private String name;
    private ArrayList<Double> gradeList;
    private Double gpa;

    // Constructor to initialize student details and calculate GPA
    public Student(String ID, String name, ArrayList<Double> gradeList) {
        this.ID = ID;
        this.name = name;
        this.gradeList = gradeList;
        this.gpa = calculateGPA();
    }

    // Method to calculate GPA from the grade list
    public double calculateGPA() {
        double sum = 0;
        for (Double grade : gradeList) {
            sum += grade;
        }
        return sum / gradeList.size();
    }

    // Getter methods
    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public Double getGPA() {
        return gpa;
    }

    // Display student's grades
    public void printGrades() {
        System.out.print("Grades: ");
        for (Double grade : gradeList) {
            System.out.print(grade + " ");
        }
        System.out.println();
    }

    // Display student details
    public void displayStudent() {
        System.out.println("ID: " + getID());
        System.out.println("Name: " + getName());
        printGrades();
        System.out.println("GPA: " + getGPA());
    }
}

class StudentDatabase {
    private ArrayList<Student> students;

    // Constructor to initialize student list
    public StudentDatabase() {
        this.students = new ArrayList<>();
    }

    // Add a new student to the database
    public void addStudent(Student student) {
        students.add(student);
    }

    // Display all students in the database
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the database.");
        } else {
            System.out.println("Students in the database:");
            for (Student student : students) {
                student.displayStudent();
                System.out.println();  // For formatting
            }
        }
    }

    // Print a student's details by their ID
    public void printStudentByID(String ID) {
        boolean found = false;
        for (Student student : students) {
            if (ID.equals(student.getID())) {
                student.displayStudent();
                found = true;
                break;  // Student found, exit loop
            }
        }
        if (!found) {
            System.out.println("Student not found with ID: " + ID);
        }
    }
}

public class MainSIS2 {

    public static void main(String[] args) {
        StudentDatabase db = new StudentDatabase();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add new student");
            System.out.println("2. Search student by ID");
            System.out.println("3. Show all students");
            System.out.println("4. Exit");

            int choice = sc.nextInt();
            sc.nextLine();  // Consume the newline character

            switch (choice) {
                case 1:
                    Student student = createStudent(sc);
                    db.addStudent(student);
                    System.out.println("Student added successfully.");
                    break;

                case 2:
                    System.out.print("Enter Student ID: ");
                    String ID = sc.nextLine();
                    db.printStudentByID(ID);
                    break;

                case 3:
                    db.displayAllStudents();
                    break;

                case 4:
                    System.out.println("Exiting the system...");
                    sc.close();  // Close the scanner once, before exit
                    return;  // Exit the program

                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
                    break;
            }
        }
    }

    // Method to create a new student by taking input from the user
    private static Student createStudent(Scanner sc) {
        System.out.print("Enter Student ID: ");
        String id = sc.nextLine();

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter grades with decimal points (separated by spaces): ");
        String[] gradeStrings = sc.nextLine().split(" ");

        ArrayList<Double> grades = new ArrayList<>();
        for (String gradeStr : gradeStrings) {
            grades.add(Double.parseDouble(gradeStr));  // Convert each string to a double
        }

        return new Student(id, name, grades);  // Create and return a new student
    }
}
