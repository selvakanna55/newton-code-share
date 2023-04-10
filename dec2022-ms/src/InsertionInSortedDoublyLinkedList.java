public class InsertionInSortedDoublyLinkedList {

    static class Node {
        int data;
        Node next, prev;
    }


    static Node sortedInsertion(Node head, Node newNode) {
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            if (curr.data >= newNode.data) {
                break;
            }
            prev = curr;
            curr = curr.next;
        }
        if (prev == null) { //insert at head
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        } else { // other places
            prev.next = newNode;
            newNode.prev = prev;
            newNode.next = curr;
            if (curr != null)
                curr.prev = newNode;
        }
        return head;
    }
}
