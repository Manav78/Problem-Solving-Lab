# To count frequency of a character in a word or sentence
str = input("Enter a word or sentence: ")
key = input("Enter character to check occurence: ")
count=0
for i in str:
    if i==key:
        count+=1
print("'",key,"' Occured",count,"times.")