package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class PrefixToInfix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        Stack<String> s = new Stack<>();
        for (int i = str.length() - 1; i >= 0; i--) {
            char temp = str.charAt(i);
            if ((temp == '+') || (temp == '-') || (temp == '*') || (temp == '/')) {
                String t1 = s.pop();
                String t2 = s.pop();
                String infixTemp = "(" + t1 + temp + t2 + ")";
                s.push(infixTemp);
            } else {
                s.push(Character.toString(temp));
            }
        }
        System.out.println(s.peek());
    }
}