package linkedlist;


class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }
}

public class LinkedListExample {
    static void print(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.println(curr.value);
            curr = curr.next;
        }
    }

    static void printNthElement(Node head, int idx) {
        // array -> arr[idx] -> O(1)
        // 0 based index
        Node curr = head; // O(n)
        for (int i = 1; i <= idx; i++) {
            curr = curr.next;
        }
        System.out.println(curr.value);
    }

    public static void main(String args[]) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
//        print(head);
        printNthElement(head, 0);
    }
}