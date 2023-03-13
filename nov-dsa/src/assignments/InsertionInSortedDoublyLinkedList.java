package assignments;

public class InsertionInSortedDoublyLinkedList {

    class Node {
        int data;
        Node next, prev;
    }

    static Node sortedInsertion(Node head, Node newNode) {
        if (newNode.data <= head.data) {
            newNode.next = head;
            head.prev = newNode;
            return newNode;
        }

        Node curr = head;
        Node prev = curr;
        while (curr != null) {
            if (newNode.data <= curr.data) {
                break;
            }
            prev = curr;
            curr = curr.next;
        }
        prev.next = newNode;
        newNode.next = curr;

        curr.prev = newNode;
        newNode.prev = prev;

        return head;
    }
}