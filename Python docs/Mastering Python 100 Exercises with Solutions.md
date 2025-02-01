[[ReadItLater]] [[Article]]

[Mastering Python: 100 Exercises with Solutions](https://www.w3resource.com/python-exercises/python_100_exercises_with_solutions.php)


Welcome to "100 Exercises with Solutions for Python Language"! This comprehensive collection of exercises is designed to help you master the fundamentals and advanced features of Python, a versatile and powerful programming language. Whether you're a beginner just starting out or an experienced developer looking to sharpen your skills, these exercises cover a wide range of topics. They provide practical challenges to enhance your understanding and proficiency in Python, enabling you to write efficient, maintainable, and scalable code.

**Exercise 1:**

Create a list with values ranging from 0 to 9.

**Solution:**

```
lst = list(range(10))
print(lst)
```

Output:

```
 [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
```

**Exercise 2:**

Convert a list of integers to a list of strings.

**Solution:**

```
lst = [1, 2, 3, 4, 5]
str_lst = list(map(str, lst))
print(str_lst)
```

Output:

```
 ['1', '2', '3', '4', '5']
```

**Exercise 3:**

Multiply all elements in a list by 2.

**Solution:**

```
lst = [1, 2, 3, 4, 5]
multiplied_lst = [x * 2 for x in lst]
print(multiplied_lst)
```

Output:

```
[2, 4, 6, 8, 10]
```

**Exercise 4:**

Extract all odd numbers from a list of integers.

**Solution:**

```
lst = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
odd_numbers = [x for x in lst if x % 2 != 0]
print(odd_numbers)
```

Output:

```
[1, 3, 5, 7, 9]
```

**Exercise 5:**

Replace all odd numbers in a list with -1.

**Solution:**

```
lst = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
replaced_lst = [-1 if x % 2 != 0 else x for x in lst]
print(replaced_lst)
```

Output:

```
[-1, 2, -1, 4, -1, 6, -1, 8, -1, 10]
```

**Exercise 6:**

Convert a list of integers to a list of booleans where all non-zero values become True.

**Solution:**

```
lst = [-1, 2, 0, -4, 5]
boolean_lst = [bool(x) for x in lst]
print(boolean_lst)
```

Output:

```
[True, True, False, True, True]
```

**Exercise 7:**

Replace all even numbers in a list with their negative.

**Solution:**

```
lst = [1, 2, 3, 4, 5, 6, 7, 8, 9]
neg_even_lst = [-x if x % 2 == 0 else x for x in lst]
print(neg_even_lst)
```

Output:

```
[1, -2, 3, -4, 5, -6, 7, -8, 9]
```

**Exercise 8:**

Create a 3x3 list of lists with random values and normalize it.

**Solution:**

```
import random
matrix = [[random.random() for _ in range(3)] for _ in range(3)]
mean = sum(sum(row) for row in matrix) / 9
std = (sum((x - mean) ** 2 for row in matrix for x in row) / 9) ** 0.5
normalized_matrix = [[(x - mean) / std for x in row] for row in matrix]
print(normalized_matrix) 
```

Output:

```
[[0.34306706561420186, 1.7297679842916804, -1.443812122309246], [-1.1000344556487114, 0.44974827677363144, -1.2563329881914924], [0.02737489828434499, 0.4974073324300242, 0.7528140087555657]]
```

**Exercise 9:**

Calculate the sum of the diagonal elements of a 3x3 matrix (list of lists).

**Solution:**

```
matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
diagonal_sum = sum(matrix[i][i] for i in range(3))
print(diagonal_sum)
```

Output:

```
15
```

**Exercise 10:**

Find the indices of non-zero elements in a list.

**Solution:**

```
lst = [1, 2, 0, 0, 4, 0]
non_zero_indices = [i for i, x in enumerate(lst) if x != 0]
print(non_zero_indices)
```

Output:

```
[0, 1, 4]
```

**Exercise 11:**

Reverse a list.

**Solution:**

```
lst = [1, 2, 3, 4, 5]
reversed_lst = lst[::-1]
print(reversed_lst)
```

Output:

```
[5, 4, 3, 2, 1]
```

**Exercise 12:**

Create a 3x3 identity matrix as a list of lists.

**Solution:**

```
identity_matrix = [[1 if i == j else 0 for j in range(3)] for i in range(3)]
print(identity_matrix)
```

Output:

```
[[1, 0, 0], [0, 1, 0], [0, 0, 1]]
```

**Exercise 13:**

Reshape a 1D list to a 2D list with 2 rows.

**Solution:**

```
lst = list(range(10))
reshaped_lst = [lst[:5], lst[5:]]
print(reshaped_lst)
```

Output:

```
[[0, 1, 2, 3, 4], [5, 6, 7, 8, 9]]
```

**Exercise 14:**

Stack two lists vertically.

**Solution:**

```
lst1 = [1, 2, 3]
lst2 = [4, 5, 6]
stacked_lst = [lst1, lst2]
print(stacked_lst)
```

Output:

```
[[1, 2, 3], [4, 5, 6]]
```

**Exercise 15:**

Get the common items between two lists.

**Solution:**

```
lst1 = [1, 2, 3, 4, 5]
lst2 = [3, 4, 5, 6, 7]
common_items = list(set(lst1) & set(lst2))
print(common_items)
```

Output:

```
[3, 4, 5]
```

**Exercise 16:**

Create a 5x5 list of lists with row values ranging from 0 to 4.

**Solution:**

```
matrix = [[i for i in range(5)] for _ in range(5)]
print(matrix)
```

Output:

```
[[0, 1, 2, 3, 4], [0, 1, 2, 3, 4], [0, 1, 2, 3, 4], [0, 1, 2, 3, 4], [0, 1, 2, 3, 4]]
```

**Exercise 17:**

Find the index of the maximum value in a list.

**Solution:**

```
lst = [3, 7, 1, 10, 4]
max_index = lst.index(max(lst))
print(max_index)
```

Output:

```
3
```

**Exercise 18:**

Normalize the values in a list between 0 and 1.

**Solution:**

```
lst = [2, 5, 10, 3, 8]
min_val, max_val = min(lst), max(lst)
normalized_lst = [(x - min_val) / (max_val - min_val) for x in lst]
print(normalized_lst)
```

Output:

```
[0.0, 0.375, 1.0, 0.125, 0.75]
```

**Exercise 19:**

Calculate the dot product of two lists.

**Solution:**

```
lst1 = [1, 2, 3]
lst2 = [4, 5, 6]
dot_product = sum(x * y for x, y in zip(lst1, lst2))
print(dot_product)
```

Output:

```
32
```

**Exercise 20:**

Count the number of elements in a list within a specific range.

**Solution:**

```
lst = [2, 5, 8, 10, 12, 15]
count_within_range = sum(5 <= x <= 12 for x in lst)
print(count_within_range)
```

Output:

```
4
```

**Exercise 21:**

Find the mean of each row in a 2D list.

**Solution:**

```
import random
matrix = [[random.random() for _ in range(4)] for _ in range(3)]
row_means = [sum(row) / len(row) for row in matrix]
print(row_means)
```

Output:

```
[0.6915055628886714, 0.6582373120045442, 0.6397767328136329]
```

**Exercise 22:**

Create a random 4x4 list of lists and extract the diagonal elements.

**Solution:**

```
import random
matrix = [[random.random() for _ in range(4)] for _ in range(4)]
diagonal_elements = [matrix[i][i] for i in range(4)]
print(diagonal_elements)
```

Output:

```
[0.21801982194433744, 0.6811834934253869, 0.7035225685261018, 0.2381369684708886]
```

**Exercise 23:**

Count the number of occurrences of a specific value in a list.

**Solution:**

```
lst = [1, 2, 3, 4, 2, 3, 2, 1]
count_of_2 = lst.count(2)
print(count_of_2)
```

Output:

```
3
```

**Exercise 24:**

Replace all values in a list with the mean of the list.

**Solution:**

```
lst = [10, 20, 30, 40, 50]
mean_val = sum(lst) / len(lst)
lst = [mean_val] * len(lst)
print(lst)
```

Output:

```
[30.0, 30.0, 30.0, 30.0, 30.0]
```

**Exercise 25:**

Find the indices of the maximum and minimum values in a list.

**Solution:**

```
lst = [5, 2, 8, 1, 7]
max_index = lst.index(max(lst))
min_index = lst.index(min(lst))
print("Index of max:", max_index)
print("Index of min:", min_index)
```

Output:

```
Index of max: 2
Index of min: 3
```

**Exercise 26:**

Create a 2D list with 1 on the border and 0 inside.

**Solution:**

```
matrix = [[1 if i == 0 or i == 4 or j == 0 or j == 4 else 0 for j in range(5)] for i in range(5)]
print(matrix)
```

Output:

```
[[1, 1, 1, 1, 1], [1, 0, 0, 0, 1], [1, 0, 0, 0, 1], [1, 0, 0, 0, 1], [1, 1, 1, 1, 1]]
```

**Exercise 27:**

Find the unique values and their counts in a list.

**Solution:**

```
lst = [1, 2, 3, 2, 4, 1, 5, 4, 6]
unique_values = list(set(lst))
counts = {x: lst.count(x) for x in unique_values}
print("Unique values:", unique_values)
print("Counts:", counts)
```

Output:

```
Unique values: [1, 2, 3, 4, 5, 6]
Counts: {1: 2, 2: 2, 3: 1, 4: 2, 5: 1, 6: 1}
```

**Exercise 28:**

Create a 3x3 list of lists with values ranging from 0 to 8.

**Solution:**

```
matrix = [[i + j*3 for i in range(3)] for j in range(3)]
print(matrix)
```

Output:

```
[[0, 1, 2], [3, 4, 5], [6, 7, 8]]
```

**Exercise 29:**

Calculate the exponential of all elements in a list.

**Solution:**

```
import math
lst = [1, 2, 3, 4, 5]
exponential_lst = [math.exp(x) for x in lst]
print(exponential_lst)
```

Output:

```
[2.718281828459045, 7.38905609893065, 20.085536923187668, 54.598150033144236, 148.4131591025766]
```

**Exercise 30:**

Swap two rows in a 2D list.

**Solution:**

```
import random
matrix = [[random.random() for _ in range(4)] for _ in range(3)]
matrix[0], matrix[1] = matrix[1], matrix[0]
print(matrix)
```

Output:

```
[[0.9076338086781157, 0.7017330953175929, 0.9071101156414131, 0.7963804534021283], [0.1506094428868956, 0.717811641354629, 0.199640773755009, 0.5015662651200953], [0.6747176907056143, 0.9966157783211159, 0.22320361325507043, 0.6811201297753695]]
```

**Exercise 31:**

Create a random 3x3 list of lists and replace all values greater than 0.5 with 1 and all others with 0.

**Solution:**

```
import random
matrix = [[random.random() for _ in range(3)] for _ in range(3)]
matrix = [[1 if x > 0.5 else 0 for x in row] for row in matrix]
print(matrix)
```

Output:

```
[[0, 1, 1], [1, 0, 1], [0, 1, 1]]
```

**Exercise 32:**

Find the indices of the top N maximum values in a list.

**Solution:**

```
lst = [10, 5, 8, 20, 15]
N = 2
top_indices = sorted(range(len(lst)), key=lambda i: lst[i], reverse=True)[:N]
print(top_indices)
```

Output:

```
[3, 4]
```

**Exercise 33:**

Calculate the mean of each column in a 2D list.

**Solution:**

```
import random
matrix = [[random.random() for _ in range(3)] for _ in range(4)]
column_means = [sum(row[i] for row in matrix) / len(matrix) for i in range(3)]
print(column_means)
```

Output:

```
[0.5213504257085785, 0.6484573100091598, 0.47727280812201445]
```

**Exercise 34:**

Normalize the values in each column of a 2D list.

**Solution:**

```
import random
matrix = [[random.random() for _ in range(3)] for _ in range(4)]
normalized_matrix = [[(x - min(col)) / (max(col) - min(col)) for x in col] for col in zip(*matrix)]
normalized_matrix = list(map(list, zip(*normalized_matrix)))
print(normalized_matrix)
```

Output:

```
[[0.0, 0.0, 1.0], [0.5862533402007957, 0.2971854665761528, 0.30676715747976807], [1.0, 1.0, 0.4559427452444642], [0.8555205149635996, 0.9893735744208437, 0.0]]
```

**Exercise 35:**

Concatenate two lists.

**Solution:**

```
lst1 = [1, 2, 3]
lst2 = [4, 5, 6]
concatenated_lst = lst1 + lst2
print(concatenated_lst)
```

Output:

```
[1, 2, 3, 4, 5, 6]
```

**Exercise 36:**

Create a 2D list with random values and sort each row.

**Solution:**

```
import random
matrix = [[random.random() for _ in range(4)] for _ in range(3)]
sorted_matrix = [sorted(row) for row in matrix]
print(sorted_matrix)
```

Output:

```
[[0.28068707911702817, 0.574715722056814, 0.6091238772389816, 0.7243160686088788], [0.08077308781723325, 0.2634152550419555, 0.3714086587664981, 0.5881583318738046], [0.2507019854506827, 0.4647657324258968, 0.7275116612000609, 0.8479103996736468]]
```

**Exercise 37:**

Check if all elements in a list are non-zero.

**Solution:**

```
lst = [1, 2, 3, 4, 5]
all_nonzero = all(lst)
print(all_nonzero)
```

Output:

```
True
```

**Exercise 38:**

Find the indices of the maximum value in each row of a 2D list.

**Solution:**

```
import random
matrix = [[random.random() for _ in range(4)] for _ in range(3)]
max_indices_per_row = [row.index(max(row)) for row in matrix]
print(max_indices_per_row)
```

Output:

```
[0, 3, 1]
```

**Exercise 39:**

Create a 2D list and replace all nan values with the mean of the list.

**Solution:**

```
import math
matrix = [[1, float('nan'), 3], [4, 5, float('nan')], [7, 8, 9]]
mean_val = sum(x for row in matrix for x in row if not math.isnan(x)) / sum(not math.isnan(x) for row in matrix for x in row)
matrix = [[mean_val if math.isnan(x) else x for x in row] for row in matrix]
print(matrix)
```

Output:

```
[[1, 5.285714285714286, 3], [4, 5, 5.285714285714286], [7, 8, 9]]
```

**Exercise 40:**

Calculate the mean of each row in a 2D list ignoring nan values.

**Solution:**

```
import math
matrix = [[1, 2, float('nan')], [4, float('nan'), 6], [7, 8, 9]]
row_means = [sum(x for x in row if not math.isnan(x)) / sum(1 for x in row if not math.isnan(x)) for row in matrix]
print(row_means)
```

Output:

```
[1.5, 5.0, 8.0]
```

**Exercise 41:**

Compute the sum of diagonal elements in a 2D list.

**Solution:**

```
import random
matrix = [[random.random() for _ in range(3)] for _ in range(3)]
diagonal_sum = sum(matrix[i][i] for i in range(3))
print(diagonal_sum)
```

Output:

```
0.4238758205862452
```

**Exercise 42:**

Convert radians to degrees for each element in a list.

**Solution:**

```
import math
lst = [math.pi / 2, math.pi, 3 * math.pi / 2]
degrees_lst = [math.degrees(x) for x in lst]
print(degrees_lst)
```

Output:

```
[90.0, 180.0, 270.0]
```

**Exercise 43:**

Calculate the pairwise Euclidean distance between two lists.

**Solution:**

```
lst1 = [1, 2, 3]
lst2 = [4, 5, 6]
euclidean_distance = sum((x - y) ** 2 for x, y in zip(lst1, lst2)) ** 0.5
print(euclidean_distance)
```

Output:

```
5.196152422706632
```

**Exercise 44:**

Create a list and set the values between the 25th and 75th percentile to 0.

**Solution:**

```
lst = [10, 20, 30, 40, 50]
percentile_25th = sorted(lst)[int(len(lst) * 0.25)]
percentile_75th = sorted(lst)[int(len(lst) * 0.75)]
lst = [0 if percentile_25th <= x <= percentile_75th else x for x in lst]
print(lst)

```

Output:

```
[10, 0, 0, 0, 50]
```

**Exercise 45:**

Calculate the element-wise square of the difference between two lists.

**Solution:**

```
lst1 = [1, 2, 3]
lst2 = [4, 5, 6]
squared_difference = [(x - y) ** 2 for x, y in zip(lst1, lst2)]
print(squared_difference)
```

Output:

```
[9, 9, 9]
```

**Exercise 46:**

Replace all even numbers in a list with the next odd number.

**Solution:**

```
lst = [2, 5, 8, 12, 15]
next_odd_lst = [x + 1 if x % 2 == 0 else x for x in lst]
print(next_odd_lst)
```

Output:

```
[3, 5, 9, 13, 15]
```

**Exercise 47:**

Create a 2D list and normalize each column by its range.

**Solution:**

```
import random
matrix = [[random.random() for _ in range(3)] for _ in range(3)]
min_col = [min(row[i] for row in matrix) for i in range(3)]
max_col = [max(row[i] for row in matrix) for i in range(3)]
normalized_matrix = [[(row[i] - min_col[i]) / (max_col[i] - min_col[i]) for i in range(3)] for row in matrix]
print(normalized_matrix)
```

Output:

```
[[0.0, 0.9791524044681176, 0.0], [1.0, 1.0, 0.6427236160933483], [0.12545213413765516, 0.0, 1.0]]
```

**Exercise 48:**

Compute the cumulative sum of elements along a given axis in a 2D list.

**Solution:**

```
import random
matrix = [[random.random() for _ in range(4)] for _ in range(3)]
cumulative_sum_axis1 = [[sum(row[:i+1]) for i in range(len(row))] for row in matrix]
print(cumulative_sum_axis1)
```

Output:

```
[[0.7546284663316909, 1.31481004728942, 1.8713995335850906, 2.308478041923004], [0.9197238360510473, 0.938647086950884, 1.24603043690484, 1.4655356220488251], [0.5592125265374753, 0.7216087739641586, 1.3660828220854073, 2.3651024686873945]]
```

**Exercise 49:**

Check if any element in a list is non-zero.

**Solution:**

```
lst = [0, 0, 0, 1, 0]
any_nonzero = any(lst)
print(any_nonzero)
```

Output:

```
True
```

**Exercise 50:**

Create a 2D list with random integers and replace all values greater than a certain threshold with that threshold.

**Solution:**

```
import random
matrix = [[random.randint(0, 100) for _ in range(4)] for _ in range(3)]
threshold = 75
matrix = [[min(x, threshold) for x in row] for row in matrix]
print(matrix)
```

Output:

```
 [[75, 54, 43, 75], [58, 3, 16, 27], [42, 23, 4, 75]]
```

**Exercise 51:**

Find the median of a list of numbers.

**Solution:**

```
lst = [2, 5, 1, 3, 4]
lst.sort()
n = len(lst)
median = (lst[n//2] if n % 2 != 0 else (lst[n//2 - 1] + lst[n//2]) / 2)
print(median)
```

Output:

```
3
```

**Exercise 52:**

Convert a list of numbers to a list of their logarithms.

**Solution:**

```
import math
lst = [1, 10, 100, 1000]
log_lst = [math.log10(x) for x in lst]
print(log_lst)
```

Output:

```
[0.0, 1.0, 2.0, 3.0]
```

**Exercise 53:**

Find the mode of a list of numbers.

**Solution:**

```
from collections import Counter
lst = [1, 2, 2, 3, 3, 3, 4, 4]
mode = Counter(lst).most_common(1)[0][0]
print(mode)
```

Output:

```
3
```

**Exercise 54:**

Flatten a list of lists.

**Solution:**

```
nested_lst = [[1, 2, 3], [4, 5], [6, 7, 8, 9]]
flat_lst = [x for sublist in nested_lst for x in sublist]
print(flat_lst)
```

Output:

```
[1, 2, 3, 4, 5, 6, 7, 8, 9]
```

**Exercise 55:**

Transpose a 2D list.

**Solution:**

```
matrix = [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
transposed_matrix = [[row[i] for row in matrix] for i in range(len(matrix[0]))]
print(transposed_matrix)
```

Output:

```
[[1, 4, 7], [2, 5, 8], [3, 6, 9]]
```

**Exercise 56:**

Remove duplicates from a list while preserving order.

**Solution:**

```
lst = [1, 2, 2, 3, 4, 4, 5]
seen = set()
unique_lst = [x for x in lst if not (x in seen or seen.add(x))]
print(unique_lst)
```

Output:

```
[1, 2, 3, 4, 5]
```

**Exercise 57:**

Find the intersection of two lists.

**Solution:**

```
lst1 = [1, 2, 3, 4]
lst2 = [3, 4, 5, 6]
intersection = list(set(lst1) & set(lst2))
print(intersection)
```

Output:

```
[3, 4]
```

**Exercise 58:**

Merge two dictionaries.

**Solution:**

```
dict1 = {'a': 1, 'b': 2}
dict2 = {'b': 3, 'c': 4}
merged_dict = {**dict1, **dict2}
print(merged_dict)
```

Output:

```
{'a': 1, 'b': 3, 'c': 4}
```

**Exercise 59:**

Sort a list of dictionaries by a key.

**Solution:**

```
lst = [{'name': 'Anej', 'age': 25}, {'name': 'Matteo', 'age': 22}, {'name': 'Eliza', 'age': 28}]
sorted_lst = sorted(lst, key=lambda x: x['age'])
print(sorted_lst)
```

Output:

```
[{'name': 'Matteo', 'age': 22}, {'name': 'Anej', 'age': 25}, {'name': 'Eliza', 'age': 28}]
```

**Exercise 60:**

Filter a dictionary based on its values.

**Solution:**

```
d = {'a': 1, 'b': 2, 'c': 3}
filtered_dict = {k: v for k, v in d.items() if v > 1}
print(filtered_dict)
```

Output:

```
{'b': 2, 'c': 3}
```

**Exercise 61:**

Create a dictionary from two lists.

**Solution:**

```
keys = ['a', 'b', 'c']
values = [1, 2, 3]
dict_from_lists = dict(zip(keys, values))
print(dict_from_lists)
```

Output:

```
{'a': 1, 'b': 2, 'c': 3}
```

**Exercise 62:**

Find the maximum value in a dictionary.

**Solution:**

```
d = {'a': 1, 'b': 2, 'c': 3}
max_val = max(d.values())
print(max_val)
```

Output:

```
3
```

**Exercise 63:**

Invert a dictionary (swap keys and values).

**Solution:**

```
d = {'a': 1, 'b': 2, 'c': 3}
inverted_dict = {v: k for k, v in d.items()}
print(inverted_dict)
```

Output:

```
{1: 'a', 2: 'b', 3: 'c'}
```

**Exercise 64:**

Create a dictionary with a default value.

**Solution:**

```
keys = ['a', 'b', 'c']
default_value = 0
default_dict = {k: default_value for k in keys}
print(default_dict)
```

Output:

```
{'a': 0, 'b': 0, 'c': 0}
```

**Exercise 65:**

Convert a dictionary to a list of tuples.
**Solution:**

```
d = {'a': 1, 'b': 2, 'c': 3}
list_of_tuples = list(d.items())
print(list_of_tuples)
```

Output:

```
[('a', 1), ('b', 2), ('c', 3)]
```

**Exercise 66:**

Find the length of the longest string in a list.

**Solution:**

```
lst = ['apple', 'banana', 'cherry']
max_length = max(len(x) for x in lst)
print(max_length)
```

Output:

```
6
```

**Exercise 67:**

Reverse the words in a sentence.

**Solution:**

```
sentence = "Hello world"
reversed_sentence = ' '.join(sentence.split()[::-1])
print(reversed_sentence)
```

Output:

```
world Hello
```

**Exercise 68:**

Check if a string is a palindrome.

**Solution:**

```
s = "racecar"
is_palindrome = s == s[::-1]
print(is_palindrome)
```

Output:

```
True
```

**Exercise 69:**

Remove punctuation from a string.

**Solution:**

```
import string
s = "Hello, world!"
s_without_punctuation = s.translate(str.maketrans('', '', string.punctuation))
print(s_without_punctuation)
```

Output:

```
Hello world
```

**Exercise 70:**

Count the occurrences of each character in a string.

**Solution:**

```
from collections import Counter
s = "hello"
char_count = Counter(s)
print(char_count)
```

Output:

```
Counter({'l': 2, 'h': 1, 'e': 1, 'o': 1})
```

**Exercise 71:**

Find the longest common prefix among a list of strings.

**Solution:**

```
lst = ["flower", "flow", "flight"]
if not lst:
    longest_common_prefix = ""
else:
    shortest_str = min(lst, key=len)
    longest_common_prefix = ""
    for i in range(len(shortest_str)):
        if all(x.startswith(shortest_str[:i+1]) for x in lst):
            longest_common_prefix = shortest_str[:i+1]
        else:
            break
print(longest_common_prefix) 
```

Output:

```
fl
```

**Exercise 72:**

Convert a string to a list of characters.

**Solution:**

```
s = "hello"
char_list = list(s)
print(char_list)
```

Output:

```
['h', 'e', 'l', 'l', 'o']
```

**Exercise 73:**

Generate a list of random integers.

**Solution:**

```
import random
random_integers = [random.randint(0, 100) for _ in range(10)]
print(random_integers)
```

Output:

```
[80, 44, 74, 37, 71, 93, 14, 52, 20, 21]
```

**Exercise 74:**

Shuffle a list.

**Solution:**

```
import random
lst = [1, 2, 3, 4, 5]
random.shuffle(lst)
print(lst)
```

Output:

```
[4, 5, 2, 1, 3]
```

**Exercise 75:**

Generate a random password of a given length.

**Solution:**

```
import string
import random
length = 8
password = ''.join(random.choice(string.ascii_letters + string.digits) for _ in range(length))
print(password)
```

Output:

```
TwfnMdEq
```

**Exercise 76:**

Calculate the factorial of a number.

**Solution:**

```
def factorial(n):
    return 1 if n == 0 else n * factorial(n - 1)
print(factorial(5))
```

Output:

```
120
```

**Exercise 77:**

Calculate the Fibonacci sequence up to a given number of terms.

**Solution:**

```
def fibonacci(n):
    fib_sequence = [0, 1]
    while len(fib_sequence) < n:
        fib_sequence.append(fib_sequence[-1] + fib_sequence[-2])
    return fib_sequence[:n]
print(fibonacci(10))
```

Output:

```
[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]
```

**Exercise 78:**

Check if a number is prime.

**Solution:**

```
def is_prime(n):
    if n <= 1:
        return False
    for i in range(2, int(n ** 0.5) + 1):
        if n % i == 0:
            return False
    return True
print(is_prime(17))
```

Output:

```
True
```

**Exercise 79:**

Find the greatest common divisor (GCD) of two numbers.

**Solution:**

```
def gcd(a, b):
    while b:
        a, b = b, a % b
    return a
print(gcd(48, 18))
```

Output:

```
6
```

**Exercise 80:**

Find the least common multiple (LCM) of two numbers.

**Solution:**

```
def lcm(a, b):
    def gcd(a, b):
        while b:
            a, b = b, a % b
        return a
    return a * b // gcd(a, b)
print(lcm(4, 5))
```

Output:

```
20
```

**Exercise 81:**

Sort a list of tuples by the second element.

**Solution:**

```
lst = [(1, 3), (2, 2), (3, 1)]
sorted_lst = sorted(lst, key=lambda x: x[1])
print(sorted_lst)
```

Output:

```
[(3, 1), (2, 2), (1, 3)]
```

**Exercise 82:**

Find the second largest number in a list.

**Solution:**

```
lst = [1, 2, 3, 4, 5]
second_largest = sorted(set(lst))[-2]
print(second_largest)
```

Output:

```
4
```

**Exercise 83:**

Check if a list is a palindrome.

**Solution:**

```
lst = [1, 2, 3, 2, 1]
is_palindrome = lst == lst[::-1]
print(is_palindrome)
```

Output:

```
True
```

**Exercise 84:**

Find the sum of the digits of a number.

**Solution:**

```
num = 12345
digit_sum = sum(int(digit) for digit in str(num))
print(digit_sum)
```

Output:

```
15
```

**Exercise 85:**

Find the product of the digits of a number.

**Solution:**

```
num = 12345
digit_product = 1
for digit in str(num):
    digit_product *= int(digit)
print(digit_product)
```

Output:

```
120
```

**Exercise 86:**

Check if a string is a valid number.

**Solution:**

```
s = "123.45"
is_valid_number = s.replace('.', '', 1).isdigit()
print(is_valid_number)
```

Output:

```
True
```

**Exercise 87:**

Find the length of the longest word in a sentence.

**Solution:**

```
sentence = "The quick brown fox jumps over the lazy dog"
longest_word_length = len(max(sentence.split(), key=len))
print(longest_word_length)
```

Output:

```
5
```

**Exercise 88:**

Convert a list of tuples to a dictionary.

**Solution:**

```
lst = [('a', 1), ('b', 2), ('c', 3)]
d = dict(lst)
print(d)
```

Output:

```
{'a': 1, 'b': 2, 'c': 3}
```

**Exercise 89:**

Filter a list of dictionaries based on a key value.

**Solution:**

```
lst = [{'name': 'Vivek', 'age': 25}, {'name': 'Esther', 'age': 22}, {'name': ' Neassa', 'age': 28}]                            
filtered_lst = [x for x in lst if x['age'] > 23]
print(filtered_lst)
```

Output:

```
[{'name': 'Vivek', 'age': 25}, {'name': ' Neassa', 'age': 28}]
```

**Exercise 90:**

Sort a list of tuples by multiple keys.

**Solution:**

```
lst = [(' Aisha', 'A', 25), (' Remy', 'B', 22), ('Meine', 'A', 28)]
sorted_lst = sorted(lst, key=lambda x: (x[1], x[2]))
print(sorted_lst)
```

Output:

```
[(' Aisha', 'A', 25), ('Meine', 'A', 28), (' Remy', 'B', 22)]
```

**Exercise 91:**

Merge two lists into a dictionary, using one as keys and the other as values.

**Solution:**

```
keys = ['a', 'b', 'c']
values = [1, 2, 3]
merged_dict = dict(zip(keys, values))
print(merged_dict)
```

Output:

```
{'a': 1, 'b': 2, 'c': 3}
```

**Exercise 92:**

Create a dictionary with keys as numbers and values as their squares.

**Solution:**

```
n = 5
squared_dict = {i: i**2 for i in range(1, n+1)}
print(squared_dict)
```

Output:

```
{1: 1, 2: 4, 3: 9, 4: 16, 5: 25}
```

**Exercise 93:**

Check if two strings are anagrams.

**Solution:**

```
s1 = "listen"
s2 = "silent"
are_anagrams = sorted(s1) == sorted(s2)
print(are_anagrams)
```

Output:

```
True
```

**Exercise 94:**

Count the number of vowels in a string.

**Solution:**

```
s = "hello world"
vowel_count = sum(1 for char in s if char in 'aeiou')
print(vowel_count)
```

Output:

```
3
```

**Exercise 95:**

Check if a string contains only digits.

**Solution:**

```
s = "12345"
is_digit_only = s.isdigit()
print(is_digit_only)
```

Output:

```
True
```

**Exercise 96:**

Find the first non-repeated character in a string.

**Solution:**

```
s = "swiss"
non_repeated_char = next((char for char in s if s.count(char) == 1), None)
print(non_repeated_char)
```

Output:

```
w
```

**Exercise 97:**

Reverse each word in a sentence.

**Solution:**

```
sentence = "Hello world"
reversed_words_sentence = ' '.join(word[::-1] for word in sentence.split())
print(reversed_words_sentence)
```

Output:

```
olleH dlrow
```

**Exercise 98:**

Generate a list of Fibonacci numbers up to a given number.

**Solution:**

```
def fibonacci_up_to(n):
    fib_sequence = [0, 1]
    while fib_sequence[-1] < n:
        fib_sequence.append(fib_sequence[-1] + fib_sequence[-2])
    return fib_sequence[:-1]
print(fibonacci_up_to(100))
```

Output:

```
[0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89]
```

**Exercise 99:**

Remove all whitespaces from a string.

**Solution:**

```
s = " a b c d "
s_without_whitespace = s.replace(' ', '')
print(s_without_whitespace)
```

Output:

```
abcd
```

**Exercise 100:**

Replace all occurrences of a substring in a string.

**Solution:**

```
s = "Hello world, welcome to the world of Python family."
new_s = s.replace('world', 'universe')
print(new_s)
```

Output:

```
Hello universe, welcome to the universe of Python family.
```

These exercises cover a wide range of basic and intermediate Python concepts, helping users to strengthen their understanding and proficiency in Python.

**Python Code Editor:**

**More to Come !**

**Do not submit any solution of the above exercises at here, if you want to contribute go to the appropriate exercise page.**

Test your Python skills with w3resource's [quiz](https://www.w3resource.com/quizzes/python/index.php)