package stack;

class StackArray {
    int arr[];
    int size;
    int top = -1;

    StackArray(int capacity) {
        size = capacity;
        arr = new int[size];
    }

    void push(int num) {
        if (top + 1 == size) {
            System.out.println("Stack full");
        } else {
            top++;
            arr[top] = num;
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack empty");
        } else {
            System.out.println("removing " + arr[top]);
            top--;
        }
    }

    void peek() {
        if (top == -1) {
            System.out.println("Stack empty");
        } else {
            System.out.println(arr[top]);
        }
    }

    boolean isEmpty() {
        return top == -1;
    }

    boolean isFull() {
        return top + 1 == size;
    }
}

public class StackUsingArray {
    public static void main(String[] args) {
        StackArray st = new StackArray(4);
        st.pop(); // stack empty
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50); //  stack full
        st.peek();
    }
}
