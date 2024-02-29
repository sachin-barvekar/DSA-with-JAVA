public class selectionSort {
    public static void getSelectionSort(int arr[]){
        for(int iteration=0; iteration<arr.length-1; iteration++){
            int minPos = iteration;
            for(int j=iteration+1; j<arr.length; j++){ //arr traverse for min position
                if(arr[minPos]>arr[j]){
                    minPos=j;
                }
            }
            //swap
            int temp = arr[iteration];
                    arr[iteration]= arr[minPos];
                    arr[minPos]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        getSelectionSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
