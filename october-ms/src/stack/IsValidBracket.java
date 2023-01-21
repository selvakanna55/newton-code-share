package stack;

import java.util.Stack;

public class IsValidBracket {
    static boolean isValid(String s) {
        boolean ans = true;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else {
                if (st.isEmpty()) { // but i cannot remove
                    ans = false;
                    break;
                } else {
                    st.pop();
                }
            }
        }
        if (!st.isEmpty()) {
            ans = false;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(isValid("(())"));
        System.out.println(isValid("(())()"));
        System.out.println(isValid("(()"));
    }
}
