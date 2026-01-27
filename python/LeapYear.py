# To check Leap year or not

year=int(input("Enter a Year: "))

if (year%400==0) or (year%100!=0 and year%4==0):
    print("Leap year")
else :
    print("Not a Leap Year")
