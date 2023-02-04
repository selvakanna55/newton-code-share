package assignments;


import java.util.Scanner;
import java.util.Stack;

// don't change the name of this class
// you can add inner classes if needed
class LongestValidParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pattern = sc.next();
        int length = pattern.length();

        Stack<Integer> st = new Stack<>();
        st.push(-1);

        int ans = 0;

        for (int idx = 0; idx < length; idx++) {
            char ch = pattern.charAt(idx);
            if (ch == '(') {
                st.push(idx);
            } else if (ch == ')') {
                st.pop();
                if (st.isEmpty()) {
                    st.push(idx);
                }
                ans = Math.max(ans, idx - st.peek());
            }
        }
        System.out.println(ans);
    }
}