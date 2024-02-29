import java.util.Scanner;

public class AreaofCircle {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter radius of circle: ");
    float radius = sc.nextFloat();
    float area = 3.14f*radius*radius;
    System.out.println(area);
    System.out.println((int)(3.14));
    }
}
