import java.time.LocalDate;
import java.time.Period;

class Employee {
    private String name;
    private double salary;
    private LocalDate hireDate;

    // Constructor to initialize Employee attributes
    public Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    // Method to calculate years of service
    public int calculateYearsOfService() {
        LocalDate currentDate = LocalDate.now();
        if (hireDate != null) {
            return Period.between(hireDate, currentDate).getYears();
        } else {
            return 0;
        }
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Name: " + name + ", Salary: $" + salary + ", Hire Date: " + hireDate);
        System.out.println("Years of Service: " + calculateYearsOfService());
    }

    public static void main(String[] args) {
        // Create Employee objects with hire dates
        Employee emp1 = new Employee("Alice", 55000, LocalDate.of(2015, 3, 15));
        Employee emp2 = new Employee("Bob", 65000, LocalDate.of(2018, 6, 1));

        // Display employee details and years of service
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();
    }
}
