package assignments;


import java.util.Scanner;
import java.util.Stack;

// don't change the name of this class
// you can add inner classes if needed
class MakeTheStringGreat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!st.isEmpty() && Math.abs(ch - st.peek()) == 32) {
                st.pop();
            } else {
                st.push(ch);
            }
        }
        int n = st.size();
        char arr[] = new char[n];
        for (int i = n - 1; i >= 0; i--) {
            arr[i] = st.pop();
        }
        System.out.println(new String(arr));
    }
}