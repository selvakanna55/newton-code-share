package stack;

import java.util.Stack;

public class ValidParanthesis {

    static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') st.push(ch);
            else {
                if (st.isEmpty()) return false;
                else st.pop();
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("(())"));
        System.out.println(isValid("))(("));
        System.out.println(isValid(")("));
        System.out.println(isValid("())"));
    }
}
