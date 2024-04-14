public class AbstractClass {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        h1.eat();
        h1.walk();
        System.out.println(h1.color);

        Chicken c1 = new Chicken();
        c1.eat();
        c1.walk();
        System.out.println(c1.color);

        // Animal cat = new Animal(); //we can't create instance of abstract class
    }
}

abstract class Animal{
    String color;
    //can have constructor
    Animal(){
        color = "Brown"; //with the help of constructor we initialized brown color for all animal
    }
    //can have abstract and non abstract methods
    void eat(){
        System.out.println("Can be eat");
    }

    abstract void walk(); //these abstract method only gives idea that is animal can be walk but not gives implementation i.e. How can be Animal walk.
}

class Horse extends Animal{

    void chageColor( ){
        color = "DarkBrown";
    }
    void walk(){ //idea gives in Abstract class animal that is implement by horse class
        System.out.println("Can be walks on 4 legs");
    }
}

class Chicken extends Animal{
    void chageColor( ){
        color = "White";
    }
    void walk(){   //idea gives in Abstract class animal that is implement by Chicken class
        System.out.println("Can be walks on 2 legs");
    }
}
