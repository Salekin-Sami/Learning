class Student {
    private String studentID;
    private String name;
    private String grade;
    private double gpa;

    // Constructor to initialize studentID and name
    public Student(String studentID, String name, String grade, double gpa) {
        this.studentID = studentID;
        this.name = name;
        this.grade = grade;
        this.gpa = gpa;
    }

    // Getters
    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }

    public double getGPA() {
        return gpa;
    }

    // Setter for grade
    public void setGrade(String grade) {
        this.grade = grade;
    }

    // Setter for GPA
    public void setGPA(double gpa) {
        this.gpa = gpa;
    }

    // Method to display student information
    public void displayInfo() {
        System.out.println("ID: " + studentID + ", Name: " + name + ", Grade: " + grade + ", GPA: " + gpa);
    }
}