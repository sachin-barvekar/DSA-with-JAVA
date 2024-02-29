import java.util.Scanner;

class Maxof3No{
    public static void main(String[] args) {
        int a, b, c;
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        a = s1.nextInt();
        System.out.println("Enter the value of b: ");
        b= s1.nextInt();
        System.out.println("Enter the value of c: ");
        c = s1.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("a is bigger");
            }
        }else if(b> c){
                System.out.println("b is bigger");
            }
        else{
                System.out.println("C is bigger");
            }
    }
}