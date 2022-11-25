package batch_assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Aliceslibrary {
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '\\') {
                stack.push(str.charAt(i));
            } else {
                String sb = "";
                while (stack.peek() != '/') {
                    sb = sb + stack.pop();
                }
                stack.pop();
                int j = 0;
                while (sb.length() > j) {
                    stack.push(sb.charAt(j));
                    j++;
                }
            }
        }

        for (Character ch : stack) {
            System.out.print(ch);
        }
    }
}