public class pr4 {
    public static boolean isPowerOf2(int n){
        return (n & (n-1))==0;
    }
    public static int setBits(int n){
        int count=0;
        while (n!=0) {
            if((n&1)==1){
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    public static int fastExponentiation(int a, int n){
        int ans=1;
        while(n>0){
            if((n&1)==1){ //check lsb is 1 or not 
                ans = ans * a;
            }
            a=a*a;
            n=n>>1;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOf2(14));
        System.out.println(setBits(15));
        System.out.println(fastExponentiation(3, 5));
    }
}
