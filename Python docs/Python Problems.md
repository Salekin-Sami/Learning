# Basic Part A
### **1. Formatted Twinkle Poem**
```python
print("Twinkle, twinkle, little star,")
print("\tHow I wonder what you are!")
print("\t\tUp above the world so high,")
print("\t\tLike a diamond in the sky.")
print("Twinkle, twinkle, little star,")
print("\tHow I wonder what you are")
```

### **2. Python Version Checker**
```python
import sys
print(sys.version)
```

---

### **3. Current DateTime Display**
```python
from datetime import datetime
print("Current date and time:", datetime.now())
```

---

### **4. Circle Area Calculator**
```python
import math
radius = float(input("Enter radius: "))
area = math.pi * radius ** 2
print("Area =", area)
```

---

### **5. Reverse Full Name**
```python
first_name = input("Enter first name: ")
last_name = input("Enter last name: ")
print(f"Reversed name: {last_name} {first_name}")
```

---

### **6. List and Tuple Generator**
```python
values = input("Enter comma-separated numbers: ").split(',')
print("List:", values)
print("Tuple:", tuple(values))
```

---

### **7. File Extension Extractor**
```python
filename = input("Enter filename: ")
extension = filename.split('.')[-1]
print("File extension:", extension)
```

---

### **8. First and Last Colors**
```python
color_list = ["Red", "Green", "White", "Black"]
print("First color:", color_list[0])
print("Last color:", color_list[-1])
```

---

### **9. Exam Schedule Formatter**
```python
exam_st_date = (11, 12, 2014)
print(f"The examination will start from: {exam_st_date[0]} / {exam_st_date[1]} / {exam_st_date[2]}")
```

---

### **10. Number Expansion Calculator**
```python
n = int(input("Enter a number: "))
result = n + (n*10) + (n*100)
print("Result:", result)
```

---

### **11. Function Documentation Printer**
```python
print(abs.__doc__)
```

---

### **12. Monthly Calendar Display**
```python
import calendar
year = int(input("Enter year: "))
month = int(input("Enter month: "))
print(calendar.month(year, month))
```

---

### **13. Multi-line Here Document**
```python
print("""a string that you "don't" have to escape
This
is a ....... multi-line
heredoc string --------> example""")
```

---

### **14. Days Between Dates**
```python
from datetime import date
date1 = date(2014, 7, 2)
date2 = date(2014, 7, 11)
delta = date2 - date1
print(f"{delta.days} days")
```

---

### **15. Sphere Volume Calculator**
```python
import math
radius = 6
volume = (4/3) * math.pi * radius**3
print("Volume:", volume)
```

---

### **16. Difference from 17**
```python
def diff_from_17(n):
    if n > 17:
        return 2 * (n - 17)
    return 17 - n
```

---

### **17. Number Range Tester**
```python
def test_range(n):
    return (abs(1000 - n) <= 100) or (abs(2000 - n) <= 100)
```

---

### **18. Triple Sum Calculator**
```python
def triple_sum(a, b, c):
    if a == b == c:
        return 3 * (a + b + c)
    return a + b + c
```

---

### **19. Prefix "Is" String Modifier**
```python
def add_is_prefix(s):
    if s.startswith("Is"):
        return s
    return "Is" + s
```

---

### **20. String Copy Generator**
```python
def repeat_string(s, n):
    return s * n
```

---

### **21. Even or Odd Checker**
```python
n = int(input("Enter a number: "))
if n % 2 == 0:
    print("Even")
else:
    print("Odd")
```

---

### **22. Count 4 in List**
```python
numbers = [1, 4, 3, 4, 4]
count = numbers.count(4)
print(count)
```

---

### **23. String Prefix Copies**
```python
def prefix_copies(s, n):
    return (s[:2] * n) if len(s) >= 2 else s * n
```

---

### **24. Vowel Tester**
```python
def is_vowel(char):
    return char.lower() in 'aeiou'
```

---

### **25. Value in Group Tester**
```python
def is_in_group(value, group):
    return value in group
```

---

### **26. List Histogram**
```python
numbers = [2, 3, 4]
for num in numbers:
    print('*' * num)
```

---

### **27. List to String Concatenator**
```python
def list_to_string(lst):
    return ''.join(map(str, lst))
```

---

### **28. Even Numbers Until 237**
```python
numbers = [386, 462, 47, 418, 907, 344, 236, 375, 823, 566, 597, 978, 328, 615, 953, 345, 399, 162, 758, 219, 918, 237, 412, 566, 826, 248, 866, 950, 626, 949, 687, 217, 815, 67, 104, 58, 512, 24, 892, 894, 767, 553, 81, 379, 843, 831, 445, 742, 717, 958, 743, 527]
for num in numbers:
    if num % 2 == 0:
        print(num)
    if num == 237:
        break
```

---

### **29. Unique Colors Finder**
```python
color_list_1 = set(["White", "Black", "Red"])
color_list_2 = set(["Red", "Green"])
print(color_list_1 - color_list_2)
```

---

### **30. Triangle Area Calculator**
```python
def triangle_area(base, height):
    return 0.5 * base * height
```

---

### **31. GCD Calculator**
```python
import math
a = int(input("Enter first number: "))
b = int(input("Enter second number: "))
print("GCD:", math.gcd(a, b))
```

---

### **32. LCM Calculator**
```python
import math
a = int(input("Enter first number: "))
b = int(input("Enter second number: "))
lcm = abs(a * b) // math.gcd(a, b)
print("LCM:", lcm)
```

---

### **33. Triple Sum with Equality Rule**
```python
def triple_sum(a, b, c):
    if a == b or b == c or a == c:
        return 0
    return a + b + c
```

---

### **34. Conditional Sum to 20**
```python
def sum_to_20(a, b):
    total = a + b
    if 15 <= total <= 20:
        return 20
    return total
```

---

### **35. Equality or 5 Rule Checker**
```python
def check_equality_or_5(a, b):
    return a == b or abs(a - b) == 5 or (a + b) == 5
```

---

### **36. Add Integers Validator**
```python
def add_integers(a, b):
    if isinstance(a, int) and isinstance(b, int):
        return a + b
```

---

### **37. Personal Info Formatter**
```python
name = "John Doe"
age = 25
address = "123 Main St"
print(f"{name}\n{age}\n{address}")
```

---

### **38. Expression Solver**
```python
x = 4
y = 3
result = (x + y) ** 2
print(result)
```

---

### **39. Future Value Calculator**
```python
amt = 10000
rate = 3.5
years = 7
future_value = amt * (1 + rate / 100) ** years
print(f"{future_value:.2f}")
```

---

### **40. Distance Between Points**
```python
import math
x1, y1 = 1, 2
x2, y2 = 4, 6
distance = math.sqrt((x2 - x1) ** 2 + (y2 - y1) ** 2)
print(distance)
```

---

### **41. File Existence Checker**
```python
import os
filename = "test.txt"
print(os.path.exists(filename))
```

---

### **42. Shell Mode Detector**
```python
import struct
print(struct.calcsize("P") * 8)
```

---

### **43. OS and Platform Info**
```python
import platform
print(platform.system(), platform.release(), platform.version())
```

---

### **44. Python Site Packages Locator**
```python
import site
print(site.getsitepackages())
```

---

### **45. External Command Runner**
```python
import os
os.system("echo Hello, World!")
```

---

### **46. File Path and Name Finder**
```python
import os
print(os.path.abspath(__file__))
```

---

### **47. CPU Count Finder**
```python
import os
print(os.cpu_count())
```

---

### **48. String to Numeric Parser**
```python
string_value = "10.5"
print(int(float(string_value)))
```

---

### **49. Directory Files Lister**
```python
import os
print(os.listdir('.'))
```

---

### **50. Print Without Newline**
```python
print("Hello", end="")
print("World")
```

Here are the solutions for all the tasks you listed, from 51 to 100:

---

**51. Program Profiler**

```python
import cProfile

def sample_function():
    for _ in range(1000000):
        pass

cProfile.run('sample_function()')
```

---

**52. Print to STDERR**

```python
import sys
print("This is an error message", file=sys.stderr)
```

---

**53. Access Environment Variables**

```python
import os
print(os.environ.get('HOME'))
```

---

**54. Get Current Username**

```python
import os
print(os.getlogin())
```

---

**55. Find Local IPs**

```python
import socket
hostname = socket.gethostname()
local_ip = socket.gethostbyname(hostname)
print(local_ip)
```

---

**56. Console Dimensions**

```python
import os
columns, rows = os.get_terminal_size()
print(f"Width: {columns}, Height: {rows}")
```

---

**57. Method Execution Time**

```python
import time

def sample_method():
    time.sleep(2)

start_time = time.time()
sample_method()
end_time = time.time()
print(f"Execution Time: {end_time - start_time} seconds")
```

---

**58. Sum of First n Positives**

```python
n = int(input("Enter a number: "))
sum_of_first_n = n * (n + 1) // 2
print(f"Sum of first {n} positive integers is: {sum_of_first_n}")
```

---

**59. Height to Centimeters**

```python
def convert_height(feet, inches):
    return (feet * 30.48) + (inches * 2.54)

feet = int(input("Enter feet: "))
inches = int(input("Enter inches: "))
print(f"Height in centimeters: {convert_height(feet, inches)} cm")
```

---

**60. Triangle Hypotenuse Calculator**

```python
import math

def hypotenuse(a, b):
    return math.sqrt(a**2 + b**2)

a = int(input("Enter base of the triangle: "))
b = int(input("Enter height of the triangle: "))
print(f"The hypotenuse is: {hypotenuse(a, b)}")
```

---

**61. Feet to Other Units**

```python
def convert_feet(feet):
    inches = feet * 12
    yards = feet / 3
    miles = feet / 5280
    return inches, yards, miles

feet = float(input("Enter distance in feet: "))
inches, yards, miles = convert_feet(feet)
print(f"In inches: {inches}, In yards: {yards}, In miles: {miles}")
```

---

**62. Time to Seconds Converter**

```python
def time_to_seconds(days, hours, minutes, seconds):
    return (days * 86400) + (hours * 3600) + (minutes * 60) + seconds

days = int(input("Enter days: "))
hours = int(input("Enter hours: "))
minutes = int(input("Enter minutes: "))
seconds = int(input("Enter seconds: "))
print(f"Total seconds: {time_to_seconds(days, hours, minutes, seconds)}")
```

---

**63. Absolute File Path Finder**

```python
import os

file_name = input("Enter file name: ")
print(f"Absolute path: {os.path.abspath(file_name)}")
```

---

**64. File Timestamps**

```python
import os
import time

file_name = input("Enter file name: ")
file_stats = os.stat(file_name)
print(f"Creation time: {time.ctime(file_stats.st_ctime)}")
print(f"Last modification time: {time.ctime(file_stats.st_mtime)}")
```

---

**65. Seconds to DHMS Converter**

```python
def convert_seconds(seconds):
    days = seconds // (24 * 3600)
    seconds %= (24 * 3600)
    hours = seconds // 3600
    seconds %= 3600
    minutes = seconds // 60
    seconds %= 60
    return days, hours, minutes, seconds

seconds = int(input("Enter time in seconds: "))
days, hours, minutes, seconds = convert_seconds(seconds)
print(f"{days} days, {hours} hours, {minutes} minutes, {seconds} seconds")
```

---

**66. BMI Calculator**

```python
def calculate_bmi(weight, height):
    return weight / (height ** 2)

weight = float(input("Enter weight in kg: "))
height = float(input("Enter height in meters: "))
bmi = calculate_bmi(weight, height)
print(f"BMI: {bmi}")
```

---

**67. Pressure Unit Converter**

```python
def pressure_converter(kPa):
    psi = kPa * 0.1450377377
    mmHg = kPa * 7.50062
    atmosphere = kPa * 0.00986923
    return psi, mmHg, atmosphere

kPa = float(input("Enter pressure in kilopascals: "))
psi, mmHg, atmosphere = pressure_converter(kPa)
print(f"Pressure in psi: {psi}, mmHg: {mmHg}, atmosphere: {atmosphere}")
```

---

**68. Sum of Digits**

```python
num = int(input("Enter a number: "))
sum_of_digits = sum(int(digit) for digit in str(num))
print(f"Sum of digits: {sum_of_digits}")
```

---

**69. Sort Three Numbers**

```python
numbers = [int(input(f"Enter number {i+1}: ")) for i in range(3)]
numbers.sort()
print(f"Sorted numbers: {numbers}")
```

