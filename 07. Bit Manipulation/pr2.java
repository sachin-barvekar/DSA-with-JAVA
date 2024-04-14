public class pr2 {
    public static boolean isEven(int n){
        int bitMask = 1;
        if((n & bitMask)==0) //even number
            return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(isEven(4));
        System.out.println(isEven(5));
        System.out.println(isEven(6));
    }
}
