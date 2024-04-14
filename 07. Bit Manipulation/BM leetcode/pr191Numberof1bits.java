
public class pr191Numberof1bits {
    public static int hammingWeight(int n) {
        int setBits=0;
        while(n>0){
            if((n&1)==1)
                setBits++;
            n=n>>1;
        }
        return setBits;
    }
    public static void main(String[] args) {
        System.out.println(hammingWeight(10));
    }
}
