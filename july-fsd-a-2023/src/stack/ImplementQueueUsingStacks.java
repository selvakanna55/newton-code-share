package stack;

import java.util.Stack;
// https://leetcode.com/problems/implement-queue-using-stacks/description/

// replace ImplementQueueUsingStacks with MyQueue before submitting in leetcode
class ImplementQueueUsingStacks {
    Stack<Integer> input;
    Stack<Integer> reversed;

    public ImplementQueueUsingStacks() {
        input = new Stack<>();
        reversed = new Stack<>();
    }

    public void push(int x) {
        input.add(x);
    }

    public int pop() {
        checkAndReverse();
        return reversed.pop();
    }

    public int peek() {
        checkAndReverse();
        return reversed.peek();
    }

    private void checkAndReverse() {
        if (reversed.isEmpty()) {
            int n = input.size();
            for (int i = 0; i < n; i++) {
                int val = input.pop();
                reversed.push(val);
            }
        }
    }

    public boolean empty() {
        return reversed.isEmpty() && input.isEmpty();
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