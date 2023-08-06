package stack;

// https://leetcode.com/problems/valid-parentheses/description/

import java.util.Stack;

class ValidateParenthesisLeetcode {

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        boolean ans = true;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else {
                if (st.size() == 0) {
                    ans = false;
                    break;
                }
                if (st.peek() == '(' && ch == ')') {
                    st.pop();
                } else if (st.peek() == '[' && ch == ']') {
                    st.pop();
                } else if (st.peek() == '{' && ch == '}') {
                    st.pop();
                } else { // mismatch type
                    ans = false;
                    break;
                }
            }
        }
        if (st.size() > 0) {
            ans = false;
        }
        return ans;
    }
}