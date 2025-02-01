set1 = set([1,2,1,3,4,5,6,7,8,9,10])
print(set1)
set1.add(7)
set1.remove(3)
set1.discard(4)
set1.pop()
print(set1)

set3 = {1,2,3,4,5}
set4 = {4,5,6,7,8}
set5 = set3 | set4
set6 = set3 & set4
set7 = set3 - set4
set8 = set3 ^ set4
sqaure = {x**2 for x in range(10)}

my_set = {1,2,3,4,5}
for i in my_set:
    print(i)
my_set2 = {2,5,6,7,8,9}
if 3 in my_set:
    print("yes")