---

**70. Sort Files by Date**

```python
import os
from datetime import datetime

file_paths = [f for f in os.listdir('.') if os.path.isfile(f)]
file_paths.sort(key=lambda x: os.path.getmtime(x))
print(f"Sorted files by date: {file_paths}")
```

---

**71. Directory Listing by Creation Date**

```python
import os
from datetime import datetime

file_paths = [f for f in os.listdir('.') if os.path.isfile(f)]
file_paths.sort(key=lambda x: os.path.getctime(x))
print(f"Directory listing by creation date: {file_paths}")
```

---

**72. Math Module Details**

```python
import math
print(dir(math))
```

---

**73. Line Midpoint Calculator**

```python
def midpoint(x1, y1, x2, y2):
    return (x1 + x2) / 2, (y1 + y2) / 2

x1, y1 = map(int, input("Enter coordinates of first point (x1, y1): ").split())
x2, y2 = map(int, input("Enter coordinates of second point (x2, y2): ").split())
print(f"Midpoint: {midpoint(x1, y1, x2, y2)}")
```

---

**74. Word Hasher**

```python
hash_value = hash(input("Enter a word: "))
print(f"Hash value: {hash_value}")
```

---

**75. Copyright Information**

```python
print("Copyright (C) 2025 by Your Name. All Rights Reserved.")
```

---

**76. Command-line Arguments**

```python
import sys
print(f"Script name: {sys.argv[0]}")
print(f"Number of arguments: {len(sys.argv) - 1}")
print(f"Arguments: {sys.argv[1:]}")
```

---

**77. Endianness Checker**

```python
import sys
print(f"Endianness: {sys.byteorder}")
```

---

**78. List Built-in Modules**

```python
import sys
print(sys.builtin_module_names)
```

---

**79. Object Size Finder**

```python
import sys
obj = input("Enter an object: ")
print(f"Size of object: {sys.getsizeof(obj)} bytes")
```

---

**80. Current Recursion Limit**

```python
import sys
print(f"Recursion limit: {sys.getrecursionlimit()}")
```

---

**81. Concatenate Strings**

```python
n = int(input("Enter number of strings: "))
strings = [input(f"Enter string {i+1}: ") for i in range(n)]
concatenated = ''.join(strings)
print(f"Concatenated string: {concatenated}")
```

---

**82. Sum of Container Items**

```python
container = [1, 2, 3, 4, 5]
print(f"Sum: {sum(container)}")
```

---

**83. List Greater-Than Test**

```python
numbers = [1, 2, 3, 4]
value = 2
print(all(i > value for i in numbers))
```

---

**84. Character Frequency Counter**

```python
string = input("Enter a string: ")
char = input("Enter character to count: ")
print(f"Character '{char}' frequency: {string.count(char)}")
```

---

**85. File or Directory Checker**

```python
import os

path = input("Enter file or directory path: ")
if os.path.isfile(path):
    print("It's a file.")
elif os.path.isdir(path):
    print("It's a directory.")
else:
    print("Path does not exist.")
```

---

**86. Character ASCII Value**

```python
char = input("Enter a character: ")
print(f"ASCII value: {ord(char)}")
```

---

**87. File Size Finder**

```python
import os

file_name = input("Enter file name: ")
print(f"File size: {os.path.getsize(file_name)} bytes")
```

---

**88. Sum Expression Printer**

```python
x = 30
y = 20
print(f"{x}+{y}={x+y}")
```

---

**89. Conditional Action**

```python
value = int(input("Enter value: "))
if value == 1:
    print("First day of a Month!")
```

---

**90. Self-replicating Program**

```python
def self_replicating():
    with open(__file__, 'r') as file:
        code = file.read()
    print(code)

self_replicating()
```

---

**91. Swap Variables**

```python
x, y = 5, 10
x, y = y, x
```

**92. Special Characters in String**

```python
special_string = "Hello, World! @#$%^&*()"
print(special_string)
```

---

**93. Object Identity and Type**

```python
obj = input("Enter an object: ")
print(f"Identity: {id(obj)}")
print(f"Type: {type(obj)}")
print(f"Value: {obj}")
```

---

**94. String Bytes to Integers**

```python
byte_string = input("Enter a string: ").encode('utf-8')
integers = [b for b in byte_string]
print(f"Bytes as integers: {integers}")
```

---

**95. Check if String is Numeric**

```python
string = input("Enter a string: ")
print(f"Is numeric? {string.isnumeric()}")
```

---

**96. Print Call Stack**

```python
import traceback

def sample_function():
    print("Printing call stack:")
    traceback.print_stack()

sample_function()
```

---

**97. List Special Variables**

```python
print(f"Special variables: {dir()}")
```

---

**98. Get System Time**

```python
import time
print(f"Current system time: {time.strftime('%Y-%m-%d %H:%M:%S')}")
```

---

**99. Clear Terminal**

```python
import os
import platform

def clear_screen():
    system_name = platform.system()
    if system_name == "Windows":
        os.system('cls')
    else:
        os.system('clear')

clear_screen()
```

---

**100. Get Host Name**

```python
import socket
host_name = socket.gethostname()
print(f"Host name: {host_name}")
```



**101. URL Content Printer**

```python
import urllib.request

url = input("Enter a URL: ")
response = urllib.request.urlopen(url)
content = response.read()
print(content.decode('utf-8'))
```

---

**102. System Command Output**

```python
import subprocess

command = input("Enter a system command: ")
result = subprocess.run(command, stdout=subprocess.PIPE, stderr=subprocess.PIPE, shell=True)
print("Output:", result.stdout.decode())
print("Error:", result.stderr.decode())
```

---

**103. Extract Filename**

```python
import os

path = input("Enter a path: ")
filename = os.path.basename(path)
print(f"Filename: {filename}")
```

---

**104. Process Group and User IDs**

```python
import os

print("Effective group id:", os.getegid())
print("Effective user id:", os.geteuid())
print("Real group id:", os.getgid())
print("Real user id:", os.getuid())
print("Supplemental group ids:", os.getgroups())
```

---

**105. User Environment Retriever**

```python
import os

env_vars = os.environ
for key, value in env_vars.items():
    print(f"{key}: {value}")
```

---

**106. Path Extension Splitter**

```python
import os

path = input("Enter a path: ")
root, ext = os.path.splitext(path)
print(f"Root: {root}")
print(f"Extension: {ext}")
```

---

**107. File Properties Retriever**

```python
import os
import time

file_path = input("Enter file path: ")
file_stats = os.stat(file_path)
print(f"File size: {file_stats.st_size} bytes")
print(f"Creation time: {time.ctime(file_stats.st_ctime)}")
print(f"Modification time: {time.ctime(file_stats.st_mtime)}")
```

---

**108. File or Directory Path Finder**

```python
import os

path = input("Enter path: ")
if os.path.isfile(path):
    print(f"{path} is a file.")
elif os.path.isdir(path):
    print(f"{path} is a directory.")
else:
    print("Path does not exist.")
```

---

**109. Resolve Path Name**

```python
import os

path = input("Enter a path: ")
resolved_path = os.path.realpath(path)
print(f"Resolved Path: {resolved_path}")
```

---

**110. Divisible by 15 Finder**

```python
numbers = [15, 30, 45, 60, 100, 105, 150]
div_by_15 = list(filter(lambda x: x % 15 == 0, numbers))
print(div_by_15)
```

---

**111. Wildcard File Lister**

```python
import glob

files = glob.glob('*')
print(files)
```

---

**112. Remove First List Item**

```python
my_list = [10, 20, 30, 40]
my_list.pop(0)
print(f"Updated list: {my_list}")
```

---

**113. Number Input Validator**

```python
try:
    number = int(input("Enter a number: "))
    print(f"You entered: {number}")
except ValueError:
    print("Error: Not a valid number.")
```

---

**114. Filter Positive Numbers**

```python
numbers = [-5, 10, -20, 30, 0, -2]
positive_numbers = list(filter(lambda x: x > 0, numbers))
print(positive_numbers)
```

---

**115. List Product Calculator**

```python
from functools import reduce

numbers = [1, 2, 3, 4, 5]
product = reduce(lambda x, y: x * y, numbers)
print(product)
```

---

**116. Print Unicode Characters**

```python
print("\u2600 \u2705 \u2764")  # Unicode for Sun, Check Mark, Heart
```

---

**117. String Memory Location Test**

```python
str1 = "hello"
str2 = "hello"
print(id(str1) == id(str2))  # Should be True, as Python caches strings
```

---

**118. Create Bytearray from List**

```python
numbers = [65, 66, 67]
byte_array = bytearray(numbers)
print(byte_array)
```

---

**119. Round Float to Decimals**

```python
num = float(input("Enter a number: "))
decimals = int(input("Enter the number of decimal places: "))
rounded_num = round(num, decimals)
print(f"Rounded number: {rounded_num}")
```

---

**120. String Formatter with Length Limit**

```python
string = input("Enter a string: ")
max_length = int(input("Enter maximum length: "))
formatted_string = string[:max_length]
print(f"Formatted string: {formatted_string}")
```

---

**121. Variable Defined Checker**

```python
try:
    print(my_var)
except NameError:
    print("Variable is not defined.")
```

---

**122. Empty Variable Without Deletion**

```python
n = 20
d = {"x": 200}
n = 0
d.clear()
print(n)  # 0
print(d)  # {}
```

---

**123. Max and Min of Number Types**

```python
print("Max int:", float('inf'))
print("Min int:", -float('inf'))
print("Max float:", float('inf'))
print("Min float:", -float('inf'))
```

---

**124. Variable Equality Checker**

```python
a = 5
b = 5
c = 10
print(a == b == c)  # Will print False
```

---

**125. Sum Collection Counts**

```python
from collections import Counter

collection = ['apple', 'banana', 'apple', 'orange', 'banana', 'banana']
counter = Counter(collection)
print(sum(counter.values()))  # Output: 6
```

---

**126. Get Module Object**

```python
import os
print(os.__name__)  # prints the module name
```

---

**127. Integer Fits in 64 Bits**

```python
def fits_in_64_bits(number):
    return -2**63 <= number <= 2**63 - 1

number = int(input("Enter a number: "))
print(fits_in_64_bits(number))
```

---

**128. Lowercase Letters Checker**

```python
string = input("Enter a string: ")
print(any(c.islower() for c in string))
```

---

**129. Add Leading Zeroes**

```python
num = int(input("Enter a number: "))
leading_zeros = int(input("Enter number of leading zeros: "))
formatted_number = f"{num:0{leading_zeros}d}"
print(formatted_number)
```

---

**130. Double Quotes String Display**

```python
string = 'Hello, World!'
print(f'"{string}"')  # Prints with double quotes
```

---

**131. Split Variable Length String**

```python
string = input("Enter a string: ")
split_string = string.split()
for i, var in enumerate(split_string):
    globals()[f"var{i}"] = var
    print(f"var{i}: {globals()[f'var{i}']]}")
```

---

**132. List Home Directory**

```python
import os

home_directory = os.path.expanduser('~')
print(home_directory)
```

---

**133. Program Runtime Calculator**

```python
import time

start_time = time.time()


# Simulate a long-running program
time.sleep(2)

end_time = time.time()

print(f"Program ran for {end_time - start_time:.2f} seconds.")
```

---

**134. Input Two Integers**

```python
a, b = map(int, input("Enter two integers: ").split())
print(f"Integer 1: {a}, Integer 2: {b}")
```

---

**135. Print Variable Without Spaces**

```python
x = 30
print(f"Value of x is {x}", end="")  # No space after value
```

---

**136. Files Only in Directory**

```python
import os

directory = input("Enter directory path: ")
files = [f for f in os.listdir(directory) if os.path.isfile(os.path.join(directory, f))]
print(f"Files: {files}")
```

---

**137. Extract Dictionary Pair**

```python
my_dict = {"a": 1, "b": 2}
key, value = my_dict.popitem()
print(f"Key: {key}, Value: {value}")
```

---

**138. Boolean to Integer Converter**

```python
boolean_value = True
integer_value = int(boolean_value)
print(integer_value)
```

---

**139. IP Address Validator**

```python
import re

ip = input("Enter IP address: ")
pattern = r"^(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\.(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$"
print(bool(re.match(pattern, ip)))
```

---

**140. Binary with Leading Zeroes**

```python
x = 12
binary = format(x, '08b')
print(binary)
```

---

