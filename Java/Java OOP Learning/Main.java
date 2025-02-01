import java.util.ArrayList;

public class Main {

    // Inner class for Book
    class Book {
        private String title;
        private String author;
        private String ISBN;

        // Constructor to initialize Book attributes
        public Book(String title, String author, String ISBN) {
            this.title = title;
            this.author = author;
            this.ISBN = ISBN;
        }

        // Method to display book details
        public void displayBook() {
            System.out.println("Title: " + title + ", Author: " + author + ", ISBN: " + ISBN);
        }
    }

    // Collection of books
    private ArrayList<Book> bookCollection = new ArrayList<>();

    // Method to add a book to the collection
    public void addBook(String title, String author, String ISBN) {
        Book book = new Book(title, author, ISBN);
        bookCollection.add(book);
        System.out.println("Book added: " + title);
    }

    // Method to remove a book from the collection
    public void removeBook(String title) {
        bookCollection.removeIf(book -> book.title.equals(title));
        System.out.println("Book removed: " + title);
    }

    // Method to display all books in the collection
    public void displayAllBooks() {
        for (Book book : bookCollection) {
            book.displayBook();
        }
    }

    // Inner class for Employee
    class Employee {
        private String name;
        private String jobTitle;
        private double salary;

        // Constructor to initialize Employee attributes
        public Employee(String name, String jobTitle, double salary) {
            this.name = name;
            this.jobTitle = jobTitle;
            this.salary = salary;
        }

        // Method to calculate and return the yearly salary
        public double calculateYearlySalary() {
            return salary * 12;
        }

        // Method to update salary
        public void updateSalary(double newSalary) {
            this.salary = newSalary;
            System.out.println("Salary updated for " + name + ": " + salary);
        }

        // Method to display employee details
        public void displayEmployee() {
            System.out.println("Name: " + name + ", Job Title: " + jobTitle + ", Monthly Salary: " + salary);
        }
    }

    public static void main(String[] args) {
        Main program = new Main();

        // Book collection operations
        program.addBook("The Catcher in the Rye", "J.D. Salinger", "123456789");
        program.addBook("To Kill a Mockingbird", "Harper Lee", "987654321");
        program.displayAllBooks();
        program.removeBook("The Catcher in the Rye");
        program.displayAllBooks();

        // Employee operations
        Employee employee1 = program.new Employee("Alice", "Software Engineer", 5000);
        employee1.displayEmployee();
        System.out.println("Yearly Salary: " + employee1.calculateYearlySalary());
        employee1.updateSalary(5500);
        employee1.displayEmployee();
    }
}
