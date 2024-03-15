package stack;


// https://my.newtonschool.co/playground/code/tf2f0rf0vcde

import java.util.Scanner;
import java.util.Stack;

// don't change the name of this class
// you can add inner classes if needed
class ValidParenthesis {
    private static boolean isValid(String input) {
        Stack<Character> st = new Stack<>();
        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (st.isEmpty()) return false;
                char pop = st.pop(); //removed last char from  stack
                if ((pop == '{' && ch != '}') || (pop == '(' && ch != ')') || (pop == '[' && ch != ']')) {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(isValid(input));
    }
}
