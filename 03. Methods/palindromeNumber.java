public class palindromeNumber {
    public static int ReverseNumber(int num){
        int ans=0;
        int i=0;
        while (num!=0) {
            int lastDigit = num%10;
            ans = ans*10+lastDigit;
            num = num/10;
            i++;
        }
        return ans;
    }
    public static boolean isPalindrome(int num){
        if(num==ReverseNumber(num))
            return true;
        
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(102));
    }
}
