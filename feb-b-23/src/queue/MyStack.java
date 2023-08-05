package queue;


import java.util.LinkedList;
import java.util.Queue;

// https://leetcode.com/problems/implement-stack-using-queues/description/
class MyStack {
    Queue<Integer> qq;

    public MyStack() {
        this.qq = new LinkedList<>();
    }

    public void push(int x) {
        int size = qq.size();
        qq.add(x);
        for (int i = 0; i < size; i++) { //remove from front and add it back
            int curr = qq.remove();
            qq.add(curr);
        }
    }

    public int pop() {
        return qq.remove();
    }

    public int top() {
        return qq.peek();
    }

    public boolean empty() {
        return qq.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */