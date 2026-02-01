# To count occurence of digitd
num = input("Enter a number: ")

for i in set(num):
    count=0
    for j in num:
        if i==j:
            count+=1 
    print(i ," -> ",count)    
    