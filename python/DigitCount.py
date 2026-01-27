# To count the count of each digit 
num=input("Enter a number: ")

for digit in set(num):
    count=0
    for ch in num:
        if ch==digit:
            count+=1
    print("Number", digit, "repeats", count, "times")