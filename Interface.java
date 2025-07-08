public class Interface {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.move();

        Bear b = new Bear();
        b.eatGrass();
        b.eatMeat();
    }
}

// Define an interface
interface ChessPlayer {
    void move();
}

// Implenting an interface functions
class Queen implements ChessPlayer {
    public void move() {
        System.out.println("up,down,right,left,diagonal");
    }
}

class rook implements ChessPlayer {
    public void move() {
        System.out.println("Vertical,horizontal");
    }
}

interface Harbivore {
    void eatGrass();
}

interface Carnivore {
    void eatMeat();
}

class Bear implements Harbivore, Carnivore {
    public void eatGrass() {
        System.out.println("Can it grass also...");
    }

    public void eatMeat() {
        System.out.println("Can eat meat also....");
    }
}