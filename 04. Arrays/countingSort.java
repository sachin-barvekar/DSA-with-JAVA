public class countingSort {
    public static void getCountingSort(int arr[]){

        int range = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            range = Math.max(range, arr[i]);
        }

        int countArr[]= new int[range+1];

        //setting countArr.
        for(int i=0; i<arr.length; i++){
            countArr[arr[i]]++;
        }

        //sorting
        int j=0;
        for(int i=0; i<countArr.length; i++){
            while (countArr[i]>0) {
                arr[j]=i;
                j++;
                countArr[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,4,1,3,2,4,3,5};
        getCountingSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
