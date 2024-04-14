public class MethodOverloading {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println(c1.sum(3, 2));
        System.out.println(c1.sum((float)12.5, (float)8.5));
        System.out.println(c1.sum(3, 2, 5));
    }
}

class Calculator{
    int sum(int a, int b){
        return a +b;
    }
    float sum(float a, float b){
        return  a+ b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}