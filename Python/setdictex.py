paragraph = input("Enter a paragraph: ")
words= paragraph.split(" ")
print(words)
word_cnt = {}
for word in words:
    word = word.lower()
    if word in word_cnt:
        word_cnt[word] += 1
    else:
        word_cnt[word] = 1

word = list(word_cnt.keys())
word.sort()
for w in word:
    print(w,word_cnt[w])