public class pattern18 {
    public static void palindromePyramid(int n){
        for(int row = 1; row<=n; row++){
            int count=row;
            for(int space= 1; space<=n-row; space++){
                System.out.print(" ");
            }
            for(int num=1; num<=row; num++){
                    System.out.print(count);
               count--;
            } 
            //ascending
            for(int num=2; num<=row; num++){
                System.out.print(num);
        } 
            System.out.println();
        }
}
public static void main(String[] args) {
    palindromePyramid(5);
}
}
