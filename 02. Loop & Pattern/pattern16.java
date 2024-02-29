public class pattern16 {
        public static void rhombus(int n){
            for(int row = 1; row<=n; row++){
                for(int space=1; space<=n-row; space++){
                    System.out.print(" ");
                }
                for(int star=1; star<=n; star++){
                    if(star==1 || star==n || row==1||row==n)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            rhombus(8);
        }
    
}
