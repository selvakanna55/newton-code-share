package stack;

import java.util.Stack;

// https://leetcode.com/problems/valid-parentheses/description/
public class ValidParentheses20 {
    public boolean isValid(String s) {
        int n = s.length();
        boolean ans = true;
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    ans = false;
                    break;
                }
                if (ch == ']' && st.peek() == '[') {
                    st.pop();
                } else if (ch == ')' && st.peek() == '(') {
                    st.pop();
                } else if (ch == '}' && st.peek() == '{') {
                    st.pop();
                } else {
                    ans = false;
                    break;
                }
            }
        }
        if (!st.isEmpty()) {
            ans = false;
        }
        return ans;
    }
}