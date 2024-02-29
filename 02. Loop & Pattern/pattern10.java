public class pattern10 {
    public static void main(String[] args) {
        int num = 1;
        for(int row= 1; row<=5; row++){
            for(int number=1; number<=row; number++){
                System.out.print(num);
                System.out.print("   ");
                num++;
            }
            System.out.println();
        }
    }
}
