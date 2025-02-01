import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        // Create a StudentDatabase object
       StudentDatabase studentDatabase = new StudentDatabase();
        Scanner scanner = new Scanner(System.in);

        // Adding new students
        System.out.print("How many students do you want to add? ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");

            // Input student ID
            System.out.print("Student ID: ");
            String studentID = scanner.nextLine();

            // Input student name
            System.out.print("Name: ");
            String name = scanner.nextLine();

            // Input grade
            System.out.print("Grade: ");
            String grade = scanner.nextLine();

            // Input GPA
            System.out.print("GPA: ");
            double gpa = scanner.nextDouble();
            scanner.nextLine();  // Consume newline

            // Create a Student object and add it to the database
            Student student = new Student(studentID, name, grade, gpa);
            studentDatabase.addStudent(student);
        }

        // Display all students
        System.out.println("\nAll Students in Database:");
        studentDatabase.displayAllStudents();

        // Search for a student by ID
        System.out.print("\nEnter student ID to search: ");
        String searchID = scanner.nextLine();
        studentDatabase.searchStudentByID(searchID);

        scanner.close();
    }
}