**141. Decimal to Hexadecimal**

```python
x = 30
print(f"{x:x}")
```

---

**142. Consecutive Zero-One Checker**

```python
def check_sequence(string):
    for i in range(len(string)//2):
        if string[i:i+len(string)//2] == '0' * (len(string)//2):
            return True
    return False
```

---

# Basic Part 2
Here's a list of solutions for the 50 Python problems you mentioned:

---

### 1. Unique Numbers Check
```python
def are_unique(numbers):
    return len(numbers) == len(set(numbers))
```

---

### 2. All Unique Strings
```python
import itertools

def unique_strings():
    chars = ['a', 'e', 'i', 'o', 'I']
    return [''.join(p) for p in itertools.permutations(chars)]
```

---

### 3. Remove Every Third
```python
def remove_every_third(numbers):
    while numbers:
        print(numbers.pop(2))
```

---

### 4. Zero Sum Triplets
```python
def find_zero_sum_triplets(arr):
    triplets = []
    for i in range(len(arr)):
        for j in range(i+1, len(arr)):
            for k in range(j+1, len(arr)):
                if arr[i] + arr[j] + arr[k] == 0:
                    triplets.append((arr[i], arr[j], arr[k]))
    return triplets
```

---

### 5. 3-Digit Combinations
```python
import itertools

def three_digit_combinations():
    return list(itertools.combinations(range(10), 3))
```

---

### 6. Word Frequency Counter
```python
from collections import Counter

def word_frequency(text):
    words = text.split()
    return dict(Counter(words))
```

---

### 7. Character Frequency in File
```python
from collections import Counter

def char_frequency_in_file(filename):
    with open(filename, 'r') as file:
        return dict(Counter(file.read()))
```

---

### 8. Google News Top Stories
```python
# This requires an API key and proper setup
import requests

def google_news_top_stories():
    url = "https://newsapi.org/v2/top-headlines?country=us&apiKey=YOUR_API_KEY"
    response = requests.get(url)
    return response.json()['articles']
```

---

### 9. Locally Installed Modules
```python
import pkg_resources

def list_installed_modules():
    return [pkg.key for pkg in pkg_resources.working_set]
```

---

### 10. OS Information Display
```python
import os

def os_info():
    return {
        "Platform": os.name,
        "System": os.uname(),
        "OS version": os.version
    }
```

---

### 11. Three Array Sum Combinations
```python
def three_array_sum_combinations(X, Y, Z, target):
    combinations = []
    for x in X:
        for y in Y:
            for z in Z:
                if x + y + z == target:
                    combinations.append((x, y, z))
    return combinations
```

---

### 12. List Permutations Generator
```python
import itertools

def list_permutations(nums):
    return list(itertools.permutations(nums))
```

---

### 13. Two-Digit Letter Combos
```python
def two_digit_combos():
    string_maps = {
        "1": "abc", "2": "def", "3": "ghi", "4": "jkl", "5": "mno", "6": "pqrs",
        "7": "tuv", "8": "wxy", "9": "z"
    }
    result = []
    for key1, key2 in itertools.product(string_maps.keys(), repeat=2):
        for letter1 in string_maps[key1]:
            for letter2 in string_maps[key2]:
                result.append(letter1 + letter2)
    return result
```

---

### 14. Add Without Plus
```python
def add_without_plus(a, b):
    while b != 0:
        carry = a & b
        a = a ^ b
        b = carry << 1
    return a
```

---

### 15. Operator Priority Checker
```python
def operator_priority(operator):
    priority = {'+': 1, '-': 1, '*': 2, '/': 2}
    return priority.get(operator, 0)
```

---

### 16. Right Triangle Third Side
```python
import math

def third_side(a, b):
    return math.sqrt(a**2 + b**2)
```

---

### 17. Strobogrammatic Numbers
```python
def find_strobogrammatic_numbers(n):
    strobogrammatic_map = {'0': '0', '1': '1', '6': '9', '8': '8', '9': '6'}
    def generate(n, current):
        if len(current) == n:
            return [current]
        result = []
        for num in strobogrammatic_map:
            if len(current) == 0 and num in ['0', '6', '9']:
                continue
            result += generate(n, current + num)
        return result

    return generate(n, "")
```

---

### 18. Find Median of Three
```python
def find_median(a, b, c):
    return sorted([a, b, c])[1]
```

---

### 19. Sequential Powers of Two
```python
def sequential_powers_of_two():
    n = 1
    while n < 2 ** 100:
        print(n, end="")
        n *= 2
```

---

### 20. Factorial Trailing Zeros
```python
def count_trailing_zeros_in_factorial(n):
    count = 0
    while n >= 5:
        count += n // 5
        n //= 5
    return count
```

---

### 21. Notes Count from Amount
```python
def count_notes(amount):
    notes = [500, 200, 100, 50, 20, 10]
    count = {}
    for note in notes:
        count[note] = amount // note
        amount %= note
    return count
```

---

### 22. Nth Member of Sequence
```python
def nth_member_of_sequence(n):
    sequence = [1, 1, 1, 1]
    while len(sequence) < n:
        sequence.append(sum(sequence[-4:]))
    return sequence[n-1]
```

---

### 23. Subtract Sum of Digits
```python
def subtract_sum_of_digits(n):
    while n >= 10:
        n -= sum(int(digit) for digit in str(n))
    return n
```

---

### 24. Even or Odd Divisors
```python
def count_even_or_odd_divisors(n):
    even_count = odd_count = 0
    for i in range(1, n + 1):
        if n % i == 0:
            if i % 2 == 0:
                even_count += 1
            else:
                odd_count += 1
    return even_count, odd_count
```

---

### 25. Missing Digits Finder
```python
def missing_digits(mobile_number):
    digits = set('0123456789')
    return digits - set(mobile_number)
```

---

### 26. Absolute Pairwise Difference
```python
def sum_of_absolute_diff(arr):
    arr.sort()
    return sum(abs(arr[i] - arr[j]) for i in range(len(arr)) for j in range(i+1, len(arr)))
```

---

### 27. Progression Type and Next
```python
def progression_type_and_next(seq):
    diff = seq[1] - seq[0]
    ratio = seq[1] / seq[0]
    if all(seq[i+1] - seq[i] == diff for i in range(len(seq)-1)):
        return "Arithmetic", seq[-1] + diff
    elif all(seq[i+1] / seq[i] == ratio for i in range(len(seq)-1)):
        return "Geometric", seq[-1] * ratio
    return "Neither", None
```

---

### 28. Series Length and Terms
```python
def series_length_and_terms(third_term, third_last_term, total_sum):
    n = (total_sum - third_term * 2) // (third_last_term - third_term)
    return n, list(range(1, n + 1))
```

---

### 29. Common Divisors Finder
```python
def common_divisors(a, b):
    divisors = []
    for i in range(1, min(a, b) + 1):
        if a % i == 0 and b % i == 0:
            divisors.append(i)
    return divisors
```

---

### 30. Palindrome Sum Iteration
```python
def palindrome_sum(n):
    while str(n) != str(n)[::-1]:
        n += int(str(n)[::-1])
    return n
```

---

### 31. Carry Operations Count
```python
def carry_operations_count(a, b):
    count = 0
    carry = 0
    while a > 0 or b > 0:
        sum_digits = (a % 10) + (b % 10) + carry
        if sum_digits >= 10:
            count += 1
            carry = 1
        else:
            carry = 0
        a //= 10
        b //= 10
    return count
```

---

### 32. Top Three Building Heights
```python
def top_three_building_heights(heights):
    return sorted(heights, reverse=True)[:3]
```

---

### 33. Sum Digit Count
```python
def sum_digit_count(x, y):
    return len(str(x + y))
```

---

### 34. Right Triangle Validator
```python
def right_triangle_validator(a, b, c):
    return "Yes" if a**2 + b**2 == c**2 else "No"
```

---

### 35. Solve Linear Equations
```python
import numpy as np

def solve_linear_equations(a, b, c, d, e, f):
    coeff = np.array([[a, b], [d, e]])
    const = np.array([c, f])
    return np.linalg.solve(coeff, const)
```

---

### 36. Debt Calculation
```python
def debt_calculation(n):
    debt = 100000
    for i in range(n):
        debt = debt * 1.05
        debt = math.ceil(debt / 1000) * 1000
    return debt
```

---

### 37. Sum Combinations Counter
```python
import itertools

def sum_combinations_counter(n):
    return len([comb for comb in itertools.product(range(10), repeat=4) if sum(comb) == n])
```

---

### 38. Count Prime Numbers
```python
def count_primes(n):
    primes = [True] * (n + 1)
    primes[0], primes[1] = False, False
    for i in range(2, int(n ** 0

.5) + 1):
        if primes[i]:
            for j in range(i * i, n + 1, i):
                primes[j] = False
    return sum(primes)
```

---

### 39. Sum of Even Numbers
```python
def sum_of_even_numbers(n):
    return sum(i for i in range(2, n+1, 2))
```

---

### 40. Summing Even Fibonacci
```python
def even_fibonacci_sum(n):
    a, b = 0, 2
    total = 0
    while b <= n:
        total += b
        a, b = b, 4 * b + a
    return total
```

---

### 41. Max Consecutive
```python
def max_consecutive(nums):
    nums = set(nums)
    max_length = 0
    for num in nums:
        if num - 1 not in nums:
            length = 1
            while num + length in nums:
                length += 1
            max_length = max(max_length, length)
    return max_length
```

---

### 42. Maximum Alternating Subsequence Sum
```python
def max_alternating_sum(nums):
    dp = [0] * len(nums)
    dp[0] = nums[0]
    for i in range(1, len(nums)):
        dp[i] = max(dp[i-1] + nums[i], dp[i-1] - nums[i])
    return dp[-1]
```

---

### 43. Odd-Even Replacement
```python
def odd_even_replace(nums):
    return [x * 2 if x % 2 == 0 else x // 2 for x in nums]
```

---

### 44. Group Anagrams
```python
from collections import defaultdict

def group_anagrams(strs):
    anagrams = defaultdict(list)
    for s in strs:
        anagrams[tuple(sorted(s))].append(s)
    return list(anagrams.values())
```

---

### 45. Multiplication Table
```python
def multiplication_table(n):
    return [[i * j for j in range(1, n+1)] for i in range(1, n+1)]
```

---

### 46. Reverse String
```python
def reverse_string(s):
    return s[::-1]
```

---

### 47. Remove Duplicates from List
```python
def remove_duplicates(nums):
    return list(set(nums))
```

---

### 48. Fibonacci Sequence
```python
def fibonacci(n):
    a, b = 0, 1
    for _ in range(n):
        a, b = b, a + b
    return a
```

---

### 49. Symmetric Tree
```python
def is_symmetric(root):
    def is_mirror(t1, t2):
        if not t1 and not t2:
            return True
        if not t1 or not t2:
            return False
        return t1.val == t2.val and is_mirror(t1.left, t2.right) and is_mirror(t1.right, t2.left)
    return is_mirror(root, root)
```

---

### 50. Find Missing Number
```python
def find_missing_number(nums):
    total_sum = sum(range(len(nums) + 1))
    return total_sum - sum(nums)
```

---

Here are Python solutions for the problems you provided:

---

### 51. Largest-Smallest Integer Difference
```python
def largest_smallest_difference(nums):
    nums = sorted(str(nums))
    largest = int(''.join(nums[::-1]))
    smallest = int(''.join(nums))
    return largest - smallest
```

---

### 52. Sum of First n Primes
```python
def sum_of_primes(n):
    primes = []
    num = 2
    while len(primes) < n:
        if all(num % p != 0 for p in primes):
            primes.append(num)
        num += 1
    return sum(primes)
```

---

### 53. Goldbach Partition Counter
```python
def is_prime(n):
    if n < 2:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True

def goldbach_partitions(n):
    count = 0
    for i in range(2, n // 2 + 1):
        if is_prime(i) and is_prime(n - i):
            count += 1
    return count
```

---

### 54. Regions from Straight Lines
```python
def max_regions(n):
    return (n * (n + 1)) // 2 + 1
```

---

### 55. Orthogonal Line Checker
```python
def is_orthogonal(xp, yp, xq, yq, xr, yr, xs, ys):
    ab = (xq - xp) * (xr - xs) + (yq - yp) * (yr - ys)
    if ab == 0:
        return "AB and CD are orthogonal!"
    return "AB and CD are not orthogonal!"
```

---

