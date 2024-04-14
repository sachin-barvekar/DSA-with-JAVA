import java.util.Arrays;

public class pr242validAnagram {
    public static boolean isAnagram(String s, String t) {
        char temp1[] = s.toCharArray();
        char temp2[]=t.toCharArray();
        Arrays.sort(temp1);
        Arrays.sort(temp2);
        if(Arrays.equals(temp1, temp2)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }
}
