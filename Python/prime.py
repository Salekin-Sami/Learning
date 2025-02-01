def prime_check(n1, n2):
    primes = []
    flag = 1 
    for i in range(n1, n2):
        if (i == 1 or i%2 == 0):
            continue
        j = 2
        while j*j <= i:
            if(i%j == 0):
                flag = 0
                break
            else:
                flag = 1
            j += 1
        if(flag == 1):  
            primes.append(i)
    return primes


n1 = 100
n2 = 500
primes = prime_check(n1, n2)
if len(primes) == 0:
    print("no prime numbers")
else:
    print(primes)