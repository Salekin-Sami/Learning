# define a class Book with the following instance attributes:
# title, author, year
# 2. create an __init__ method that initializes the attributes
# 3. add a display method to print book details in readable format

class Book:
    def __init__(self, title, author, year):
        self.title = title
        self.author = author
        self.year = year

    def display(self):
        print(f"{self.title} was written by {self.author} in {self.year}")

book1 = Book("gitangoly", "rabindranath", 1925)
book1.display() 