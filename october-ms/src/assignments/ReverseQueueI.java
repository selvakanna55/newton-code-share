package assignments;

import java.util.Queue;
import java.util.Stack;

class ReverseQueueI {
    public void reverseQueue(Queue<Integer> Q) {
        Stack<Integer> st = new Stack<>();
        while (!Q.isEmpty()) {
            st.push(Q.poll());
        }
        while (!st.isEmpty()) {
            Q.offer(st.pop());
        }
    }
}