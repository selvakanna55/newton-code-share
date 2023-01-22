package assignments;


import java.util.*;

// if \ -> remove until /,  remove / and insert back
// else push

// / -> forward slash
// \ -> back slash -> some special

// don't change the name of this class
// you can add inner classes if needed
class AlicesLibrary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        Stack<Character> st = new Stack<>();
        int n = word.length();
        String ans = "";
        for (int i = 0; i < n; i++) {
            char ch = word.charAt(i);
            if (ch == '\\') {
                String revrsed = "";
                while (st.peek() != '/') {
                    ch = st.pop();
                    revrsed = revrsed + ch;
                }
                st.pop(); //removing /
                // push back
                if (st.isEmpty()) {
                    ans = revrsed;
                } else {
                    for (int j = 0; j < revrsed.length(); j++) {
                        st.push(revrsed.charAt(j));
                    }
                }
            } else {
                st.push(ch);
            }
        }
        System.out.println(ans);
    }
}