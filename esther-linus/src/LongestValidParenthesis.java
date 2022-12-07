

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class LongestValidParenthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        String s = sc.next();
        int ans = 0;
        int n = s.length();
        st.push(-1);
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                st.push(i);
            } else {
                st.pop();
                if (st.isEmpty()) {
                    st.push(i);
                } else if (ans < i - st.peek()) {
                    ans = i - st.peek();
                }
            }
        }
        System.out.println(ans);
    }
}