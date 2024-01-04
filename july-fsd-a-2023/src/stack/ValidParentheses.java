package stack;


import java.util.Stack;

// https://leetcode.com/problems/valid-parentheses/description/
class ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        boolean ans = true;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty()) { //extra close
                    ans = false;
                    break;
                } else if (st.peek() == '(' && ch == ')') {
                    st.pop();
                } else if (st.peek() == '[' && ch == ']') {
                    st.pop();
                } else if (st.peek() == '{' && ch == '}') {
                    st.pop();
                } else { //bracket type mismatch
                    ans = false;
                    break;
                }
            }
        }
        if (!st.isEmpty()) { // extra open
            ans = false;
        }
        return ans;
    }
}