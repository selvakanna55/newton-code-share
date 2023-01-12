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
        Node newNode = new Node(k);
        newNode.next = head;
        if (head != null) //new for DLL
            head.prev = newNode;
        head = newNode;
        return head;
    }
}
