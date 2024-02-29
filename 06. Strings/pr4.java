public class pr4 {
    public static void main(String[] args) {
        String str1="Sachin";
        String str2= "HelloWorld";
        String str3= new String("Sachin");

        if(str1==str2)
            System.out.println("Equal");
        else
            System.out.println("not equal");

            if(str1==str3)
            System.out.println("Equal");
        else
            System.out.println("not equal");

            if(str1.equals(str3))
            System.out.println("Equal");
        else
            System.out.println("not equal");

        System.out.println(str2.substring(0,5));
    }   
    
}
