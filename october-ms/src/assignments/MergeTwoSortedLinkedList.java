package assignments;

public class MergeTwoSortedLinkedList {
    static class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
            next = null;
        }
    }

    public static Node Merge(Node head1, Node head2) {
        Node result = new Node(-1);
        Node curr = result;

        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                curr.next = head1;
                head1 = head1.next;
            } else {
                curr.next = head2;
                head2 = head2.next;
            }
            curr = curr.next;
        }
        if (head1 != null) {
            curr.next = head1;
        }

        if (head2 != null) {
            curr.next = head2;
        }
        return result.next;
    }
}