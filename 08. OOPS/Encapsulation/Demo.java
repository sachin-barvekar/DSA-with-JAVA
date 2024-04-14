public class Demo {  //class starting letter should be capital by naming convention
    public static void main(String[] args) {
        Pen p1 = new Pen(); //created pen object called p1; Pen() is the constructor and new keyword is used for allocation of memory
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.setColor("Yellow");
        System.out.println(p1.color);
        p1.color = "Black";
        System.out.println(p1.color);

        BankAccount b1 = new BankAccount();
        b1.userName = "sachinb";
        System.out.println(b1.userName);
        // b1.password = "abcde";
        b1.setPassword("acdefg");
        b1.setBalance(5000);
        System.out.println(b1.getPassword());
        System.out.println(b1.getBalance());
    }
}

class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip=newTip;
    }


}

class Student{
    String name;
    int age;
    float percentage;

    void calculatePercentage(int chem, int math, int phy){
        percentage = ((chem+phy+math)/3)*100;
    }
}

//Encapsulation
class BankAccount{
    public String userName;
    private String password;
    private int balance;

    String getPassword(){  // getters and setters for the private data
        return this.password;
    }

    void setPassword(String password){
        this.password = password;
    }

    int getBalance(){  // getters and setters for the private data
        return this.balance;
    }

    void setBalance(int balance){
        this.balance = balance;
    }
}