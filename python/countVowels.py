# to check vowels in the word
str=input("Enter a word: ")
count=0
for i in str:
    if i in ('a','e','i','o','u'):
        count+=1
print("Total Vowels in the given word: ",count)