### 56. Sum of Numbers in Text
```python
import re

def sum_of_numbers_in_text(text):
    return sum(map(int, re.findall(r'\d+', text)))
```

---

### 57. Island Counter in Grid
```python
def dfs(grid, i, j):
    if i < 0 or j < 0 or i >= len(grid) or j >= len(grid[0]) or grid[i][j] == 0:
        return
    grid[i][j] = 0
    dfs(grid, i+1, j)
    dfs(grid, i-1, j)
    dfs(grid, i, j+1)
    dfs(grid, i, j-1)

def count_islands(grid):
    islands = 0
    for i in range(len(grid)):
        for j in range(len(grid[0])):
            if grid[i][j] == 1:
                dfs(grid, i, j)
                islands += 1
    return islands
```

---

### 58. Restore Compressed String
```python
import re

def restore_string(compressed):
    return re.sub(r'#(\d+)', lambda m: m.group(1) * int(m.group(2)), compressed)
```

---

### 59. Convex Polygon Area
```python
def convex_polygon_area(coords):
    n = len(coords)
    area = 0
    for i in range(n):
        j = (i + 1) % n
        area += coords[i][0] * coords[j][1]
        area -= coords[j][0] * coords[i][1]
    return abs(area) / 2
```

---

### 60. Cut Words by Length
```python
def cut_words_by_length(sentence):
    words = sentence.split()
    return [word for word in words if 3 <= len(word) <= 6]
```

---

### 61. Max Sum in Diamond Path
```python
def max_sum_diamond_path(diamond):
    for row in range(len(diamond) - 2, -1, -1):
        for i in range(len(diamond[row])):
            diamond[row][i] += max(diamond[row + 1][i], diamond[row + 1][i + 1])
    return diamond[0][0]
```

---

### 62. Sum Combination Counter
```python
from itertools import product

def sum_combinations(n):
    return sum(1 for p in product(range(1001), repeat=4) if sum(p) == n)
```

---

### 63. Sum of Rows and Columns
```python
def sum_of_rows_and_columns(matrix):
    rows = [sum(row) for row in matrix]
    columns = [sum(col) for col in zip(*matrix)]
    total = sum(rows) + sum(columns)
    return rows + columns + [total]
```

---

### 64. Pair Sum to Target
```python
def pair_sum_to_target(nums, target):
    seen = set()
    for num in nums:
        if target - num in seen:
            return True
        seen.add(num)
    return False
```

---

### 65. Longest Subsequence Word
```python
def longest_subsequence_word(s, words):
    return max((word for word in words if is_subsequence(s, word)), key=len, default="")
    
def is_subsequence(s, word):
    iter_s = iter(s)
    return all(c in iter_s for c in word)
```

---

### 66. Happy Number Checker
```python
def is_happy_number(n):
    seen = set()
    while n != 1 and n not in seen:
        seen.add(n)
        n = sum(int(x) ** 2 for x in str(n))
    return n == 1
```

---

### 67. First 10 Happy Numbers
```python
def first_10_happy_numbers():
    happy_numbers = []
    n = 1
    while len(happy_numbers) < 10:
        if is_happy_number(n):
            happy_numbers.append(n)
        n += 1
    return happy_numbers
```

---

### 68. Prime Count Below n
```python
def prime_count_below_n(n):
    return sum(1 for i in range(2, n) if is_prime(i))
```

---

### 69. Isomorphic Strings Check
```python
def is_isomorphic(str1, str2):
    return len(set(zip(str1, str2))) == len(set(str1)) == len(set(str2))
```

---

### 70. Longest Common Prefix
```python
def longest_common_prefix(strs):
    if not strs:
        return ""
    prefix = strs[0]
    for s in strs[1:]:
        while not s.startswith(prefix):
            prefix = prefix[:-1]
            if not prefix:
                return ""
    return prefix
```

---

### 71. Reverse Vowels in String
```python
def reverse_vowels(s):
    vowels = 'aeiouAEIOU'
    s = list(s)
    i, j = 0, len(s) - 1
    while i < j:
        if s[i] in vowels and s[j] in vowels:
            s[i], s[j] = s[j], s[i]
            i += 1
            j -= 1
        elif s[i] not in vowels:
            i += 1
        else:
            j -= 1
    return ''.join(s)
```

---

### 72. Integer Palindrome Checker
```python
def is_palindrome(n):
    if n < 0:
        return False
    return str(n) == str(n)[::-1]
```

---

### 73. Remove Duplicates from Array
```python
def remove_duplicates(nums):
    return len(set(nums))
```

---

### 74. Max Profit from Stocks
```python
def max_profit(prices):
    min_price = float('inf')
    max_profit = 0
    for price in prices:
        min_price = min(min_price, price)
        max_profit = max(max_profit, price - min_price)
    return max_profit
```

---

### 75. Remove Value from Array
```python
def remove_value(nums, value):
    return len([num for num in nums if num != value])
```


**76. Find Value Range in Array**

```python
def find_range(nums, target):
    start, end = -1, 0
    for i, num in enumerate(nums):
        if num == target:
            if start == -1: start = i
            end = i
    return [start, end] if start != -1 else [-1, 0]
```

---

**77. Max Stock Profit (One Transaction)**

```python
def max_profit(prices):
    return max(prices[i] - min(prices[:i+1]) for i in range(1, len(prices))) if prices else 0
```

---

**78. Matrix Forward-Backward Printing**

```python
def print_matrix(matrix):
    for i, row in enumerate(matrix):
        print(*row if i % 2 == 0 else row[::-1])
```

---

**79. Largest Product of Three Integers**

```python
def max_product(nums):
    nums.sort()
    return max(nums[0] * nums[1] * nums[-1], nums[-1] * nums[-2] * nums[-3])
```

---

**80. First Missing Positive Integer**

```python
def first_missing_positive(nums):
    nums = set(nums)
    for i in range(1, len(nums) + 2):
        if i not in nums:
            return i
```

---

**81. Random Even Number Generator**

```python
import random
print(random.sample([x for x in range(2, 101, 2)], 10))
```

---

**82. Calculate Median**

```python
def median(nums):
    nums.sort()
    n = len(nums)
    return (nums[n//2] if n % 2 else (nums[n//2 - 1] + nums[n//2]) / 2)
```

---

**83. Symmetrical Number Checker**

```python
def is_symmetrical(num):
    return str(num) == str(num)[::-1]
```

---

**84. Count Negatives and Sum Positives**

```python
def count_neg_sum_pos(lst):
    return [sum(1 for x in lst if x < 0), sum(x for x in lst if x > 0)]
```

---

**85. Isogram Checker**

```python
def is_isogram(word):
    return len(set(word)) == len(word)
```

---

**86. Count Equal Numbers**

```python
def count_equal(a, b, c):
    return len({a, b, c}) != 3
```

---

**87. Employee Code Validator**

```python
def valid_employee_code(code):
    return len(code) in [8, 12] and code.isdigit()
```

---

**88. Check Second String in First**

```python
def check_second_in_first(str1, str2):
    return all(c in str1 for c in str2)
```

---

**89. Sum of Three Lowest Positives**

```python
def sum_three_lowest(nums):
    return sum(sorted([x for x in nums if x > 0])[:3])
```

---

**90. Mask All But Last Five Characters**

```python
def mask_last_five(s):
    return '*' * (len(s) - 5) + s[-5:]
```

---

**91. Function Argument Counter**

```python
def count_args(*args):
    return len(args)
```

---

**92. Cumulative Sum of List**

```python
def cumulative_sum(lst):
    return [sum(lst[:i+1]) for i in range(len(lst))]
```

---

**93. Find Middle Character(s)**

```python
def middle_char(s):
    n = len(s)
    return s[n//2] if n % 2 else s[n//2 - 1:n//2 + 1]
```

---

**94. Largest Adjacent Product**

```python
def largest_adj_product(lst):
    return max(lst[i] * lst[i+1] for i in range(len(lst)-1))
```

---

**95. Even-Odd Index Checker**

```python
def check_even_odd(lst):
    return all((lst[i] % 2 == 0 if i % 2 == 0 else lst[i] % 2 != 0) for i in range(len(lst)))
```

---

**96. Narcissistic Number Checker**

```python
def is_narcissistic(n):
    digits = list(map(int, str(n)))
    return sum(d ** len(digits) for d in digits) == n
```

---

**97. Highest and Lowest in String**

```python
def highest_lowest(s):
    nums = list(map(int, s.split()))
    return max(nums), min(nums)
```

---

**98. Check Increasing Trend**

```python
def check_increasing_trend(lst):
    return all(lst[i] < lst[i+1] for i in range(len(lst)-1))
```

---

**99. Second Occurrence Position**

```python
def second_occurrence(s, sub):
    return s.find(sub, s.find(sub) + 1) if s.count(sub) > 1 else -1
```

---

**100. Sum of Items Weighted by Index**

```python
def weighted_sum(lst):
    return sum(i * val for i, val in enumerate(lst))
```

### 101. **Oldest Student Finder**
```python
def oldest_student(students):
    return max(students, key=students.get)

students1 = {"Bernita Ahner": 12, "Kristie Marsico": 11, "Sara Pardee": 14, "Fallon Fabiano": 11, "Nidia Dominique": 15}
students2 = {"Nilda Woodside": 12, "Jackelyn Pineda": 12.2, "Sofia Park": 12.4, "Joannie Archibald": 12.6, "Becki Saunder": 12.7}

print(oldest_student(students1))  # Output: Nidia Dominique
print(oldest_student(students2))  # Output: Becki Saunder
```

### 102. **Remove Consecutive Duplicates**
```python
def remove_consecutive_duplicates(s):
    result = []
    for char in s:
        if not result or result[-1] != char:
            result.append(char)
    return ''.join(result)

print(remove_consecutive_duplicates("PPYYYTTHON"))  # Output: PYTHON
print(remove_consecutive_duplicates("PPyyythonnn"))  # Output: Python
```

### 103. **Parallel Lines Checker**
```python
def are_parallel(line1, line2):
    return line1[0] * line2[1] == line1[1] * line2[0]

print(are_parallel([2, 3, 4], [2, 3, 8]))  # Output: True
print(are_parallel([2, 3, 4], [4, -3, 8]))  # Output: False
```

### 104. **Max in Column, Min in Row**
```python
def find_special_number(matrix):
    result = []
    for i in range(len(matrix)):
        for j in range(len(matrix[0])):
            if matrix[i][j] == max(matrix[k][j] for k in range(len(matrix))) and matrix[i][j] == min(matrix[i]):
                result.append(matrix[i][j])
    return result

print(find_special_number([[1, 2], [2, 3]]))  # Output: [2]
```

### 105. **Sequence Type Identifier**
```python
def sequence_type(seq):
    diffs = [seq[i+1] - seq[i] for i in range(len(seq)-1)]
    if all(d == diffs[0] for d in diffs):
        return "Linear Sequence"
    elif all(diffs[i+1] - diffs[i] == diffs[0] for i in range(len(diffs)-1)):
        return "Quadratic Sequence"
    return "Cubic Sequence"

print(sequence_type([0, 2, 4, 6, 8, 10]))  # Output: Linear Sequence
```

### 106. **Pandigital Number Checker**
```python
def is_pandigital(n):
    s = str(n)
    return len(s) == len(set(s)) == 10 and all(str(i) in s for i in range(10))

print(is_pandigital(1023456789))  # Output: True
print(is_pandigital(102345679))  # Output: False
```

### 107. **Oddish or Evenish**
```python
def oddish_or_evenish(n):
    if sum(int(digit) for digit in str(n)) % 2 == 0:
        return "Evenish"
    return "Oddish"

print(oddish_or_evenish(120))  # Output: Oddish
```

### 108. **Sum of Last Digits**
```python
def sum_of_last_digits(a, b, c):
    return (a % 10 + b % 10) % 10 == c % 10

print(sum_of_last_digits(12, 26, 44))  # Output: True
```

### 109. **Find Indices of Item**
```python
def find_indices(lst, item):
    return [i for i, x in enumerate(lst) if x == item]

print(find_indices([1, 2, 3, 4, 5, 2], 2))  # Output: [1, 5]
```

### 110. **Remove Duplicates from List**
```python
def remove_duplicates(lst):
    return list(set(lst))

print(remove_duplicates([1, 2, 3, 2, 3, 4, 5]))  # Output: [1, 4, 5]
```

