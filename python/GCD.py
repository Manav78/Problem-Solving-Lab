# To find GCD of two numbers

num1=int(input("Enter 1st Number: "))
num2=int(input("Enter 2nd Number: "))
smallest=0
if num1>num2:
    smallest=num2
else:
    smallest=num1

for i in range(1,smallest//2):
     if num1%i==0 and num2%i==0:
         gcd=i
print("GCD is: ",gcd)