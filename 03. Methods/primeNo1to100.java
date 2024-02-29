public class primeNo1to100 {
    public static boolean isPrime(int num){ //helping function
        //corner cases:
        if(num==2){
            return true;
        }
        
                for(int i=2; i<=Math.sqrt(num); i++){
                    if(num%i==0){ //completely dividing
                        return false;
                    }
                }
                return true;
            }
    public static void primeInRange(int n){
        int count=0;
        for(int i=2; i<=n; i++){
            if(isPrime(i)){ //true
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println();
        System.out.println("count: "+count);
    }
    public static void main(String[] args) {
        primeInRange(100);
    }
}
