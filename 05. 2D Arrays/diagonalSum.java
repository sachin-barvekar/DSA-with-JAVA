public class diagonalSum {
    public static int printDiagonalSum(int matrix[][]){
        int primaryDiagonalSum=0;
        int secondaryDiagonalSum=0;
        // for(int i=0; i<matrix.length;i++){
        //     for(int j=0; j<matrix[0].length; j++){
        //         if(i==j){
        //             primaryDiagonalSum+=matrix[i][j];
        //         }
        //         else if(i+j==matrix[0].length-1){
        //             secondaryDiagonalSum+=matrix[i][j];
        //         }
        //     }
        // }
        for(int i=0; i<matrix.length; i++){
            //pd
             primaryDiagonalSum+=matrix[i][i];
             //sd
             if(i!=matrix.length-i-1)
             secondaryDiagonalSum+=matrix[i][matrix.length-i-1];
        }
        return primaryDiagonalSum+secondaryDiagonalSum;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(printDiagonalSum(matrix));
        System.out.println(matrix.length);
    }
}