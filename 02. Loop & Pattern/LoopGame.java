import java.util.Scanner;

public class LoopGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        do{
            if(num%10==0){
                System.out.println("Congrats you have enter number multiple of 10. number is: "+num);
                break;
            }
            System.out.println("number is not multiple of 10..please try again");
            num=sc.nextInt();
        }while(true);

        System.out.println("Second game start: ");
        System.out.println("Enter second num:");
        int num2 = sc.nextInt();
        do{
            if(num2%10==0){
                continue;
            }
            System.out.println("number is: "+num2);
            num2=sc.nextInt();
        }while(true);
    }
}
