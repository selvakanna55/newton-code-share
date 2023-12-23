package linkedlist;


class LinkedListTail {
    Node head;
    Node tail;

    void print() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    void insertAtEnd(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            // curr.next = newNode;
            tail.next = newNode;
        }
        tail = newNode;
    }

}

public class LinkedListWithTail {

    public static void main(String[] args) {
        LinkedListTail l = new LinkedListTail();
        l.insertAtEnd(10);
        l.insertAtEnd(20);
        l.insertAtEnd(30);
        l.insertAtEnd(40);
        l.insertAtEnd(50);
        l.print();
    }
}