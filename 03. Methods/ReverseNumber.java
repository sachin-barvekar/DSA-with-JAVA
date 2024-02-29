import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number that you want to reverse: ");
        int num=sc.nextInt();
        int ans=0;
        while (num!=0) {
            int LastDigit= num%10;
            ans = (ans*10)+LastDigit;
            num/=10;
        }
        System.out.println(ans);
    }
}
