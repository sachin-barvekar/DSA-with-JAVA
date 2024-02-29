public class TransposedMatrix {
    public static void main(String[] args) {
        int[][] nums = { { 1, 4, 9 }, { 11, 4, 3 } };

        int[][] TransposedMatrix = new int[nums[0].length][nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                TransposedMatrix[j][i]=nums[i][j];
            }
        }
        for (int i = 0; i < TransposedMatrix.length; i++) {
            for (int j = 0; j < TransposedMatrix[0].length; j++) {
                System.out.print(TransposedMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
