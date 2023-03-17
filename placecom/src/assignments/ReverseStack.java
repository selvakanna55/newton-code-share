package assignments;

import java.util.Stack;

public class ReverseStack {
    static Stack<Integer> St = new Stack();

    static void Reverse_Stack() {
        if (St.size() == 1) {
            return;
        }
        int curr = St.pop();
        Reverse_Stack();
        insertAtBottom(curr);
    }

    static void insertAtBottom(int curr) {
        if (St.isEmpty()) {
            St.push(curr);
        } else {
            int val = St.pop();
            insertAtBottom(curr);
            St.push(val);
        }
    }
}
