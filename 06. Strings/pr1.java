import java.util.Scanner;

public class pr1 {

    public static void printStr(String str){
        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String str="Hello";
        String str2 = new String("Hey");
        
        //Strings are immutable

        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String name = sc.next();
        System.out.println(name);
        System.out.println(st);
        System.out.println(st.length());
        String firstName ="Sachin";
        String lastName = "Barvekar";
        String fullName= firstName.concat(lastName);
        System.out.println(fullName);
        System.out.println(firstName + " "+lastName);
        printStr(fullName);
}
}
