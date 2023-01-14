package assignments;

public class InsertionInCircularLinkedList {
    static class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
            next = null;
        }
    }


    public static Node Insertion(Node head, int K) {
        Node newNode = new Node(K);
        Node curr = head;
        while (curr.next != head) { // last node -> whose next is head?
            curr = curr.next;
        }
        curr.next = newNode;
        newNode.next = head; // make circle
        return head;
    }
}