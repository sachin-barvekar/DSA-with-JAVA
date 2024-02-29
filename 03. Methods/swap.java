public class swap {
    public static void swapTwoNum(int num1, int num2){
        int temp = num1;
        num1 =num2;
        num2 =temp;
        System.out.println("A : "+num1);
        System.out.println("B: "+num2);
    }
    public static void main(String[] args) {
        int a=10;
        int b=20;
        swapTwoNum(a, b);
    }
}
