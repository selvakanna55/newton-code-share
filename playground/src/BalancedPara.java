import java.util.Stack;

public class BalancedPara {
    static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == '(') {
                st.push(ch);
            } else {
                if (st.empty()) return false;
                st.pop();
            }
        }
        if (st.empty()) return true;
        else return false;
    }

    public static void main(String[] args) {
        String s = "(()";
        System.out.println(isValid(s));
    }
}

