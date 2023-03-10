package assignments;

public class DeletionInDoublyLinkedList {
    static class Node {
        Node next;
        Node prev;
        int val;

        Node(int val) {
            this.val = val;
            next = null;
            prev = null;
        }
    }

    public static Node deleteElement(Node head, int k) {
        // attach dummy head
        Node dummy = new Node(-1);
        dummy.next = head;
        head = dummy;

        Node p1 = head;

        for (int i = 0; i < k; i++) {
            p1 = p1.next;
        }

        Node p2 = head;
        Node prevP2 = head;
        while (p1 != null) {
            p1 = p1.next;
            prevP2 = p2;
            p2 = p2.next;
        }
        p2.next.prev = prevP2;
        prevP2.next = p2.next;
        return head.next;
    }
}
