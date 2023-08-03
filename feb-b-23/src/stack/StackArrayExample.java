class StackArray {
    int capacity;
    int top = -1; //i pointer
    int arr[];

    StackArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
    }

    void push(int num) {
        if (top + 1 == capacity) {
            System.out.println("Stack is full");
        } else {
            top++;
            arr[top] = num;
        }
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            int value = arr[top];
            top--;
            return value;
        }
    }

}

public class StackArrayExample {
    public static void main(String[] args) {
        StackArray st = new StackArray(3);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}