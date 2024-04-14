public class HybridInheritance {
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
        Shark s1 = new Shark();
        s1.breathes();
        Tuna t1 = new Tuna();
        t1.swim();
        Peacock p1 = new Peacock();
        p1.fly();
        p1.eat();
        Dog d1 = new Dog();
        d1.breathes();
        d1.walk();
    }
}

// Base Class
class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breathes() {
        System.out.println("Breathes");
    }

    void skinColor(String color) {
        this.color = color;
    }
}

// Derived class 1 from animal
class Fish extends Animal {
    void swim() {
        System.out.println("Can be swim");
    }
}

// Derived class 2 from animal
class Bird extends Animal {
    void fly() {
        System.out.println("Can be fly");
    }
}

// Derived class 3 from animal
class Mammal extends Animal {
    void walk() {
        System.out.println("Can be Walk");
    }
}

//Tuna class derived from Fish class
class Tuna extends Fish{
    
}

//Shark class derived from Fish class
class Shark extends Fish{
    
}

//Peacock class derived from Bird class
class Peacock extends Bird{
    
}

//Dog class derived from Mammel class
class Dog extends Mammal{
    
}

//Human class derived from Mammel class
class Human extends Mammal{
    
}

//Cat class derived from Mammel class
class Cat extends Mammal{
    
}