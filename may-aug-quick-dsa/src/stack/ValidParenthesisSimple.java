package stack;


import java.util.Stack;

// ArrayList -> 50%
// Vector -> 100%

public class ValidParenthesisSimple {
    static boolean isValid(String input) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else {
                if (st.isEmpty()) return false;
                st.pop();
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("(())"));
        System.out.println(isValid("()()()"));
        System.out.println(isValid("(()())"));
        System.out.println(isValid("())")); //extra close
        System.out.println(isValid("(()")); //extra open
        System.out.println(isValid("())(")); //invalid arrangement
    }
}