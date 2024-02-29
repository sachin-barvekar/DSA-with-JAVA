public class kadanesMaxSum {
    public static void kadanes(int arr[]){
        int ms=Integer.MIN_VALUE;
        int cs=0;
        
        for(int i=0; i<arr.length; i++){
            cs= cs+arr[i];
            ms = Math.max(ms, cs);
            if(cs<0) {//if cs is negative number then assign cs=0;
                cs=0; 
            }
        }
        System.out.println("Max subarr sum is: "+ms);
    }
    public static void main(String[] args) {
        int arr[]={-5, -7,-1,-2,-3,-4};
        kadanes(arr);
    }
}