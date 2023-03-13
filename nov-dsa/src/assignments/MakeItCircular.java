package assignments;

public class MakeItCircular {
    static class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
            next = null;
        }
    }


    public static Node MakeCircular(Node head) {
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = head;
        return head;
    }
}
