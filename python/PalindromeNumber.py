# to check number is palindrome or not

num=int(input("Enter a number: "))
checknum=num
revnum=0
while num>0:
    temp=num%10
    revnum=(revnum*10)+temp
    num//=10
if checknum==revnum:
    print("Palindrome Number")
else:
    print("Not a Palindrome Number")