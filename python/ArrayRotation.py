# To rotate an array by one position (left rotaion)
arr=[1,2,3,4,5]

# method 1
# temp=arr[0]
# for i in range(0,len(arr)-1):
#     arr[i]=arr[i+1]
# arr[len(arr)-1]=temp
# print(arr)

# method 2
arr=arr[1:]+arr[:1]
print(arr)