#define class liberay with a class attribute library_name which will be name of the libeary initialized to "Central Library". Add an instance attribute books which will be a list to store the book objects. Define an __init__ method that only intilizes the book list as empty list. Create an add_book method that takes a Book object and adds it to the book list. Create a show_books method that displays the details of all the books in the library. Create a remove_book method that takes a Book object and removes it from the book list. Create a find_book method that takes a title and returns the book object if found, otherwise returns None. Create a main function that creates a library object, adds some books, displays the books, removes a book, displays the books again, and finds a book by title.

class Book:
    def __init__(self, title, author, year):
        self.title = title
        self.author = author
        self.year = year

    def display(self):
        print(f"{self.title} was written by {self.author} in {self.year}")
    
class Library:
    library_name = "Central Library"
    def __init__(self):
        self.books = []
    
    def add_book(self, book):
        self.books.append(book)
    
    def show_books(self):
        print("Books in {Library.library_name}:")
        for book in self.books:
            book.display()
    
    def remove_book(self, title):
        for book in self.books:
            if book.title == title:
                self.books.remove(book)
                print("The book has been removed")
                return
        print("Book not found")

    def find_book(self,title):
        for book in self.books:
            if book.title == title:
                print(f"Book found: {book.title}")
                book.display()
                return
        print("Book not found")  

lib1 = Library()
book1 = Book("A","B",2025)
book2 = Book("C","D",2024)
lib1.add_book(book1)
lib1.add_book(book2)
lib1.show_books()
lib1.find_book("A")
lib1.remove_book("A")
lib1.show_books()