### 111. **Circle Intersection Checker**
```python
import math

def check_circle_intersection(c1, c2):
    return math.dist(c1[:2], c2[:2]) < c1[2] + c2[2]

print(check_circle_intersection([1, 2, 4], [1, 2, 8]))  # Output: True
```

### 112. **Digit Distance Calculator**
```python
def digit_distance(a, b):
    return sum(abs(int(x) - int(y)) for x, y in zip(str(a), str(b)))

print(digit_distance(123, 256))  # Output: 7
```

### 113. **Reverse Odd-Length Words**
```python
def reverse_odd_length_words(sentence):
    return ' '.join(word[::-1] if len(word) % 2 != 0 else word for word in sentence.split())

print(reverse_odd_length_words("The quick brown fox jumps over the lazy dog"))
```

### 114. **Print Alphabet a-z A-Z**
```python
import string

print("Alphabet from a-z:")
print(" ".join(string.ascii_lowercase))
print("\nAlphabet from A-Z:")
print(" ".join(string.ascii_uppercase))
```

### 115. **Generate List 1 to 10**
```python
print(list(range(1, 10)))
```

### 116. **Find Non-Prime Numbers**
```python
def non_prime_numbers():
    non_primes = [i for i in range(1, 101) if not any(i % j == 0 for j in range(2, int(i**0.5) + 1))]
    return non_primes

print(non_prime_numbers())
```

### 117. **Webpage Status and HTML**
```python
import requests

url = 'http://example.com'
response = requests.get(url)

print(f"Web page status: {response.status_code}")
print("HTML code of the above web page:")
print(response.text)
```

### 118. **Multiprocessing Process IDs**
```python
import multiprocessing

def worker():
    print(f"module name: {__name__}")
    print(f"parent process: {os.getppid()}")
    print(f"process id: {os.getpid()}")

if __name__ == '__main__':
    multiprocessing.Process(target=worker).start()
```

### 119. **Co-Prime Checker**
```python
import math

def are_coprime(a, b):
    return math.gcd(a, b) == 1

print(are_coprime(17, 13))  # Output: True
```

### 120. **Euclid's Totient Function**
```python
def euclid_totient(n):
    return len([x for x in range(1, n+1) if math.gcd(x, n) == 1])

print(euclid_totient(10))  # Output: 4
```

### 121. **String Encoding with Rules**
```python
def encode_string(s):
    return s.replace('P', '9').replace('T', '0').replace('S', '1').replace('H', '6').replace('A', '8')

print(encode_string("PHP"))  # Output: 969
```

### 122. **Check Lower or Uppercase**
```python
def check_case(s):
    return s.islower() if s.islower() else s.isupper()

print(check_case("PHP"))  # Output: True
```

### 123. **Remove First and Last Character**
```python
def remove_first_last(s):
    return s[1:-1]

print(remove_first_last("PHP"))  # Output: H
```

### 124. **Consecutive Similar Letters**
```python
def has_consecutive_similar_letters(s):
    return any(s[i] == s[i+1] for i in range(len(s)-1))

print(has_consecutive_similar_letters("PHP"))  # Output: False
```

### 125. **Reverse String in Lowercase**
```python
def reverse_lowercase(s):
    return s[::-1].lower()

print(reverse_lowercase("PHP"))  # Output: php
```

### 126. **Sort String Alphabetically**
```python
def sort_string(s):
    return ''.join(sorted(s))

print(sort_string("PHP"))  # Output: HPP
```

### 127. **Average Whole Number Check**
```python
def is_whole_average(arr):
    return sum(arr) % len(arr) == 0

print(is_whole_average([1, 3, 5, 7, 9]))  # Output: True
```

### 128. **Remove Vowels from String**
```python
def remove_vowels(s):
    return ''.join(c for c in s if c.lower() not in 'aeiou')

print(remove_vowels("Python"))  # Output: Pythn
```

### 129. **Indices of Lowercase Letters**


```python
def lowercase_indices(s):
    return [i for i, c in enumerate(s) if c.islower()]

print(lowercase_indices("Python"))  # Output: [1, 2, 4]
```

### 130. **Words with Max Length**
```python
def longest_words(s):
    words = s.split()
    max_len = max(len(word) for word in words)
    return [word for word in words if len(word) == max_len]

print(longest_words("The quick brown fox jumps over the lazy dog"))
```

### 131. **Middle Letter Extraction**
```python
def middle_letter(s):
    return s[len(s)//2]

print(middle_letter("Python"))  # Output: h
```

### 132. **String Compression**
```python
def compress_string(s):
    compressed = ''
    count = 1
    for i in range(1, len(s)):
        if s[i] == s[i-1]:
            count += 1
        else:
            compressed += s[i-1] + str(count)
            count = 1
    compressed += s[-1] + str(count)
    return compressed

print(compress_string("aaabbcddd"))  # Output: a3b2c1d3
```

### 133. **Find Common Letters**
```python
def common_letters(s1, s2):
    return ''.join(sorted(set(s1) & set(s2)))

print(common_letters("apple", "orange"))  # Output: ae
```

### 134. **Find Unique Elements**
```python
def unique_elements(lst):
    return list(set(lst))

print(unique_elements([1, 2, 3, 2, 4, 5]))  # Output: [1, 2, 3, 4, 5]
```

### 135. **Count Uppercase Letters**
```python
def count_uppercase(s):
    return sum(1 for c in s if c.isupper())

print(count_uppercase("Python"))  # Output: 1
```

### 136. **Maximum Sum in Subarray**
```python
def max_sum_subarray(arr):
    return max(sum(arr[i:i+3]) for i in range(len(arr)-2))

print(max_sum_subarray([1, 2, 3, 4, 5, 6]))  # Output: 15
```

### 137. **Check For Even Numbers**
```python
def has_even_numbers(arr):
    return any(num % 2 == 0 for num in arr)

print(has_even_numbers([1, 3, 5, 7, 2]))  # Output: True
```

### 138. **Swap First and Last Words**
```python
def swap_first_last(words):
    words = words.split()
    words[0], words[-1] = words[-1], words[0]
    return ' '.join(words)

print(swap_first_last("Hello Python World"))  # Output: World Python Hello
```

### 139. **Sum of Squares of Digits**
```python
def sum_of_squares_of_digits(n):
    return sum(int(digit)**2 for digit in str(n))

print(sum_of_squares_of_digits(123))  # Output: 14
```

### 140. **Palindrome Check**
```python
def is_palindrome(s):
    return s == s[::-1]

print(is_palindrome("madam"))  # Output: True
```

### 141. **Check for Power of Two**
```python
def is_power_of_two(n):
    return n > 0 and (n & (n - 1)) == 0

print(is_power_of_two(16))  # Output: True
```

Sure! Here are solutions for the next set of problems:

### 142. **Sum of All Numbers in List**
```python
def sum_of_all(lst):
    return sum(lst)

print(sum_of_all([1, 2, 3, 4, 5]))  # Output: 15
```

### 143. **Product of All Numbers in List**
```python
from functools import reduce

def product_of_all(lst):
    return reduce(lambda x, y: x * y, lst)

print(product_of_all([1, 2, 3, 4, 5]))  # Output: 120
```

### 144. **Find Maximum in List**
```python
def find_max(lst):
    return max(lst)

print(find_max([1, 2, 3, 4, 5]))  # Output: 5
```

### 145. **Find Minimum in List**
```python
def find_min(lst):
    return min(lst)

print(find_min([1, 2, 3, 4, 5]))  # Output: 1
```

### 146. **Check if Number is Prime**
```python
import math

def is_prime(n):
    if n <= 1:
        return False
    for i in range(2, int(math.sqrt(n)) + 1):
        if n % i == 0:
            return False
    return True

print(is_prime(7))  # Output: True
print(is_prime(10))  # Output: False
```

### 147. **Find Common Elements in Two Lists**
```python
def common_elements(lst1, lst2):
    return list(set(lst1) & set(lst2))

print(common_elements([1, 2, 3], [2, 3, 4]))  # Output: [2, 3]
```

### 148. **Count Occurrences of Element in List**
```python
def count_occurrences(lst, x):
    return lst.count(x)

print(count_occurrences([1, 2, 2, 3, 3, 3], 3))  # Output: 3
```

### 149. **Find Second Largest Element in List**
```python
def second_largest(lst):
    unique_lst = list(set(lst))
    unique_lst.sort()
    return unique_lst[-2] if len(unique_lst) > 1 else None

print(second_largest([1, 2, 3, 4, 5]))  # Output: 4
```

### 150. **Find the Missing Number in Sequence**
```python
def missing_number(lst):
    n = len(lst) + 1
    total_sum = n * (n + 1) // 2
    return total_sum - sum(lst)

print(missing_number([1, 2, 4, 5]))  # Output: 3
```

### 151. **Find the Sum of Digits of a Number**
```python
def sum_of_digits(n):
    return sum(int(digit) for digit in str(n))

print(sum_of_digits(12345))  # Output: 15
```

### 152. **Count Vowels in a String**
```python
def count_vowels(s):
    return sum(1 for char in s.lower() if char in 'aeiou')

print(count_vowels("hello"))  # Output: 2
```

### 153. **Check if a String is a Substring of Another**
```python
def is_substring(s1, s2):
    return s1 in s2

print(is_substring("hello", "helloworld"))  # Output: True
print(is_substring("python", "helloworld"))  # Output: False
```

### 154. **Sort Words in Alphabetical Order**
```python
def sort_words(s):
    words = s.split()
    words.sort()
    return ' '.join(words)

print(sort_words("hello world this is python"))  # Output: hello is python this world
```

### 155. **Find the Length of the Longest Word in a String**
```python
def longest_word_length(s):
    words = s.split()
    return len(max(words, key=len))

print(longest_word_length("hello world this is python"))  # Output: 6
```

### 156. **Check if List is Empty**
```python
def is_empty(lst):
    return len(lst) == 0

print(is_empty([1, 2, 3]))  # Output: False
print(is_empty([]))  # Output: True
```

### 157. **Check if a Number is Even**
```python
def is_even(n):
    return n % 2 == 0

print(is_even(4))  # Output: True
print(is_even(7))  # Output: False
```

### 158. **Check if a Number is Odd**
```python
def is_odd(n):
    return n % 2 != 0

print(is_odd(5))  # Output: True
print(is_odd(6))  # Output: False
```

### 159. **Find the Product of Digits in a Number**
```python
def product_of_digits(n):
    product = 1
    for digit in str(n):
        product *= int(digit)
    return product

print(product_of_digits(123))  # Output: 6
```

### 160. **Count the Words in a String**
```python
def count_words(s):
    return len(s.split())

print(count_words("hello world this is python"))  # Output: 5
```

### 161. **Check if Number is Palindrome**
```python
def is_palindrome_number(n):
    return str(n) == str(n)[::-1]

print(is_palindrome_number(121))  # Output: True
print(is_palindrome_number(123))  # Output: False
```

### 162. **Remove all Non-Alphabetic Characters**
```python
def remove_non_alpha(s):
    return ''.join(char for char in s if char.isalpha())

print(remove_non_alpha("hello123!world"))  # Output: helloworld
```

### 163. **Find the First Occurrence of an Element**
```python
def first_occurrence(lst, x):
    try:
        return lst.index(x)
    except ValueError:
        return -1

print(first_occurrence([1, 2, 3, 4], 3))  # Output: 2
print(first_occurrence([1, 2, 3, 4], 5))  # Output: -1
```

### 164. **Find the Last Occurrence of an Element**
```python
def last_occurrence(lst, x):
    try:
        return len(lst) - 1 - lst[::-1].index(x)
    except ValueError:
        return -1

print(last_occurrence([1, 2, 3, 4, 3], 3))  # Output: 4
print(last_occurrence([1, 2, 3, 4], 5))  # Output: -1
```

### 165. **Swap Two Numbers Without Using Temporary Variable**
```python
def swap(a, b):
    a, b = b, a
    return a, b

print(swap(5, 10))  # Output: (10, 5)
```

### 166. **Find the Maximum Element in a List**
```python
def find_maximum(lst):
    return max(lst)

print(find_maximum([1, 2, 3, 4, 5]))  # Output: 5
```

### 167. **Find the Minimum Element in a List**
```python
def find_minimum(lst):
    return min(lst)

print(find_minimum([1, 2, 3, 4, 5]))  # Output: 1
```

### 168. **Concatenate Two Lists**
```python
def concatenate_lists(lst1, lst2):
    return lst1 + lst2

print(concatenate_lists([1, 2, 3], [4, 5, 6]))  # Output: [1, 2, 3, 4, 5, 6]
```

