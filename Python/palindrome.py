# check palindrome
def palindrome(s):
    ok = 1
    for w in range(0,len(s)//2):
        if (s[w]!=s[len(s)-w-1]):
            return False
    return True

s ="Sami"
print(palindrome(s))
