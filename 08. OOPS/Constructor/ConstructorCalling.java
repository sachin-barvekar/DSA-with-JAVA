public class ConstructorCalling {
    public static void main(String[] args) {
        Derived1 d1  = new Derived1();
    }
}

class Base{
    Base(){
        System.out.println("Base class constructor is called.");
    }
}

class Derived extends Base{
    Derived(){
        System.out.println("Derived class constructor is called");
    }
}

class Derived1 extends Derived{
    Derived1(){
        System.out.println("Derived1 class constructor is called");
    }
}
