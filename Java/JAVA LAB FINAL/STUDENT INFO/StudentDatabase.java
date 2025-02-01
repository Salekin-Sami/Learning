import java.util.ArrayList;

class StudentDatabase {
    private ArrayList<Student> students;

    // Constructor to initialize the list of students
    public StudentDatabase() {
        students = new ArrayList<>();
    }

    // Method to add a new student to the database
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method to display all students in the database
    public void displayAllStudents() {
        for (Student student : students) {
            student.displayInfo();
        }
    }

    // Method to search for a student by ID
    public void searchStudentByID(String studentID) {
        for (Student student : students) {
            if (student.getStudentID().equals(studentID)) {
                student.displayInfo();
                return;
            }
        }
        System.out.println("Student with ID " + studentID + " not found.");
    }
}