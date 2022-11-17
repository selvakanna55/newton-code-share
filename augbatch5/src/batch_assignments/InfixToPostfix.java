package batch_assignments;


import java.util.Scanner;
import java.util.Stack;

// don't change the name of this class
// you can add inner classes if needed
class InfixToPostfix {
    static int getPre(char ch) {
        if (ch == '+' || ch == '-') return 1;
        else if (ch == '*' || ch == '/') return 2;
        else if (ch == '^') return 3;
        return -1;
    }

    static boolean checkPrecedence(char a, char b) {
        int p1 = getPre(a);
        int p2 = getPre(b);
        if (p1 == p2) {
            // if(a=='^') return false;
            return true;
        }
        return p1 > p2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Stack<Character> st = new Stack<>();
        int n = s.length();

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                sb.append(ch);
            } else {
                if (ch == '(') st.push(ch);
                else if (ch == ')') {
                    while (st.peek() != '(') {
                        sb.append(st.peek());
                        st.pop();
                    }
                    st.pop();
                } else {
                    while (!st.isEmpty() && checkPrecedence(st.peek(), ch)) {
                        sb.append(st.peek());
                        st.pop();
                    }
                    st.push(ch);
                }

            }
        }
        while (!st.isEmpty()) {
            sb.append(st.peek());
            st.pop();
        }
        System.out.println(sb);
    }
}
