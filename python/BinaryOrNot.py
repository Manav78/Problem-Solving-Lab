# To check the given number is binary or not
num = input("Enter a Number: ")
flag=True
for i in num:
    if(i!='0' and i!='1'):
        flag=False
if flag:
    print(num," is a Binary Number")
else:
    print(num," is Not a Binary Number")