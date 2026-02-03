# To find duplicates values in array
arr=[1,2,3,4,3,1]
flag=False
print("Original Array: ",arr)
print("Repeated values: ")
for i in range(0,len(arr)):
    for j in range(i+1,len(arr)):
        if(arr[i]==arr[j]):
            flag=True
        if(flag):
           print(arr[i])
           flag=False