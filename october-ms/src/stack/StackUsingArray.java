package stack;

class StackArray {
    int size;
    int arr[];
    int top = -1;

    StackArray(int n) {
        this.size = n;
        arr = new int[n];
    }

    void push(int val) { //insertion
        if (top + 1 >= size) {
            System.out.println("stack is full");
        } else {
            top++;
            arr[top] = val;
        }
    }

    void pop() { //delete
        if (top == -1) {
            System.out.println("stack is empty");
        } else {
            System.out.println(arr[top]);
            top--;
        }
    }

    void peek() {
        if (top == -1) {
            System.out.println("stack is empty");
        } else {
            System.out.println(arr[top]);
        }
    }
}

public class StackUsingArray {
    public static void main(String[] args) {
        StackArray st = new StackArray(3);
        st.push(10);
        st.push(20);
        st.pop();
        st.push(99);
        st.pop();
        st.pop();
        st.push(108);
        st.peek();
    }
}
