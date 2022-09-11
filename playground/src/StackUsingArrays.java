import java.util.Stack;

class StackArray {
    int top = -1;
    int arr[];
    int capacity;

    StackArray(int size) {
        arr = new int[size];
        capacity = size;
    }

    void push(int num) {
        if (top + 1 == capacity) {
            System.out.println("Stack is full");
        } else {
            top++;
            arr[top] = num;
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("deleting " + arr[top]);
            top--;
        }
    }

}

public class StackUsingArrays {
    public static void main(String[] args) {
        StackArray st = new StackArray(3);
        st.pop(); // empty not allowed
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40); // stack is full
        st.pop(); // 30
        st.pop(); // 20
        st.pop(); // 10
        st.pop(); // empty
    }
}
