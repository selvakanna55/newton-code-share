package assignments;

public class DeleteTheMiddleOfTheLinkedList {
    static class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
            next = null;
        }
    }

    public static Node deleteMiddleElement(Node head) {
        if (head.next == null) {
            return new Node(-1);
        }
        Node slow = head;
        Node fast = head;
        Node prev = head;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = prev.next.next;
        return head;
    }
}
