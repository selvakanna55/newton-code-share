package linkedlist;


class CircularLinkedList {
    Node head;

    void insertAtEnd(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != head) { // curr.next!=null
                curr = curr.next;
            }
            curr.next = newNode;
        }
        newNode.next = head; // make circle
    }

    void print() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
            if (curr == head) { // 1 round is completed
                break;
            }
        }
        System.out.println();
    }
}


public class CircularLinkedListRun {
    // Newton School Online Java compiler to run Java online.
    // Write Java code in this online editor and run it.
    public static void main(String[] args) {
        CircularLinkedList cl = new CircularLinkedList();
        cl.insertAtEnd(10);
        cl.insertAtEnd(20);
        cl.insertAtEnd(30);
        cl.insertAtEnd(40);
        cl.insertAtEnd(50);
        cl.print();
    }
}