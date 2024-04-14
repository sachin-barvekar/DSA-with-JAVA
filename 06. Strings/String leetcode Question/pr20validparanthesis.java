import java.util.Stack;

public class pr20validparanthesis {
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }else{
                if(!stack.isEmpty()){
                    char top=stack.pop();
                    if((ch == ')' && top != '(') || (ch == ']' && top != '[') || (ch == '}' && top != '{'))
                        return false;
                }else
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s="()[]{}";
        String s1="(}";
        System.out.println(isValid(s));
        System.out.println(isValid(s1));
    }
}
