public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Srushti");
        System.out.println(s2.name);
        Student s3 = new Student(12);
        System.out.println(s3.rollNo);

    }
}

class Student {
    String name;
    int rollNo;

    // Non -parameterized constructor
    Student() {
        System.out.println("Constructor called...");
    }

    // parameterized constructor
    Student(String name) {
        this.name = name;
    }

    Student(int rollNo) {
        this.rollNo = rollNo;
    }
}