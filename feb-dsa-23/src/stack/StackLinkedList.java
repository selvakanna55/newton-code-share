package stack;


class Node {
    int value;
    Node next;

    Node(int number) {
        value = number;
    }
}


class Stack {
    Node head;

    void push(int num) { // insert at head
        Node newNode = new Node(num);
        newNode.next = head;
        head = newNode;
    }

    void pop() { // deleting head
        if (head == null) {
            System.out.println("stack is empty");
        } else {
            System.out.println("removing " + head.value);
            head = head.next;
        }
    }
}

public class StackLinkedList {
    public static void main(String args[]) {
        Stack stack = new Stack();
        stack.pop();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.pop();
        stack.pop();
        stack.push(99);
        stack.pop();
    }
}