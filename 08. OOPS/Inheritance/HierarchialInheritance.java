public class HierarchialInheritance {
    public static void main(String[] args) {
        Fish Shark = new Fish();
        Shark.breathes();
        Shark.swim();
        Bird Parrot = new Bird();
        Parrot.eat();
        Parrot.fly();
        Mammal Human = new Mammal();
        Human.eat();
        Human.walk();
    }
}

//Base Class
class Animal{
    String color;

    void eat(){
        System.out.println("Eats");
    }
    void breathes(){
        System.out.println("Breathes");
    }
    void skinColor(String color){
        this.color=color;
    }
}

//Derived class 1 from animal
class Fish extends Animal{
    void swim(){
        System.out.println("Can be swim");
    }
}

//Derived class 2 from animal
class Bird extends Animal{
    void fly(){
        System.out.println("Can be fly");
    }
}

//Derived class 3 from animal
class Mammal extends Animal{
    void walk(){
        System.out.println("Can be Walk");
    }
}