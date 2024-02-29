public class pattern12 {
    public static void butterfly(int n){
             for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
             for(int col=1; col<=2*(n-row); col++){
                System.out.print(" ");
            }
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
         for(int row=n; row>=1; row--){
               for(int col=1; col<=row; col++){
                System.out.print("*");
            }
             for(int col=1; col<=2*(n-row); col++){
                System.out.print(" ");
            }
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
            }   
    }
    public static void main(String[] args) {
        butterfly(12);
    }
}
