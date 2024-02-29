public class pr2 {
    public static boolean isPalindrome(String str){ 
        int start =0;
        int end = str.length()-1;
        while(start<end){ //O(n)
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "noon";
        System.out.println(isPalindrome(str));
    }
}
