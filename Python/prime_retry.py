def prime_list(n1,n2):
    primes = []
    ok = 1
    for i in range(n1,n2):
        if i >1 :
            for j in range(2,i):
                if(i%j==0):
                    ok = 0
                    break
                else:
                    ok = 1
            if ok == 1:
                primes.append(i)
    return primes

n1 = 100
n2 = 500
primes = prime_list(n1,n2)
print(primes)