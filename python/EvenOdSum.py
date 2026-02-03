# To calculate sum of even and odd numbers in an Array

size=int(input("How many elements you want to enter?: "))
arr=[] 
evensum=oddsum=0 
for i in range(0,size):
    arr.append(int(input()))
for i in range(0,size):
    if arr[i]%2==0:
        evensum+=arr[i]
    else:
        oddsum+=arr[i]
print("Even Sum= ",evensum,"\nOdd Sum= ",oddsum)