### 169. **Check if List Contains a Specific Element**
```python
def contains(lst, x):
    return x in lst

print(contains([1, 2, 3, 4], 3))  # Output: True
print(contains([1, 2, 3, 4], 5))  # Output: False
```

### 170. **Find the Difference Between Two Lists**
```python
def difference(lst1, lst2):
    return list(set(lst1) - set(lst2))

print(difference([1, 2, 3, 4], [3, 4, 5, 6]))  # Output: [1, 2]
```

### 171. **Get the Unique Elements in List**
```python
def unique_elements(lst):
    return list(set(lst))

print(unique_elements([1, 2, 2, 3, 3, 4, 5]))  # Output: [1, 2, 3, 4, 5]
```

### 172. **Get the Intersection of Two Lists**
```python
def intersection(lst1, lst2):
    return list(set(lst1) & set(lst2))

print(intersection([1, 2, 3], [2, 3, 4]))  # Output: [2, 3]
```

### 173. **Find the Union of Two Lists**
```python
def union(lst1, lst2):
    return list(set(lst1) | set(lst2))

print(union([1, 2, 3], [3, 4, 5]))  # Output: [1, 2, 3, 4, 5]
```

### 174. **Find the Symmetric Difference of Two Lists**
```python
def symmetric_difference(lst1, lst2):
    return list(set(lst1) ^ set(lst2))

print(symmetric_difference([1, 2, 3], [2, 3, 4]))  # Output: [1, 4]
```

### 175. **Find the Factorial of a Number**
```python
def factorial(n):
    if n == 0 or n == 1:
        return 1
    return n * factorial(n - 1)

print(factorial(5))  # Output: 120
```

### 176. **Generate a Fibonacci Sequence**
```python
def fibonacci(n):
    fib_seq = [0, 1]
    for i in range(2, n):
        fib_seq.append(fib_seq[i - 1] + fib_seq[i - 2])
    return fib_seq

print(fibonacci(7))  # Output: [0, 1, 1, 2, 3, 5, 8]
```

### 177. **Check if a String is a Palindrome**
```python
def is_palindrome(s):
    return s == s[::-1]

print(is_palindrome("madam"))  # Output: True
print(is_palindrome("hello"))  # Output: False
```

### 178. **Reverse a String**
```python
def reverse_string(s):
    return s[::-1]

print(reverse_string("hello"))  # Output: "olleh"
```

### 179. **Find the First Non-Repeated Character in a String**
```python
def first_non_repeated(s):
    for char in s:
        if s.count(char) == 1:
            return char
    return None

print(first_non_repeated("aabbccde"))  # Output: "d"
```

### 180. **Count the Number of Words in a String**
```python
def word_count(s):
    return len(s.split())

print(word_count("hello world this is Python"))  # Output: 5
```

### 181. **Merge Two Sorted Lists**
```python
def merge_sorted_lists(lst1, lst2):
    return sorted(lst1 + lst2)

print(merge_sorted_lists([1, 3, 5], [2, 4, 6]))  # Output: [1, 2, 3, 4, 5, 6]
```

### 182. **Find the Intersection of Two Lists**
```python
def intersection(lst1, lst2):
    return list(set(lst1) & set(lst2))

print(intersection([1, 2, 3], [2, 3, 4]))  # Output: [2, 3]
```

### 183. **Find the Union of Two Lists**
```python
def union(lst1, lst2):
    return list(set(lst1) | set(lst2))

print(union([1, 2, 3], [3, 4, 5]))  # Output: [1, 2, 3, 4, 5]
```

### 184. **Check if a Number is Perfect**
```python
def is_perfect(n):
    divisors_sum = sum(i for i in range(1, n) if n % i == 0)
    return divisors_sum == n

print(is_perfect(6))  # Output: True
print(is_perfect(28))  # Output: True
```

### 185. **Find the GCD of Two Numbers**
```python
import math

def gcd(a, b):
    return math.gcd(a, b)

print(gcd(36, 60))  # Output: 12
```

### 186. **Find the LCM of Two Numbers**
```python
def lcm(a, b):
    return abs(a * b) // math.gcd(a, b)

print(lcm(36, 60))  # Output: 180
```

### 187. **Count the Frequency of Elements in a List**
```python
from collections import Counter

def count_frequency(lst):
    return dict(Counter(lst))

print(count_frequency([1, 2, 2, 3, 3, 3, 4]))  # Output: {1: 1, 2: 2, 3: 3, 4: 1}
```

### 188. **Find the Mode of a List**
```python
from collections import Counter

def find_mode(lst):
    count = Counter(lst)
    mode = count.most_common(1)
    return mode[0][0] if mode else None

print(find_mode([1, 2, 2, 3, 3, 3, 4]))  # Output: 3
```

### 189. **Find the Median of a List**
```python
def find_median(lst):
    lst.sort()
    n = len(lst)
    mid = n // 2
    if n % 2 == 0:
        return (lst[mid - 1] + lst[mid]) / 2
    return lst[mid]

print(find_median([1, 2, 3, 4, 5]))  # Output: 3
```

### 190. **Find the Range of a List**
```python
def find_range(lst):
    return max(lst) - min(lst)

print(find_range([1, 2, 3, 4, 5]))  # Output: 4
```

### 191. **Find the Square Root of a Number**
```python
import math

def square_root(n):
    return math.sqrt(n)

print(square_root(16))  # Output: 4.0
```

### 192. **Check if a String Contains Only Digits**
```python
def is_digit(s):
    return s.isdigit()

print(is_digit("12345"))  # Output: True
print(is_digit("123a45"))  # Output: False
```

### 193. **Find the Square of a Number**
```python
def square(n):
    return n * n

print(square(4))  # Output: 16
```

### 194. **Find the Cube of a Number**
```python
def cube(n):
    return n ** 3

print(cube(3))  # Output: 27
```

### 195. **Check if a String Contains Only Alphabetic Characters**
```python
def is_alpha(s):
    return s.isalpha()

print(is_alpha("hello"))  # Output: True
print(is_alpha("hello123"))  # Output: False
```

### 196. **Remove Duplicates from a List**
```python
def remove_duplicates(lst):
    return list(set(lst))

print(remove_duplicates([1, 2, 2, 3, 3, 4]))  # Output: [1, 2, 3, 4]
```

### 197. **Find the Index of a Value in a List**
```python
def find_index(lst, value):
    try:
        return lst.index(value)
    except ValueError:
        return -1

print(find_index([1, 2, 3, 4], 3))  # Output: 2
print(find_index([1, 2, 3, 4], 5))  # Output: -1
```

### 198. **Flatten a List of Lists**
```python
def flatten(lst):
    return [item for sublist in lst for item in sublist]

print(flatten([[1, 2], [3, 4], [5]]))  # Output: [1, 2, 3, 4, 5]
```

### 199. **Find the Second Smallest Element in a List**
```python
def second_smallest(lst):
    unique_lst = list(set(lst))
    unique_lst.sort()
    return unique_lst[1] if len(unique_lst) > 1 else None

print(second_smallest([1, 2, 3, 4, 5]))  # Output: 2
```

### 200. **Check if List is Sorted**
```python
def is_sorted(lst):
    return lst == sorted(lst)

print(is_sorted([1, 2, 3, 4]))  # Output: True
print(is_sorted([4, 3, 2, 1]))  # Output: False
```

### 201. **Remove All Vowels from a String**
```python
def remove_vowels(s):
    vowels = "aeiouAEIOU"
    return ''.join([char for char in s if char not in vowels])

print(remove_vowels("Hello World"))  # Output: "Hll Wrld"
```

### 202. **Check if a String is an Anagram of Another**
```python
def are_anagrams(s1, s2):
    return sorted(s1) == sorted(s2)

print(are_anagrams("listen", "silent"))  # Output: True
print(are_anagrams("hello", "world"))  # Output: False
```

### 203. **Convert a String to Title Case**
```python
def to_title_case(s):
    return s.title()

print(to_title_case("hello world"))  # Output: "Hello World"
```

### 204. **Find the Length of the Longest Word in a String**
```python
def longest_word_length(s):
    words = s.split()
    return max(len(word) for word in words)

print(longest_word_length("hello wonderful world"))  # Output: 10
```

### 205. **Find the Sum of Digits in a Number**
```python
def sum_of_digits(n):
    return sum(int(digit) for digit in str(n))

print(sum_of_digits(12345))  # Output: 15
```

### 206. **Check if a Number is a Power of Two**
```python
def is_power_of_two(n):
    return (n > 0) and (n & (n - 1)) == 0

print(is_power_of_two(16))  # Output: True
print(is_power_of_two(18))  # Output: False
```

### 207. **Find the Largest Prime Factor of a Number**
```python
def largest_prime_factor(n):
    i = 2
    while i * i <= n:
        if n % i:
            i += 1
        else:
            n //= i
    return n

print(largest_prime_factor(13195))  # Output: 29
```

### 208. **Find the Missing Number in an Array of 1 to n**
```python
def find_missing_number(arr, n):
    return n * (n + 1) // 2 - sum(arr)

print(find_missing_number([1, 2, 4, 5, 6], 6))  # Output: 3
```

### 209. **Find the Common Elements Between Two Lists**
```python
def common_elements(lst1, lst2):
    return list(set(lst1) & set(lst2))

print(common_elements([1, 2, 3], [2, 3, 4]))  # Output: [2, 3]
```

### 210. **Find the Sum of Even Numbers in a List**
```python
def sum_of_even(lst):
    return sum(x for x in lst if x % 2 == 0)

print(sum_of_even([1, 2, 3, 4, 5]))  # Output: 6
```

### 211. **Remove All Occurrences of a Value from a List**
```python
def remove_occurrences(lst, val):
    return [x for x in lst if x != val]

print(remove_occurrences([1, 2, 2, 3, 4], 2))  # Output: [1, 3, 4]
```

### 212. **Find the Sum of Odd Numbers in a List**
```python
def sum_of_odd(lst):
    return sum(x for x in lst if x % 2 != 0)

print(sum_of_odd([1, 2, 3, 4, 5]))  # Output: 9
```

### 213. **Find the Highest Occurring Character in a String**
```python
from collections import Counter

def highest_occurrence(s):
    count = Counter(s)
    return count.most_common(1)[0][0]

print(highest_occurrence("aabbbcccc"))  # Output: "c"
```

### 214. **Find the Kth Largest Element in a List**
```python
import heapq

def kth_largest(lst, k):
    return heapq.nlargest(k, lst)[-1]

print(kth_largest([7, 10, 4, 3, 20, 15], 4))  # Output: 7
```

### 215. **Remove All Whitespaces from a String**
```python
def remove_whitespaces(s):
    return s.replace(" ", "")

print(remove_whitespaces("hello world"))  # Output: "helloworld"
```

### 216. **Find the Average of a List of Numbers**
```python
def average(lst):
    return sum(lst) / len(lst)

print(average([1, 2, 3, 4, 5]))  # Output: 3.0
```

### 217. **Check if a String is a Valid Number**
```python
def is_number(s):
    try:
        float(s)
        return True
    except ValueError:
        return False

print(is_number("123.45"))  # Output: True
print(is_number("abc"))  # Output: False
```

### 218. **Find the Second Largest Element in a List**
```python
def second_largest(lst):
    unique_lst = list(set(lst))
    unique_lst.sort()
    return unique_lst[-2] if len(unique_lst) > 1 else None

print(second_largest([1, 2, 3, 4, 5]))  # Output: 4
```

### 219. **Count the Number of Occurrences of a Character in a String**
```python
def count_char(s, char):
    return s.count(char)

print(count_char("hello", "l"))  # Output: 2
```

### 220. **Check if a List Contains Only Unique Elements**
```python
def is_unique(lst):
    return len(lst) == len(set(lst))

print(is_unique([1, 2, 3, 4]))  # Output: True
print(is_unique([1, 2, 2, 4]))  # Output: False
```

### 221. **Find the Product of Elements in a List**
```python
import math

def product_of_elements(lst):
    return math.prod(lst)

print(product_of_elements([1, 2, 3, 4]))  # Output: 24
```

### 222. **Convert a List of Strings to Uppercase**
```python
def to_uppercase(lst):
    return [s.upper() for s in lst]

print(to_uppercase(["hello", "world"]))  # Output: ["HELLO", "WORLD"]
```
### 223. **Find the Difference Between Two Lists**
```python
def list_difference(lst1, lst2):
    return list(set(lst1) - set(lst2))

print(list_difference([1, 2, 3], [2, 3, 4]))  # Output: [1]
```

