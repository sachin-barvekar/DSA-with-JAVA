import java.util.Scanner;

public class largeNdSmall {
    public static int largest(int matrix[][]){
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                maxi=Math.max(matrix[i][j], maxi);
            }
        }
        return maxi;
    }

    public static int smallest(int matrix[][]){
        int mini = Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                mini=Math.min(matrix[i][j], mini);
            }
        }
        return mini;
    }
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = new int[3][3];
        int n= matrix.length; int m = matrix[0].length;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println(largest(matrix));
        System.out.println(smallest(matrix));
    }
}
