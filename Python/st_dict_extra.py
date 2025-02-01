# Create a program to count word occurrences in a string,treating words as case insensitive but retaining orginal case in output. prompt the user to enter a paragarph. use a dictionary to store the words and their counts. sort the dictionary by key and display the result. handle punctuation and special characters appropriately.
print("Word Counter")
print()
print("Enter a paragraph")
print()
paragraph = input("Enter a paragraph: ")
print()
words = paragraph.split()
word_count = {}
for word in words:
    word = word.lower()
    word = word.strip(",.?!")
    if word in word_count:
        word_count[word] += 1
    else:
        word_count[word] = 1
words = list(word_count.keys())
words.sort()
print("Word count:")
for word in words:
    print(word, word_count[word])