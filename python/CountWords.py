# To count words in a sentence
str=input("Enter a sentence: ")
count=0
flag=False
for i in str:
    if i!=" " and not flag:
        count+=1
        flag=True
    elif i==" ":
        flag=False
if count==0:
    print("No Words")
else:
    print("Total words are: ",count)

    