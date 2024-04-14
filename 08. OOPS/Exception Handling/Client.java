import java.util.*;
public class Client {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		try {
			String str = "pvpit";
			System.out.println(str.charAt(0));
			
			System.out.println("Enter 1st number: ");
			int a = sc.nextInt();		
			System.out.println("Enter 2nd number: ");
			int b = sc.nextInt();
			int res = a/b;
			System.out.println("res: "+res);
		}
		catch(NullPointerException e) {
			System.out.println("String should not null");
		}
		catch(InputMismatchException e) {
			System.out.println("Please enter numeric data");
		}
		catch(ArithmeticException e) {
			System.out.println("Please enter dr value greater than zero");
		}
		catch(Exception e) {
			System.out.println("Please Enter Int type data");
		}

	}
}
