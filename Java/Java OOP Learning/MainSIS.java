import java.util.*;
class Student{
    private String ID;
    private String name;
    private ArrayList<Double> gradeList;
    private Double gpa;

    public Student(String ID, String name, ArrayList<Double>gradeList){
        this.ID = ID;
        this.name = name;
        this.gradeList = gradeList;
        this.gpa = calculategpa();
    }

    public double calculategpa(){
        double sum = 0;
        for(Double i: gradeList){
            sum += i;
        }
        double gpa = sum/gradeList.size();
        return gpa;
    }

    public String getID(){
        return ID;
    }

    public String getName(){
        return name;
    }
    public void printGrade(ArrayList<Double>gradeList){
        System.out.print("Grades: ");
        for(Double i: gradeList){
            System.out.print(i + " ");
        }
    }
    
    public Double getGPA(){
        return gpa;
    }

    public void displayStudent(){
        System.out.println("ID: " + getID());
        System.out.println("Name: " + getName());
        this.printGrade(this.gradeList);
        System.out.println("CGPA is: " + getGPA());
    }
} 

class StudentDatabase{
    private ArrayList<Student> students;

    public StudentDatabase(){
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void displayStudents(){
        System.out.println("Students in the database: ");

        for(Student i: students){
            i.displayStudent();
        }
    }

    public void printStudentbyID(String ID){
        boolean ok = true;
        for(Student i: students){
            if(ID.equals(i.getID())){
                i.displayStudent();
                ok = false;
            }
        }
        if(ok){
            System.out.println("Not found!");
        }
    }
}


public class MainSIS {
    public static void main(String[] args){
        StudentDatabase db = new StudentDatabase();
        int choice = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nChoose an option:");
        System.out.println("1. Add new student");
        System.out.println("2. Search student by ID");
        System.out.println("3. Show all student");

        choice = sc.nextInt();
        sc.nextLine();

        Student student;

        switch (choice) {
            case 1:
                student = MainSIS.createStudent();
                db.addStudent(student);
                break;
            case 3:
                System.out.println("Enter Student ID:");
                String ID = sc.nextLine();
                db.printStudentbyID(ID);

            case 2:
                System.out.println("Showing all the Students:");
                db.displayStudents();
            default:
                break;
        }
    }
    private static Student createStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student id: ");
        String id = sc.nextLine();
    
        System.out.print("Enter name: ");
        String name = sc.nextLine();
    
        System.out.print("Enter grades with decimal points (separated by spaces): ");
        String[] gradeStrings = sc.nextLine().split(" ");  // Split the input by spaces
    
        ArrayList<Double> grades = new ArrayList<>();
        for (String gradeStr : gradeStrings) {
            grades.add(Double.parseDouble(gradeStr));  // Convert each string to a double
        }
    
        Student student = new Student(id, name, grades);
        System.out.println("Student created successfully!");
        sc.close();
        return student;
    }
    
}