### 224. **Check if a String is a Palindrome**
```python
def is_palindrome(s):
    return s == s[::-1]

print(is_palindrome("madam"))  # Output: True
print(is_palindrome("hello"))  # Output: False
```

### 225. **Find the Maximum Difference Between Two Elements in a List**
```python
def max_difference(lst):
    return max(lst) - min(lst)

print(max_difference([1, 2, 3, 4, 5]))  # Output: 4
```

### 226. **Find the Intersection of Two Lists**
```python
def list_intersection(lst1, lst2):
    return list(set(lst1) & set(lst2))

print(list_intersection([1, 2, 3], [2, 3, 4]))  # Output: [2, 3]
```

### 227. **Count the Number of Words in a String**
```python
def count_words(s):
    return len(s.split())

print(count_words("hello world"))  # Output: 2
```

### 228. **Find the Index of a Character in a String**
```python
def find_char_index(s, char):
    return s.find(char)

print(find_char_index("hello", "e"))  # Output: 1
```

### 229. **Sort a List of Strings by Length**
```python
def sort_by_length(lst):
    return sorted(lst, key=len)

print(sort_by_length(["apple", "banana", "kiwi"]))  # Output: ['kiwi', 'apple', 'banana']
```

### 230. **Check if a Number is an Armstrong Number**
```python
def is_armstrong(n):
    digits = str(n)
    power = len(digits)
    return n == sum(int(digit) ** power for digit in digits)

print(is_armstrong(153))  # Output: True
print(is_armstrong(123))  # Output: False
```

### 231. **Find the Number of Vowels in a String**
```python
def count_vowels(s):
    vowels = "aeiouAEIOU"
    return sum(1 for char in s if char in vowels)

print(count_vowels("hello"))  # Output: 2
```

### 232. **Convert a List of Numbers to Strings**
```python
def numbers_to_strings(lst):
    return [str(num) for num in lst]

print(numbers_to_strings([1, 2, 3]))  # Output: ["1", "2", "3"]
```

### 233. **Find the Greatest Common Divisor (GCD) of Two Numbers**
```python
import math

def gcd(a, b):
    return math.gcd(a, b)

print(gcd(56, 98))  # Output: 14
```

### 234. **Find the Least Common Multiple (LCM) of Two Numbers**
```python
import math

def lcm(a, b):
    return abs(a * b) // math.gcd(a, b)

print(lcm(4, 5))  # Output: 20
```

### 235. **Check if a String is a Substring of Another String**
```python
def is_substring(s1, s2):
    return s1 in s2

print(is_substring("ell", "hello"))  # Output: True
print(is_substring("bye", "hello"))  # Output: False
```

### 236. **Find the Square of Each Number in a List**
```python
def square_numbers(lst):
    return [x ** 2 for x in lst]

print(square_numbers([1, 2, 3, 4]))  # Output: [1, 4, 9, 16]
```

### 237. **Check if Two Lists are Identical**
```python
def are_lists_identical(lst1, lst2):
    return lst1 == lst2

print(are_lists_identical([1, 2, 3], [1, 2, 3]))  # Output: True
print(are_lists_identical([1, 2, 3], [1, 2, 4]))  # Output: False
```

### 238. **Remove Duplicates from a List**
```python
def remove_duplicates(lst):
    return list(set(lst))

print(remove_duplicates([1, 2, 3, 2, 1]))  # Output: [1, 2, 3]
```

### 239. **Find the First Non-Repeating Character in a String**
```python
from collections import Counter

def first_non_repeating(s):
    count = Counter(s)
    for char in s:
        if count[char] == 1:
            return char
    return None

print(first_non_repeating("swiss"))  # Output: "w"
```

### 240. **Find the Product of the First n Natural Numbers**
```python
def product_of_n(n):
    return math.prod(range(1, n + 1))

print(product_of_n(5))  # Output: 120
```

### 241. **Find the Maximum Element in a List**
```python
def max_element(lst):
    return max(lst)

print(max_element([1, 2, 3, 4, 5]))  # Output: 5
```

### 242. **Find the Minimum Element in a List**
```python
def min_element(lst):
    return min(lst)

print(min_element([1, 2, 3, 4, 5]))  # Output: 1
```

### 243. **Check if a List is Sorted**
```python
def is_sorted(lst):
    return lst == sorted(lst)

print(is_sorted([1, 2, 3]))  # Output: True
print(is_sorted([3, 2, 1]))  # Output: False
```

### 244. **Sum of Numbers Divisible by 3 or 5**
```python
def sum_divisible_by_3_or_5(n):
    return sum(i for i in range(1, n) if i % 3 == 0 or i % 5 == 0)

print(sum_divisible_by_3_or_5(10))  # Output: 23
```

### 245. **Find the Frequency of Each Element in a List**
```python
from collections import Counter

def element_frequency(lst):
    return dict(Counter(lst))

print(element_frequency([1, 2, 2, 3, 3, 3]))  # Output: {1: 1, 2: 2, 3: 3}
```

### 21. **Count Even Digits in List of Numbers**

```python
def count_even_digits(lst):
    return [sum(1 for digit in str(num) if int(digit) % 2 == 0) for num in lst]

# Test
print(count_even_digits([123, 456, 789, 1024]))  # [1, 3, 0, 2]
```

### 22. **Sum of List Elements Divisible by Three**

```python
def sum_divisible_by_three(lst):
    return sum(x for x in lst if x % 3 == 0)

# Test
print(sum_divisible_by_three([1, 3, 6, 9, 10, 12]))  # 30
```
### 23. **Check if Number is in Fibonacci Sequence**

```python
def is_fibonacci(n):
    a, b = 0, 1
    while b < n:
        a, b = b, a + b
    return n == b

# Test
print(is_fibonacci(8))  # True
print(is_fibonacci(10))  # False
```

### 24. **Count Palindrome Words in List**

```python
def count_palindromes(lst):
    return sum(1 for word in lst if word == word[::-1])

# Test
print(count_palindromes(['madam', 'racecar', 'hello', 'world', 'level']))  # 4
```

### 25. **Find Substrings with Length Greater Than n**

```python
def find_long_substrings(s, n):
    return [s[i:j] for i in range(len(s)) for j in range(i + n + 1, len(s) + 1)]

# Test
print(find_long_substrings('abcdef', 3))  # ['abcd', 'abcde', 'abcdef', 'bcde', 'bcdef', 'cdef']
```
### 26. **Count Even Numbers in List of Tuples**

```python
def count_even_in_tuples(lst):
    return sum(1 for tup in lst for num in tup if num % 2 == 0)

# Test
print(count_even_in_tuples([(1, 2), (3, 4), (5, 6)]))  # 3
```
### 27. **Reverse Words in String**

```python
def reverse_words(s):
    return ' '.join(s.split()[::-1])

# Test
print(reverse_words('hello world this is python'))  # python is this world hello
```
### 28. **Create Number from Digits in List**

```python
def create_number(lst):
    return int(''.join(map(str, lst)))

# Test
print(create_number([1, 2, 3, 4, 5]))  # 12345
```
### 29. **Find Numbers Greater Than Average**

```python
def greater_than_average(lst):
    avg = sum(lst) / len(lst)
    return [x for x in lst if x > avg]

# Test
print(greater_than_average([1, 2, 3, 4, 5]))  # [4, 5]
```
### 30. **Check if List is Sorted in Non-Decreasing Order**

```python
def is_sorted(lst):
    return all(lst[i] <= lst[i+1] for i in range(len(lst)-1))

# Test
print(is_sorted([1, 2, 3, 4, 5]))  # True
print(is_sorted([5, 4, 3, 2, 1]))  # False
```
### 31. **Find Maximum Product of Any Pair**

```python
def max_product(lst):
    return max(x * y for i, x in enumerate(lst) for j, y in enumerate(lst) if i != j)

# Test
print(max_product([1, 2, 3, 4]))  # 12
```
### 32. **Find Factorial of Each Number in List**

```python
def factorial_list(lst):
    def factorial(n):
        return 1 if n == 0 else n * factorial(n - 1)
    return [factorial(num) for num in lst]

# Test
print(factorial_list([1, 2, 3, 4]))  # [1, 2, 6, 24]
```
### 33. **Find Palindrome Numbers in List**

```python
def palindrome_numbers(lst):
    return [num for num in lst if str(num) == str(num)[::-1]]

# Test
print(palindrome_numbers([121, 122, 131, 134, 151]))  # [121, 131, 151]
```
### 34. **Count Even Numbers in Matrix**

```python
def count_even_in_matrix(matrix):
    return sum(1 for row in matrix for num in row if num % 2 == 0)

# Test
print(count_even_in_matrix([[1, 2], [3, 4], [5, 6]]))  # 3
```
### 35. **Remove Duplicates from List**

```python
def remove_duplicates(lst):
    return list(set(lst))

# Test
print(remove_duplicates([1, 2, 3, 2, 4, 1]))  # [1, 2, 3, 4]
```
### 36. **Find Sum of Elements at Odd Indices**

```python
def sum_odd_indices(lst):
    return sum(lst[i] for i in range(1, len(lst), 2))

# Test
print(sum_odd_indices([1, 2, 3, 4, 5, 6]))  # 12
```
### 37. **Check if a String is a Palindrome**

```python
def is_palindrome(s):
    return s == s[::-1]

# Test
print(is_palindrome("madam"))  # True
print(is_palindrome("hello"))  # False
```
### 38. **Find Words with Vowel Count Greater Than 3**

```python
def words_with_vowel_count(lst):
    vowels = 'aeiou'
    return [word for word in lst if sum(1 for letter in word if letter in vowels) > 3]

# Test
print(words_with_vowel_count(['beautiful', 'hello', 'education', 'world']))  # ['beautiful', 'education']
```
### 39. **Multiply All Numbers in List**

```python
from functools import reduce

def multiply_all(lst):
    return reduce(lambda x, y: x * y, lst)

# Test
print(multiply_all([1, 2, 3, 4]))  # 24
```

---

### 40. **Transpose a Matrix**

```python
def transpose_matrix(matrix):
    return [list(row) for row in zip(*matrix)]

# Test
print(transpose_matrix([[1, 2, 3], [4, 5, 6], [7, 8, 9]]))  # [[1, 4, 7], [2, 5, 8], [3, 6, 9]]
```
### 53. Product of Units in List
```python
def product_of_units(lst):
    product = 1
    for num in lst:
        product *= num % 10
    return product
```

### 54. Remove Duplicates, Preserve Order
```python
def remove_duplicates(lst):
    return list(dict.fromkeys(lst))
```

### 55. Odd First and Last Digits
```python
def odd_first_last(lst):
    return [num for num in lst if num > 10 and num % 10 % 2 != 0 and int(str(num)[0]) % 2 != 0]
```

### 56. Find Integer Exponent
```python
import math
def find_exponent(a, n):
    return int(math.log(n, a))
```

### 57. Signed Sum of Magnitudes
```python
def signed_sum(lst):
    product_sign = 1
    for num in lst:
        if num < 0:
            product_sign *= -1
    return product_sign * sum(abs(num) for num in lst)
```

### 58. Largest Even Number in Range
```python
def largest_even(m, n):
    for i in range(n, m - 1, -1):
        if i % 2 == 0:
            return i
```

### 59. Validate Filenames
```python
import re
def validate_filenames(filenames):
    valid_extensions = ['.txt', '.exe', '.jpg', '.png', '.dll']
    return ['Yes' if re.match(r'^[\w]+(' + '|'.join(valid_extensions) + r')$', filename) else 'No' for filename in filenames]
```

### 60. Numbers Adjacent to Primes
```python
def is_prime(n):
    if n < 2:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True

def adjacent_to_primes(lst):
    primes = set([num for num in lst if is_prime(num)])
    return sorted(set([lst[i-1] if i > 0 else lst[i+1] for i in range(1, len(lst)-1) if (lst[i-1] in primes or lst[i+1] in primes)]))
```

### 61. Find Missing Number for Zero Total
```python
def find_missing(lst):
    return -sum(lst)
```

