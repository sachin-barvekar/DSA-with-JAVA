public class decimalToBinary {
    public static int decimalToBinary(int num){
        int i=0;
        int ans= 0;
        while (num!=0) {
            int lastBit =num%2;
            ans = ans + lastBit*(int)Math.pow(10, i);
            num = num/2;
            i++;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(decimalToBinary(7));
    }
}
