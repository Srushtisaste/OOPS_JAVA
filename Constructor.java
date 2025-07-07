public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Srushti");
        System.out.println(s2.name);
        // Student s3 = new Student(12);
        // System.out.println(s3.rollNo);

        s1.name = "Srushti";
        s1.rollNo = 20;
        s1.password = "abc";
        s1.marks[0] = 100;
        s1.marks[1] = 80;
        s1.marks[2] = 60;

        // Student s4 = new Student(s1); // copy
        // s4.password = "xyz";
        // s1.marks[2] = 100;

        // for (int i = 0; i < 3; i++) {
        // System.out.println(s4.marks[i]);
        // }
        Student s4 = new Student(s1);
        for (int i = 0; i < 3; i++) {
            System.out.println(s4.marks[i]);
        }

    }
}

class Student {
    String name;
    int rollNo;
    String password;
    int marks[] = new int[3];

    // Student(Student s1) { // copy constructor
    // this.name = s1.name;
    // this.rollNo = s1.rollNo;
    // this.marks = s1.marks;

    // }

    Student(Student s1) {
        this.password = "sarth";
        marks = new int[3];
        for (int i = 0; i < 3; i++) {
            this.marks[i] = s1.marks[i];
        }
    }

    // Non -parameterized constructor
    Student() {
        System.out.println("Constructor called...");
    }

    // parameterized constructor
    Student(String name) {
        this.name = name;
    }

}