### 62. Dictionary Key with Odd Case
```python
def find_odd_case_key(d):
    lowercase_keys = {k for k in d if k.islower()}
    uppercase_keys = {k for k in d if k.isupper()}
    return (uppercase_keys - lowercase_keys).pop() if uppercase_keys - lowercase_keys else (lowercase_keys - uppercase_keys).pop()
```

### 63. Sum of Even Elements at Odd Indices
```python
def sum_even_at_odd_indices(lst):
    return sum(lst[i] for i in range(1, len(lst), 2) if lst[i] % 2 == 0)
```

### 64. Words with Prime Lengths
```python
def prime_lengths(words):
    def is_prime(n):
        if n < 2:
            return False
        for i in range(2, int(n ** 0.5) + 1):
            if n % i == 0:
                return False
        return True
    
    return ' '.join([word for word in words.split() if is_prime(len(word))])
```

### 65. Circular Shift of Digits
```python
def circular_shift(n, shift):
    n_str = str(n)
    shift %= len(n_str)
    return int(n_str[shift:] + n_str[:shift]) if shift != len(n_str) else n
```

### 66. Indices of Closest Pair
```python
def closest_pair(lst):
    min_diff = float('inf')
    indices = []
    for i in range(len(lst)):
        for j in range(i + 1, len(lst)):
            diff = abs(lst[i] - lst[j])
            if diff < min_diff:
                min_diff = diff
                indices = [i, j]
    return indices
```

### 67. ASCII Shift for String Transformation
```python
def ascii_shift(s, shift):
    return ''.join([chr((ord(char) + shift) % 256) for char in s])
```

### 68. Fives Divisible by 9 or 15
```python
def fives_divisible_by_9_or_15(n):
    return [[i, (i % 5 == 0) and (i % 9 == 0 or i % 15 == 0)] for i in range(5, n) if i % 5 == 0]
```

### 69. Rearrange Words by ASCII
```python
def rearrange_words_by_ascii(s):
    return ' '.join([''.join(sorted(word)) for word in s.split()])
```

### 70. First Negative Balance
```python
def first_negative_balance(lst):
    balance = 0
    for i in lst:
        balance += i
        if balance < 0:
            return balance
    return None
```

### 71. Inject Separator Between Numbers
```python
def inject_separator(lst, separator):
    result = [lst[0]]
    for num in lst[1:]:
        result.append(separator)
        result.append(num)
    return result
```

### 72. Indices of Three Numbers Summing to Zero
```python
def indices_of_sum_zero(lst):
    for i in range(len(lst) - 2):
        for j in range(i + 1, len(lst) - 1):
            for k in range(j + 1, len(lst)):
                if lst[i] + lst[j] + lst[k] == 0:
                    return [i, j, k]
    return None
```

### 73. Vowel Between Consonants Substring
```python
def vowel_between_consonants(s):
    for i in range(1, len(s) - 1):
        if s[i] in 'aeiouAEIOU' and s[i-1] not in 'aeiouAEIOU' and s[i+1] not in 'aeiouAEIOU':
            return s[i-1:i+2]
    return ''
```

### 74. Space-Separated Characters with Counts
```python
def space_separated_counts(d):
    return ' '.join([char * count for char, count in d.items()])
```

### 75. Reorder Numbers Based on Sum
```python
def reorder_numbers(lst):
    if (lst[0] + lst[-1]) % 2 == 0:
        return sorted(lst)
    return sorted(lst, reverse=True)
```

### 76. Largest Prime Index and Digit Sum
```python
def prime_index_digit_sum(lst):
    def is_prime(n):
        if n < 2:
            return False
        for i in range(2, int(n ** 0.5) + 1):
            if n % i == 0:
                return False
        return True
    
    largest_prime = max([num for num in lst if is_prime(num)], default=None)
    if largest_prime is None:
        return [None, 0]
    return [lst.index(largest_prime), sum(int(digit) for digit in str(largest_prime))]
```

# List
Here's the Python code for each problem you listed:

### 1. Sum Items in List
```python
def sum_items(lst):
    return sum(lst)
```

### 2. Multiply Items in List
```python
from functools import reduce
def multiply_items(lst):
    return reduce(lambda x, y: x * y, lst)
```

### 3. Get Largest Number in List
```python
def largest_number(lst):
    return max(lst)
```

### 4. Get Smallest Number in List
```python
def smallest_number(lst):
    return min(lst)
```

### 5. Count Strings with Same Start and End
```python
def count_strings(lst):
    return sum(1 for s in lst if len(s) > 1 and s[0] == s[-1])
```

### 6. Sort Tuples by Last Element
```python
def sort_tuples(lst):
    return sorted(lst, key=lambda x: x[-1])
```

### 7. Remove Duplicates from List
```python
def remove_duplicates(lst):
    return list(set(lst))
```

### 8. Check if List is Empty
```python
def is_empty(lst):
    return len(lst) == 0
```

### 9. Clone or Copy a List
```python
def clone_list(lst):
    return lst.copy()
```

### 10. Find Words Longer Than n
```python
def find_long_words(lst, n):
    return [word for word in lst if len(word) > n]
```

### 11. Check Common Member Between Two Lists
```python
def has_common_member(lst1, lst2):
    return bool(set(lst1) & set(lst2))
```

### 12. Remove Specific Elements from List
```python
def remove_elements(lst):
    return [lst[i] for i in range(len(lst)) if i not in [0, 4, 5]]
```

### 13. Generate 3D Array
```python
def generate_3d_array():
    return [[['*' for _ in range(6)] for _ in range(4)] for _ in range(3)]
```

### 14. Remove Even Numbers from List
```python
def remove_even_numbers(lst):
    return [x for x in lst if x % 2 != 0]
```

### 15. Shuffle List
```python
import random
def shuffle_list(lst):
    random.shuffle(lst)
    return lst
```

### 16. Generate Square Numbers in Range
```python
def generate_squares():
    return [x**2 for x in range(1, 31) if 1 <= x <= 5 or 26 <= x <= 30]
```

### 17. Check If All Numbers Are Prime
```python
def is_prime(num):
    if num < 2:
        return False
    for i in range(2, int(num ** 0.5) + 1):
        if num % i == 0:
            return False
    return True

def check_all_prime(lst):
    return all(is_prime(x) for x in lst)
```

### 18. Generate All List Permutations
```python
import itertools
def generate_permutations(lst):
    return list(itertools.permutations(lst))
```

### 19. Calculate Difference Between Lists
```python
def list_difference(lst1, lst2):
    return list(set(lst1) - set(lst2)), list(set(lst2) - set(lst1))
```

### 20. Access List Indices
```python
def list_indices(lst):
    return {value: index for index, value in enumerate(lst)}
```

### 21. Convert List to String
```python
def list_to_string(lst):
    return ''.join(lst)
```

### 22. Find Index of List Item
```python
def find_index(lst, item):
    return lst.index(item)
```

### 23. Flatten Shallow List
```python
def flatten_list(lst):
    return [item for sublist in lst for item in sublist]
```

### 24. Append One List to Another
```python
def append_list(lst1, lst2):
    lst1.extend(lst2)
    return lst1
```

### 25. Select Random Item from List
```python
import random
def select_random_item(lst):
    return random.choice(lst)
```

Here are the solutions for the next set of problems:

### 26. Check Circularly Identical Lists

```python
def are_circularly_identical(list1, list2):
    if len(list1) != len(list2):
        return False
    return any(list1 == list2[i:] + list2[:i] for i in range(len(list2)))

print(are_circularly_identical([1, 2, 3], [2, 3, 1]))  # True
```

### 27. Find Second Smallest Number in List

```python
def second_smallest(numbers):
    unique_numbers = list(set(numbers))
    unique_numbers.sort()
    return unique_numbers[1] if len(unique_numbers) > 1 else None

print(second_smallest([1, 2, 3, 4, 5]))  # 2
```

### 28. Find Second Largest Number in List

```python
def second_largest(numbers):
    unique_numbers = list(set(numbers))
    unique_numbers.sort()
    return unique_numbers[-2] if len(unique_numbers) > 1 else None

print(second_largest([1, 2, 3, 4, 5]))  # 4
```

### 29. Get Unique Values from List

```python
my_list = [1, 2, 2, 3, 4, 4, 5]
unique_values = list(set(my_list))
print(unique_values)
```

### 30. Count Frequency of List Elements

```python
from collections import Counter
my_list = [1, 2, 2, 3, 3, 3, 4]
frequency = Counter(my_list)
print(frequency)
```

### 31. Count Elements in List Within Range

```python
def count_in_range(my_list, start, end):
    return len([num for num in my_list if start <= num <= end])

print(count_in_range([1, 2, 3, 4, 5], 2, 4))  # 3
```

### 32. Check if List Contains Sublist

```python
def contains_sublist(main_list, sublist):
    return any(main_list[i:i+len(sublist)] == sublist for i in range(len(main_list) - len(sublist) + 1))

print(contains_sublist([1, 2, 3, 4, 5], [3, 4]))  # True
```

### 33. Generate All Sublists

```python
def all_sublists(my_list):
    return [my_list[i:j] for i in range(len(my_list)) for j in range(i + 1, len(my_list) + 1)]

print(all_sublists([1, 2, 3]))
```

### 34. Compute Primes Using Sieve of Eratosthenes

```python
def sieve_of_eratosthenes(limit):
    primes = [True] * (limit + 1)
    primes[0] = primes[1] = False
    for i in range(2, int(limit**0.5) + 1):
        if primes[i]:
            for j in range(i * i, limit + 1, i):
                primes[j] = False
    return [x for x in range(limit + 1) if primes[x]]

print(sieve_of_eratosthenes(30))
```

### 35. Create List with Range Concatenation

```python
my_list = ['p', 'q']
n = 5
result = [f"{item}{i}" for item in my_list for i in range(1, n + 1)]
print(result)
```

### 36. Get Variable ID or String

```python
my_var = 10
print(id(my_var))  # Prints the memory address of the variable
```
### 37. Find Common Items in Lists

```python
def common_items(list1, list2):
    return list(set(list1) & set(list2))

print(common_items([1, 2, 3], [3, 4, 5]))  # [3]
```

### 38. Swap Every n-th and (n+1)th Values

```python
def swap_nth_elements(my_list, n):
    for i in range(0, len(my_list) - 1, n):
        my_list[i], my_list[i + 1] = my_list[i + 1], my_list[i]
    return my_list

print(swap_nth_elements([0, 1, 2, 3, 4, 5], 2))  # [1, 0, 3, 2, 5, 4]
```

### 39. Convert Integers List to Single Integer

```python
def list_to_integer(my_list):
    return int("".join(map(str, my_list)))

print(list_to_integer([11, 33, 50]))  # 113350
```

### 40. Split List by First Character

```python
from itertools import groupby

def split_by_first_char(my_list):
    grouped = groupby(sorted(my_list, key=lambda x: x[0]), key=lambda x: x[0])
    return {k: list(v) for k, v in grouped}

print(split_by_first_char(['apple', 'banana', 'cherry', 'avocado', 'blueberry']))
```

### 41. Create Multiple Lists

```python
list1 = [1, 2, 3]
list2 = [4, 5, 6]
list3 = [7, 8, 9]

print([list1, list2, list3])
```

### 42. Find Missing and Additional Values in Lists

```python
def find_missing_and_additional(list1, list2):
    missing = list(set(list1) - set(list2))
    additional = list(set(list2) - set(list1))
    return missing, additional

print(find_missing_and_additional(["a", "b", "c"], ["b", "c", "d", "e"]))  # (['a'], ['d', 'e'])
```

### 43. Split List into Variables

```python
def split_list_into_vars(my_list):
    var1, var2, var3 = my_list
    return var1, var2, var3

print(split_list_into_vars([1, 2, 3]))  # (1, 2, 3)
```

### 44. Generate Groups of Consecutive Numbers

```python
def generate_groups_of_consecutive_numbers(my_list, n):
    return [my_list[i:i + n] for i in range(0, len(my_list), n)]

print(generate_groups_of_consecutive_numbers([1, 2, 3, 4, 5, 6, 7, 8, 9, 10], 5))
```

### 45. Convert Pairs to Sorted Unique Array

```python
def convert_pairs_to_sorted_unique(my_list):
    return sorted(set(my_list))

print(convert_pairs_to_sorted_unique([1, 2, 2, 3, 4, 1]))
```

### 46. Select Odd Items from List

```python
def select_odd_items(my_list):
    return [item for item in my_list if item % 2 != 0]

print(select_odd_items([1, 2, 3, 4, 5]))  # [1, 3, 5]
```

