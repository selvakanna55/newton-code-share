package stack;


import java.util.Stack;

class StackArray {
    int top = -1;
    int arr[];

    StackArray(int size) {
        this.arr = new int[size];
    }

    void push(int val) {
        if (top + 1 >= arr.length) {
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
            System.out.println("deleteing " + arr[top]);
            top--; //decrease the index for deletion
        }
    }

    int peek() { // without removal get a value
        if (top == -1) {
            return -1;
        } else {
            int val = arr[top];
            return val;
        }
    }
}

public class StackUsingArray {
    // Newton School Online Java compiler to run Java online.
    // Write Java code in this online editor and run it.
    public static void main(String[] args) {
        StackArray stack = new StackArray(3);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();


        // ArrayList<Integer> li = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st.pop());
        System.out.println(st.peek());
        System.out.println(st.size());
        System.out.println(st.isEmpty());
    }

}