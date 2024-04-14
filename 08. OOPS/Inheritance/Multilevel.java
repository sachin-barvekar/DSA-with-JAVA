public class Multilevel {
    public static void main(String[] args) {
        Dog dobby = new Dog();
        dobby.eat();
        dobby.breathes();
        dobby.legs = 4;
        System.out.println(dobby.legs);
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

//Derived class
class Mammal extends Animal{
    int legs;
}

//Derived class
class Dog extends Mammal{
    String breed;
}