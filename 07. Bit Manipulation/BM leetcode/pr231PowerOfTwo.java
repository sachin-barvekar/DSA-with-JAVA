
public class pr231PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if(n<=0)
            return false;
        return (n&(n-1))==0;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));
        System.out.println(isPowerOfTwo(4));
        System.out.println(isPowerOfTwo(16));
        System.out.println(isPowerOfTwo(10));
    }
}
