package assignments;

public class ReversingADoubleLinkedList {
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

    public static Node Reverse(Node head) {
        Node curr = head;
        Node temp = null;
        while (curr != null) {
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;
            curr = curr.prev;
        }
        if (temp == null) return head;
        else return temp.prev;
//complete this function
    }
}
