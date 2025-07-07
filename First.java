public class First{
    public static void main(String [] args){
        Student s1 = new Student();
        s1.changeName("Sarth");
        System.out.println(s1.name);
    }
}

class Student{
    String name = "Srushti";
    int age = 21;

    void changeName(String newName){
        name = newName;
    }
}