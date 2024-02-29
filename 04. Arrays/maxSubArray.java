public class maxSubArray {
    public static void maxSubArraySum(int arr[]){
        int currentSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                currentSum=0;
                for(int start=i; start<=j; start++){
                         currentSum=currentSum+arr[start];
                    }
                    if(currentSum>maxSum)
                    maxSum=currentSum;
                }
            }
            System.out.println("max  sum: "+maxSum);
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        maxSubArraySum(arr);
    }
}
