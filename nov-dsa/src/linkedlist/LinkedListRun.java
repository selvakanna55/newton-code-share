package linkedlist;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class SinglyLinkedList {
    Node head = null;

    void insertAtEnd(int val) {
        Node newNode = new Node(val);
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

    void printLL() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}





public class LinkedListRun {
    public static void main(String[] args) {
        SinglyLinkedList ll = new SinglyLinkedList();
        ll.insertAtEnd(10);
        ll.insertAtEnd(11);
        ll.insertAtEnd(12);
        ll.printLL();

    }
}
