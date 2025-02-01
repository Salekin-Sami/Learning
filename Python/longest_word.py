def find_longest_word(sentence):
    longest_word = ''
    for word in sentence.split():
        if len(word)>len(longest_word):
            longest_word = word
    return longest_word 

sentence = "The quick brown fox jumped over the lazy dog"
print(f"Longest Word: {find_longest_word(sentence)} and Length {len(sentence)}", )
