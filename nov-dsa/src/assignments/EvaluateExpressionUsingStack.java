package assignments;


import java.util.Scanner;
import java.util.Stack;

// don't change the name of this class
// you can add inner classes if needed
class EvaluateExpressionUsingStack {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int n = Integer.parseInt(S.nextLine());
        String In[] = S.nextLine().split(" ");
        Stack<Integer> St = new Stack<>();
        for (int i = 0; i < n; i++) {
            String temp = In[i];
            if (temp.equals("+") || temp.equals("-") || temp.equals("*") || temp.equals("/")) {
                int v1 = St.pop();
                int v2 = St.pop();
                switch (temp) {
                    case "+":
                        St.push(v1 + v2);
                        break;
                    case "-":
                        St.push(v2 - v1);
                        break;
                    case "*":
                        St.push(v1 * v2);
                        break;
                    case "/":
                        St.push(v2 / v1);
                        break;
                }
            } else {
                St.push(Integer.parseInt(temp));
            }
        }
        System.out.print(St.peek());
    }
}