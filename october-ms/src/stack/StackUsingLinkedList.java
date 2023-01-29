package stack;

import linkedlist.Node;

class StackUsingLL {
    Node head = null;

    void push(int val) { // insert at pos1
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    void pop() { // delete at pos1
        System.out.println(head.val);
        head = head.next;
    }
}

public class StackUsingLinkedList {
    public static void main(String[] args) {
        StackUsingLL sll = new StackUsingLL();
        sll.push(10);
        sll.push(20);
        sll.push(30);
        sll.pop();
        sll.pop();
        sll.push(101);
        sll.pop();
    }
}
