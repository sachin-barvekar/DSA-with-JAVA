public class prefixSumofSubArr {
    public static void prefixSubArraySum(int arr[]){
        int prefixSum[]= new int[arr.length];
        int currentSum=0;
        int max = Integer.MIN_VALUE;

        //calculate prefix sum
        prefixSum[0]=arr[0];
        for(int i=1;i<prefixSum.length; i++){
            prefixSum[i]=prefixSum[i-1]+arr[i];
        }

        for(int i=0; i<arr.length; i++){
            int start=i;
            for(int j=i; j<arr.length; j++){
                int end= j;
                    currentSum =start==0? prefixSum[end] : prefixSum[end]-prefixSum[start-1];
            }
            if(currentSum>max)
                max=currentSum;
        }
        System.out.println("max sum is: " +max);
    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        prefixSubArraySum(arr);
    }
}
