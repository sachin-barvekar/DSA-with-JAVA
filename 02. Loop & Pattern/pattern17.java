public class pattern17 {
    public static void pyramid(int n){
        for(int row = 1; row<=n; row++){
            for(int space= 1; space<=n-row; space++){
                System.out.print(" ");
            }
            for(int star=1; star<=2*row-1; star++){
                if(star%2!=0)
                    System.out.print(row);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pyramid(8);
    }
}
