public class GettersSetters{
    public static void main(String[]args){
        Pen p = new Pen();
        p.setColor("Yellow");
        System.out.println(p.getColor());

        p.setTip(10);
        System.out.println(p.getTip());
    }
}

class Pen{
    private String color;
    private int tip;

    void setColor(String color){
        this.color=color; 
    }

    String getColor(){
       return this.color;
    }
    void setTip(int tip){
        this.tip=tip; 
    }

   int getTip(){
        return this.tip;
    }
}