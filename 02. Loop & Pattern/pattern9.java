public class pattern9 {
    public static void main(String[] args) {
        for(int row=0; row<=4; row++){
            for(int col=0; col<=4-row; col++){
                System.out.print(col+1);
            }
            System.out.println();
        }
    }
}
