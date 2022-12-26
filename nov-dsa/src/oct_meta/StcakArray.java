package oct_meta;

import java.util.Stack;

class StackArrayImpl {
    int len;
    int arr[];
    int top = -1;

    StackArrayImpl(int size) {
        len = size;
        arr = new int[size];
    }

    void push(int val) {
        if (top + 1 == len) {
            System.out.println("Stack is full");
        } else {
            top++;
            arr[top] = val;
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("removing " + arr[top]);
            top--;
        }
    }
}

public class StcakArray {
    public static void main(String[] args) {
        StackArrayImpl st = new StackArrayImpl(3);
        st.pop();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.pop(); // 30
        Stack<Integer> st1 = new Stack<>();
        st1.push(10);
    }
}
