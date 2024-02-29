import java.util.Scanner;

public class linearSearch {
    public static int linearSearch(int arr[], int key){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==key)
            return i;
        }
        return -1;
    }
    public static int linearSearch(String menu[], String item){
        for(int i=0; i<menu.length; i++){
            if(menu[i]==item)
                return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[]= {2, 4, 6, 8, 10, 12, 14, 18, 20};
        String menu[]= {"dosa", "chole bhature", "samosa"};
        String itemString = "samosa";
        System.out.println("Enter the key: ");
    int key =sc.nextInt();
    int index = linearSearch(arr, key);
    if(index == -1)
        System.out.println("key is not found");
    else
        System.out.println("key is found at index: "+index);

    index=linearSearch(menu, itemString);
    System.out.println("The menu is found at index: "+index);
    }
}
