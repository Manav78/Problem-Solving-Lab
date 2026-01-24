# To print reverse of a number

num = int(input("Enter a number: "))

revnum=0
while num>0:
    temp=num%10
    num=num//10
    revnum=(revnum*10)+temp
print("Reversed Number is : ",revnum)