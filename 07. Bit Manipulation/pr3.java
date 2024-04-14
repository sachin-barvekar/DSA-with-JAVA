public class pr3 {
    public static int getIthbit(int n, int i){
        int bitMask = 1<<i;
        if((n & bitMask)==0) 
            return 0;
        return 1;
    }
    public static int setIthbit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int clearIthbit(int n, int i){
        int bitMask = 1<<i;
        return n & (~bitMask);
    }

    public static int updateIthbit(int n, int i, int newBit){
        // if(newBit==0)
        //    return clearIthbit(n, i);
        // else
        //     return setIthbit(n, i);

        n = clearIthbit(n, i);
        int bitMask = newBit<<i;
        return n | bitMask;
    }

    public static int clearIbit(int n, int i){
        int bitMask = (~0) <<i;
        return n & bitMask;
    }

    public static int clearRangeOfBit(int n, int i, int j){
        int a= (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitMask = a|b;
        return n & bitMask;
    }

    public static void main(String[] args) {
       System.out.println(getIthbit(6, 0));
       System.out.println(setIthbit(10, 2));
       System.out.println(clearIthbit(10, 1));
       System.out.println(updateIthbit(10, 1, 0));
       System.out.println(clearIbit(7, 2));
       System.out.println(clearRangeOfBit(10, 2, 4));
    }
}
