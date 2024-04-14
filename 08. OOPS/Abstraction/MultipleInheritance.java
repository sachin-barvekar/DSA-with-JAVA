public class MultipleInheritance {
    public static void main(String[] args) {
        Bear b1  = new Bear();
        System.out.println(b1.food);
        System.out.println(b1.Eat);
        b1.eatGrass();
        b1.eatMeat();
    }
}

//multiple inheritance by using interfaces
interface Herbivore{
    public String food = "grass";
    void eatGrass();
}

interface Carnivore{
    public String Eat = "meat";
    void eatMeat();
}

class Bear implements Herbivore, Carnivore{
   public void eatGrass(){
        System.out.println("Bear can eat grass");
    }
   public void eatMeat(){
        System.out.println("Bear can be eat Meat");
    }
}   