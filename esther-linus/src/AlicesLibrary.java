

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class AlicesLibrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '\\') {
                String word = "";
                while (st.peek() != '/') {
                    word = word + st.pop();
                }
                st.pop();
                for (int j = 0; j < word.length(); j++) {
                    st.push(word.charAt(j));
                }
            } else {
                st.push(ch);
            }
        }
        String word = "";
        while (!st.isEmpty()) {
            word = word + st.pop();
        }
        for (int j = word.length() - 1; j >= 0; j--) {
            System.out.print(word.charAt(j));
        }
    }
}