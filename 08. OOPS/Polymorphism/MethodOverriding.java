public class MethodOverriding {
    public static void main(String[] args) {
        Deer d = new Deer();
        d.eat(); //it invokes the child class function because we create object of child class
    }
}

class Animal{
    void eat(){
        System.out.println("Eat everything");
    }
}

class Deer extends Animal{
    void eat(){
        System.out.println("Eat Grass Only");
    }
}
