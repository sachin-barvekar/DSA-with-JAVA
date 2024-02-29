public class bubbleSort {
    public static void getBubbleSort(int arr[]){ //O(n^2)
        for(int iteration=0; iteration<arr.length-1; iteration++){
            int swap = 0;
            for(int j=0; j<arr.length-1-iteration; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
            System.out.println("the value of iteration is: "+iteration);
            if(swap==0)
                break;
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        getBubbleSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
