public class HierarchialInheritance{
    public static void main(String [] args){
        Animal a = new Animal();
        System.out.print("Animals ");
        a.eat();

        Fish f = new Fish();
         System.out.print("Fish ");
        f.eat();
        f.swim();

        Bird b = new Bird();
        System.out.print("Birds ");
        b.eat();
        Mammals m = new Mammals();
         System.out.print("Mammals ");
        m.eat();
        m.walk();
    }
}

 class Animal{
    String color;

    void eat(){
        System.out.println("can eat");
    }
 }

class Fish extends Animal{
        void swim(){
            System.out.println("Fish swims...");
        }
 }

 class Bird extends Animal{
        void fly(){
            System.out.println("Bird flys...");
        }
 }

 class Mammals extends Animal{
      void walk(){
            System.out.println(" some Mammals walk...");
        }
 }