public class Inheritance {
    public static void main(String[] args) {
        Fish Shark = new Fish();
        Shark.eat();
        Shark.breathes();
        Shark.skinColor("Blue");
        System.out.println(Shark.color);
        Shark.fins(5);
        System.out.println(Shark.fins);
        Shark.swim();
    }
}

//Base class {Single level Inheritance}
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

//derived class or subclass
class Fish extends Animal{
    int fins;

    void fins(int fins){
        this.fins=fins;
    }
    void swim(){
        System.out.println("Can be swim");
    }
}
