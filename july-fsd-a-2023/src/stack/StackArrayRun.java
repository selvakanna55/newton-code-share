package stack;


class StackArray {
    int arr[];
    int size;
    int top = -1; // points to the last element in the stack

    StackArray(int size) {
        this.size = size;
        arr = new int[size];
    }

    void push(int num) {
        if (top + 1 < size) {
            top++;
            arr[top] = num;
        } else {
            System.out.println("stack is full");
        }
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("removing value " + arr[top]);
            top--;
        }
    }

    void peek() { // without deleting print the top of the stack
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println(arr[top]);
        }
    }
}

public class StackArrayRun {
    public static void main(String[] args) {
        StackArray st = new StackArray(4);
        st.pop(); //stack is empty
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50); // stack is full
        st.pop();
        st.pop();
        st.peek();
    }

}

