package queue;

import java.util.*;

class ImplementQueueUsingStacks {

    Stack<Integer> input;
    Stack<Integer> output;

    public ImplementQueueUsingStacks() {
        input = new Stack<>();
        output = new Stack<>();
    }

    public void push(int x) {
        input.push(x);
    }

    public int pop() {
        update();
        return output.pop();
    }

    public int peek() {
        update();
        return output.peek();
    }

    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }

    void update() {
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                int curr = input.pop();
                output.push(curr);
            }
        }
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */