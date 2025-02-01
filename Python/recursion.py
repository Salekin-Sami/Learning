def count_occr(s,c):
    if len(s)==0:
        return 0
    if s[0]==c:
        return 1+count_occr(s[1:],c)
    else:
        return count_occr(s[1:],c)
    
s = "Hello My name is Sami"
c = 'a'
print(f'Count of {c} in {s} is {count_occr(s,c)}')