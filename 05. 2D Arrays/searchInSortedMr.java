public class searchInSortedMr {
    public static boolean searchInSortedMr(int matrix[][], int key){
        int row=matrix.length-1;
        int col=0;
        while (row>=0 && col<=matrix[0].length) {
            if(key == matrix[row][col]){
                System.out.println("key is present at: "+ row + "," +col);
                return true;
            }
            else if(key<matrix[row][col]){
                row--;
            }else{
                col++;
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key=40;
        System.out.println(searchInSortedMr(matrix, key));
    }
}
