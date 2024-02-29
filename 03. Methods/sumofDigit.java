public class sumofDigit {
    public static int sumofDigit(int num){
        int sum=0;
        int i=0;
        while (num!=0) {
            int digit=num%10;
            sum=sum+digit;
            num=num/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sumofDigit(12345));
        System.out.println(Math.abs(11));
    }
}
