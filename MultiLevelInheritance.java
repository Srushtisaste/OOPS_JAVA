public class MultiLevelInheritance {

    public static void main(String[] args) {
        Animals a = new Animals();
        a.eat();

        Mammals m = new Mammals();
        m.eat();

        Dog d = new Dog();
        d.legs = 4;
        System.out.println(d.legs);
        d.bread = "Sheferd";
        System.out.println(d.bread);
    }

}

class Animals {
    String color;

    void eat() {
        System.out.println("Eats");
    }
}

class Mammals extends Animals {
    int legs;
}

class Dog extends Mammals {
    String bread;
}
