public class MethodOverriding{

    public static void main(String[] args){
        Deer d = new Deer();
            d.eat();

        

    }

}

class Animal{
    void eat(){
        System.out.println("Eat anything...");
    }
}

class Deer{
    void eat(){
        System.out.println("Eat Grass..");
    }
}