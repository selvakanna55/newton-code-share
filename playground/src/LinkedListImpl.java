class Node {
    int val;
    Node next;

    Node(int value) {
        val = value;
    }
}

public class LinkedListImpl {
    static Node head = null;

    static void insertAtEnd(int num) {
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

    static void printLL() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val+" ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        insertAtEnd(10);
        insertAtEnd(20);
        insertAtEnd(30);
        printLL();
        insertAtEnd(40);
        printLL();
    }
}
