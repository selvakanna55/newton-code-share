package stack;

class StackArray {
    int arr[];
    int size;
    int top = -1;

    StackArray(int length) {
        arr = new int[length];
        size = length;
    }

    void push(int num) { //insert
        if (top + 1 < size) {
            top++;
            arr[top] = num;
        } else {
            System.out.println("stack is full");
        }
    }

    void pop() { //delete
        if (top >= 0) {
            System.out.println("removing -" + arr[top]);
            top--;
        } else {
            System.out.println("stack is empty");
        }
    }
}

public class StackUsingArray {
    public static void main(String[] args) {
        StackArray stack = new StackArray(3);
        stack.pop(); // stack is empty
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40); // stack is full
        stack.pop(); //30
        stack.pop(); //30
    }
}
