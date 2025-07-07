public class Abstraction{
    public static void main(String[] args){

        Mustang m = new Mustang();

        

        Horse h = new Horse();
        h.walk();

        Chicken c = new Chicken();
        c.walk();

        
    }
}

abstract class Animal{
     String color = "Brown";

    Animal(){
        System.out.println("Animal constructor called...");
       
    }
       void eat(){
        System.out.println("Aniaml eats");
       }

       abstract void walk();
}

class Horse extends Animal{

     Horse(){
        System.out.println("Horse constructor called...");
       
    }

    void changeColor(){
        color = "Black";
    }
    void walk(){
        System.out.println("Walk with 4 legs");
    }

}

class Chicken extends Animal{
     void walk(){
        System.out.println("Walk with 2 legs");
    }
}

class Mustang extends Horse{


    Mustang(){
        System.out.println("Mustang constructor called...");
       
    }

}