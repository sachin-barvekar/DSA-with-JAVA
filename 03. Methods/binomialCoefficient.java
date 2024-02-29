public class binomialCoefficient {
    public static int factorial(int num){
        int fact=1;
        for(int i=num; i>=1; i--){
            fact=fact*i;
    }
    return fact;
    }
    public static int binomialCoefficient(int n, int r){
        int ncr = factorial(n)/(factorial(r)* factorial(n-r));
        return ncr;
    }
    public static void main(String[] args) {
        int n=5;
        int r= 2;
        System.out.println(binomialCoefficient(n, r));
    }
}
