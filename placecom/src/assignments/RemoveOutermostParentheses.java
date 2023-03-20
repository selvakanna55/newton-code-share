package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class RemoveOutermostParentheses {
    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String input = read.readLine();
        Stack<Character> st = new Stack<>();
        int start = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '(') st.push(ch);
            else st.pop();

            if (st.isEmpty()) {
                System.out.print(input.substring(start + 1, i));
                start = i + 1;
            }

        }
    }
}