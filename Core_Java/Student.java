package Core_Java;

public class Student {
    private int id;
    private String name;
    private int marks;

    public Student(int id, String name, int marks) {
        setId(id);
        setName(name);
        setMarks(marks);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        } else {
            System.out.println("Invalid Id");
        }
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;            
        } else {
            System.out.println("Invalid Name");
        }
    }

    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid Marks");
        }
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
    }

    public static void main(String[] args) {
        Student en = new Student(10, "Asma", 90);
        System.out.println(en);
        System.out.println(en.getId());
        System.out.println(en.getName());
        System.out.println(en.getMarks());
    }
}
