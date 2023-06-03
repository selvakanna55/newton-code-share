package queue;


class Node {
    int value;
    Node next;

    Node(int number) {
        value = number;
    }
}

class LinkedList<I extends Number> {
    Node head;
    Node tail;

    void enque(int num) { //insert at end
        Node newNode = new Node(num);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    void deque() {
        if (head == null) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("removing " + head.value);
            head = head.next;
        }
    }

    void peek() { //print the next element to be deleted
        if (head == null) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(head.value);
        }
    }
}

public class QueueLinkedList {
    public static void main(String args[]) {
        LinkedList<Number> list = new LinkedList<Number>();
        list.enque(10);
        list.enque(20);
        list.enque(30);
        list.peek();
        list.deque();
        list.peek();
        list.deque();
    }
}