public class insertionSort {

    public static void getInsertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int cur = arr[i];
            int prev = i-1;

            //finding out the correct pos to insert
            while (prev>=0 && arr[prev]>cur) {
                arr[prev+1] = arr[prev]; //push the other element.
                prev--;        
            }

            //insertion
            arr[prev+1] = cur;
        }
    }

    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        getInsertionSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
