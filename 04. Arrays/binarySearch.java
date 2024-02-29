public class binarySearch {
    public static int binarySearch(int arr[], int key){
        int start=0;
        int end=arr.length-1;
      //  int index=0;
        while (start<=end) {
            int mid= (start+end)/2;
            if(arr[mid]==key)
                return mid;
            else if(arr[mid]<key) //key is present right subarray
                start=mid+1;
            else
                end= mid-1;
        }
        return -1;
   }
   public static void main(String[] args) {
     int arr[]={1,2,3,4,5,6};
     int key=7;
     System.out.println(binarySearch(arr, key));
   }
}
