public class subArr {
    public static void printSubArray(int arr[]){
        int ts= arr.length*(arr.length+1)/2; //formula for the printing number of the subarrays
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum=0;
                for(int start=i; start<=j; start++){
                        System.out.print(arr[start]+" ");
                        sum=sum+arr[start];
                    }
                    System.out.print("           ");
                    System.out.print("sum is: "+sum);
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays: "+ts);
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10};
        printSubArray(arr);
    }
}
