package stack;


// https://liveexample.pearsoncmg.com/dsanimation13ejava/StackeBook.html
class StackArray {
    int top = -1;
    int arr[];
    int size;

    StackArray(int size) {
        arr = new int[size];
        this.size = size;
    }

    void push(int num) { // insertion -> submit note book
        if (top + 1 < size) {
            top++;
            arr[top] = num;
        } else {
            System.out.println("Stack is full");
        }
    }


    void peek() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("peek " + arr[top]);
        }
    }

    void pop() { // removeal -> removing note book
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("removing " + arr[top]);
            top--;
        }
    }

}

public class StackArrayExample {
    public static void main(String args[]) {
        StackArray stack = new StackArray(2);
        stack.push(10);
        stack.push(20);
        stack.peek(); // 20
        stack.pop(); // remove 20
        stack.peek(); // 10
    }
}


//  stack.pop(); //remove 30
//         stack.pop(); //remove 20
//         stack.push(50);
//         stack.push(80);
//         stack.pop(); //remove 80