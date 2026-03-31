# Create a dictionary of 5 subjects and marks. Print all subjects.
# Add a new subject and update marks of one subject.
# Count how many keys exist.

Subject={
    "MAD":90,
    "C#":85,
    "DWDM":90,
    "Java":100,
    "SQL":99
}

Subject["React"]=95
Subject["C#"]=95
for key,value in Subject.items():
    print(key, value)

print("\nTotal kyes: ", len(Subject))


print("Highest Marks: ",max(Subject.values()))

Student={
    "Name ":"Manav",
    "Roll no.": 153,
    "Class ":"MCA"
}

merged=  Student | Subject

print(merged)

