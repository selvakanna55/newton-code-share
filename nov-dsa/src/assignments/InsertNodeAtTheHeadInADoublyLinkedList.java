package assignments;

public class InsertNodeAtTheHeadInADoublyLinkedList {
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

    public static Node insertnew(Node head, int k) {
        Node curr = new Node(k);
        head.prev = curr;
        curr.next = head;
        head = curr;
        return head;
    }
}
