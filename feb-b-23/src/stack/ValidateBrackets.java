package stack;

import java.util.Stack;

// ( { [
public class ValidateBrackets {
    public static boolean isValidBracket(String input) {
        Stack<Character> st = new Stack<>();
        boolean isValid = true;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else if (ch == ')') {
                if (st.size() == 0) { // ()) -> extra close
                    isValid = false;
                    break;
                }
                st.pop();
            }
        }
        if (st.size() > 0) { //  (() -> extra open
            isValid = false;
        }
        return isValid;
    }

    public static void main(String args[]) {
        System.out.println("(()) " + isValidBracket("(())"));
        System.out.println("()() " + isValidBracket("()()"));
        System.out.println("(() " + isValidBracket("(()"));
        System.out.println("()) " + isValidBracket("())"));
        System.out.println("( " + isValidBracket("("));
        System.out.println("))(( " + isValidBracket("))(("));
        // (10+20+(3*4))
    }
}
