public class Interface {
    public static void main(String[] args) {
        King k = new King();
        k.move();
    }
}

interface ChessPlayer {
    //we only provide blueprint of move in interface
    void move();
}

class King implements ChessPlayer{
    //in this class we actually provide how move actually works
    public void move(){
        System.out.println("Up, down, left, right, diagonal- by 1 step");
    }
}

class Queen implements ChessPlayer{
    public void move(){
        System.out.println("Up, down, left, right, diagonal");
    }
}

class Rook implements ChessPlayer{
    public void move(){
        System.out.println("Up, down, left, right");
    }
}
