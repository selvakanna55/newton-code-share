package queue;


import java.util.*;

class ImplementStackUsingQueues {
    Queue<Integer> q;

    public ImplementStackUsingQueues() {
        q = new LinkedList<>();
    }

    public void push(int x) {
        int size = q.size();
        q.add(x);
        for (int i = 0; i < size; i++) {
            int curr = q.remove();
            q.add(curr);
        }
    }

    public int pop() {
        return q.remove();
    }

    public int top() {
        return q.peek();
    }

    public boolean empty() {
        return q.isEmpty();
    }
}
