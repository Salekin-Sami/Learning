import java.util.ArrayList;

class Student {
    private String name;
    private String grade;
    private ArrayList<String> courses;

    // Constructor to initialize Student attributes
    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    // Method to add a course
    public void addCourse(String course) {
        if (!courses.contains(course)) {
            courses.add(course);
            System.out.println(course + " added to " + name + "'s courses.");
        } else {
            System.out.println(course + " is already in the list.");
        }
    }

    // Method to remove a course
    public void removeCourse(String course) {
        if (courses.contains(course)) {
            courses.remove(course);
            System.out.println(course + " removed from " + name + "'s courses.");
        } else {
            System.out.println(course + " is not in the list.");
        }
    }

    // Method to display student details and courses
    public void displayStudentDetails() {
        System.out.println("Name: " + name + ", Grade: " + grade);
        System.out.println("Courses enrolled: " + courses);
    }

    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("John Doe", "A");

        // Adding courses
        student.addCourse("Math");
        student.addCourse("Science");
        student.addCourse("History");

        // Display student details
        student.displayStudentDetails();

        // Removing a course
        student.removeCourse("Science");

        // Display student details after removing a course
        student.displayStudentDetails();
    }
}
