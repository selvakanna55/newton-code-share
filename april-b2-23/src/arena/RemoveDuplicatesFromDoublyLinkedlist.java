package arena;

class Node {
    Node next;
    Node prev;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
        prev = null;
    }
}

public class RemoveDuplicatesFromDoublyLinkedlist {
    public static Node deleteDuplicates(Node head) {
        Node ansHead = head;
        Node run = head;
        Node curr = head.next;
        while (curr != null) {
            if (curr.val != run.val) {
                run.next = curr;
                curr.prev = run;
                run = run.next;
            }
            curr = curr.next;
        }
        run.next = null;
        return ansHead;
    }
}
