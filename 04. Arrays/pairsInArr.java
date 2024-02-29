public class pairsInArr {
    public static void getPair(int arr[]){
        int totalPairs=arr.length*(arr.length-1)/2; //formula for numbers of pairs can be formed in arr
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                System.out.print("("+arr[i] +","+ arr[j]+")");
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println("total pairs: " +totalPairs);
    }

    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        getPair(arr);
    }
}
