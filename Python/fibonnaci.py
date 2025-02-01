# Calculate Fibbonaci using recursion
def recursion_func(n):
    if n==0:
        return 0
    elif n==1:
        return 1
    else:
        return recursion_func(n-1)+recursion_func(n-2)
    

n = 10
print(f'Fibonnaci of {n} is {recursion_func(n)}')