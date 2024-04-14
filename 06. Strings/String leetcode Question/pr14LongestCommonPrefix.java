import java.util.Arrays;

public class pr14LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        StringBuilder str = new StringBuilder();
        //sort the array
        Arrays.sort(strs);

        //get first and last element
        char first[]=strs[0].toCharArray(); 
        char last[]=strs[strs.length-1].toCharArray();    

        //compare them by char by char
        for(int i=0; i<first.length; i++){
            if(first[i]!=last[i])
                break;
            str.append(first[i]);
        }

    return str.toString();
    }

    public static void main(String[] args) {
        String strs[] = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
