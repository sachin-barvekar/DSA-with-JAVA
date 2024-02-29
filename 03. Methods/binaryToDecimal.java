public class binaryToDecimal {
    public static int binaryToDecimal(int num){
        int i=0;
        int ans=0;
        while(num!=0){
            int lastDigit = num %10;
            ans = ans+lastDigit*(int)Math.pow(2, i);
            num=num/10;
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("Decimal of number is "+binaryToDecimal(1011));
    }
}
