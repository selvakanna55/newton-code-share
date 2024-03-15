package linkedlist;


class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}


class LinkedList {
    Node head;

    void insertAtEnd(int num) {
        Node newNode = new Node(num);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    void print() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}

public class BasicLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        list.print();
    }
}