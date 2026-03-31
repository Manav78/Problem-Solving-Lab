Menu={
    "Coffee":50,
    "Samosa":20,
    "Vadapav":20
}
bill={
}
count=0
total=0


while True:
    print("-----Menu-----")
    for key,value in Menu.items():
        count+=1
        print(count,key, value)
    print("--------------")
    print("\n1.Add/Update Item.\n2.Remove item.\n3.Generate Bill & Exit.")
    ch=int(input("Enter Your Choice: "))

    if ch==1:
        item=int(input("Enter Item No.:  "))
        quantity=int(input("Enter Quantity:  "))
        key = list(Menu.keys())
        value = list(Menu.values())
        count=0
        bill[key[item-1]]={"price":value[item-1],"qty":quantity}

    elif ch==2:
        item=int(input("Enter Item No. to Delete:  "))
        Bkey = list(bill.keys())
        del bill[Bkey[item-1]]

    elif ch==3:
        print("\n-----Bill-----")
        print("Sr.  Item   Price   Quantity\n")
        count=0
        for key,value in bill.items():
            count+=1
            print(count,". ",key," ", value["price"],"    ", value["qty"])
            total+=value["price"]*value["qty"]
        print("\nTotal Bill : ",total)
        print("Thanks for visiting...")
        print("--------------")
        break