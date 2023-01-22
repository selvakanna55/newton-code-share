package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class EvaluateExpressionUsingStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = arr[i].charAt(0);
            if (Character.isDigit(ch)) { // numbers push
                int num = Integer.parseInt(arr[i]);
                st.push(num);
            } else {
                int num1 = st.pop();
                int num2 = st.pop();
                switch (ch) {
                    case '+':
                        st.push(num2 + num1);
                        break;
                    case '-':
                        st.push(num2 - num1);
                        break;
                    case '/':
                        st.push(num2 / num1);
                        break;
                    case '*':
                        st.push(num2 * num1);
                        break;
                }
            }
        }
        System.out.println(st.pop());
    }
}