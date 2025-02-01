# write a function that removes duplicates from list using set
set3 = {5,1,2,2,3,3,4,4,4}
def remove_duplicates(lst):
    return list(set(lst))
print(remove_duplicates(set3))