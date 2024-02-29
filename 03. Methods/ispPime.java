public class ispPime {
//     //only for n>=2;
//     public static boolean isPrime(int n){
// //corner cases:
// if(n==2){
//     return true;
// }

//         for(int i=2; i<n; i++){
//             if(n%i==0){ //completely dividing
//                 return false;
//             }
//         }
//         return true;
//     }


//optimized approach
    public static boolean isPrime(int n){
        //corner cases:
        if(n==2){
            return true;
        }
        
                for(int i=2; i<=Math.sqrt(n); i++){
                    if(n%i==0){ //completely dividing
                        return false;
                    }
                }
                return true;
            }
    public static void main(String[] args) {
        System.out.println(isPrime(9));
    }
}
