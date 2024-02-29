public class largestSmallestNumber {
    public static int getLargest(int arr[]){
        int largest= Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>largest)
                largest=arr[i];
        }
        return largest;
    }
    public static int getSmallest(int arr[]){
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<smallest)
                smallest = arr[i];
        }
        return smallest;
    }
    public static void main(String[] args) {
        int arr[]={12,15, 1, 2, 3, 6,50, 3, 5};
        System.out.println("The largest element is: "+getLargest(arr));
        System.out.println("The smallest element is: "+getSmallest(arr));
    }
}
