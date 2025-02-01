var_list = [1,1,1,2,2,3,3,3]
var_unique = list(set(var_list))
freq = [0] * len(var_list)
for i in var_unique:
    for j in var_list:
        if i == j:
            freq[i] += 1
#freq = list(set(var_list))
print(var_unique)
print(freq)