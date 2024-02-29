public class product {
    public static int product(int a, int b){
        int mul = a*b;
        return mul;
    }
    public static void main(String[] args) {
        int product = product(4, 5); // call by value
        System.out.println(product);
        product = product(10, 5); 
        System.out.println(product);
    }
}
