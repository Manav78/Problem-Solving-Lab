n1 = int(input("Enter 1st Number: "))
n2 = int(input("Enter 2nd Number: "))
print("1.Addition\n2.Subtraction\n3.Division\n4.Multiplication")
ch = int(input("Enter your choice: "))

if ch==1:
    print("Addition is: ",n1+n2)
elif ch==2:
    print("Subtraction is: ",n1-n2)
elif ch==3:
    print("Division is: ",n1//n2)
elif ch==4:
    print("Multiplication is: ",n1*n2)
else:
    print("Invalid choice!!!")