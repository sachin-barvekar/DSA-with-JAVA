public class superKeyword {
    public static void main(String[] args) {
        Horse h1 = new Horse();
        System.out.println(h1.color);
    }
}

class Animal{
    String color;
    Animal()
    {
        System.out.println("Animal constructor is called");
    }
}

class Horse extends Animal{
    Horse(){
        super(); //but you confused, without super keyword also we got same output but if we don't explicitly add super keyword then java by defaultly called super keyword.
        super.color = "Brown";
        System.out.println("Horse constructor is called");
    }
}