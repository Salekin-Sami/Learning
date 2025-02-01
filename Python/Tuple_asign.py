fruit = ("apple", "banana", "cherry")
numbers = (1, 2, 3, 4, 5)
nested_tuple = (fruit, numbers)
print(nested_tuple)
print(fruit[0])
print(fruit[-1])
print(nested_tuple[1])
print(nested_tuple[0][2])

fruits = ("orange", "grapes")
Sfruits = fruits + fruit
numbers = numbers * 3
if "banana" in fruit:
    print("Yes, 'banana' is in the fruits tuple")
else:
    print("No, 'banana' is not in the fruits tuple")
print(len(numbers))
print(min(numbers))
print(max(numbers))
tuple2list = list(numbers)
print(tuple2list)

student = ("John", 21, "Computer Science")
(name, age, studies) = student
print(name)

student2list = list(student)
student2list[1] = 22
student = tuple(student2list)
print(student)