public class pattern7 {
    public static void main(String[] args) {
        for(int row=1; row<=4; row++){
            for(int col=1; col<=5; col++){
                if(row==1 || row==4)
                    System.out.print("*");
                else if(col==1 || col==5)
                    System.out.print("*");
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
}
