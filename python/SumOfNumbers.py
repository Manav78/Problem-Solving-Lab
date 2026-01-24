# Sum of N Natural Numbers

num = int(input("Enter the range up to : "))
sum=0
for i in range(1,num+1):
    sum+=i
print("Sum of first ",num," natural numbers is: ",sum)
