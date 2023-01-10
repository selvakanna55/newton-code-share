package assignments;

public class ZerosAtFrontOfLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static public Node moveZeroes(Node head) {
        Node zeroHead = new Node(-1);
        Node zeroP = zeroHead;

        Node valHead = new Node(-1);
        Node valP = valHead;

        Node curr = head;
        while (curr != null) {
            if (curr.data == 0) {
                zeroP.next = curr;
                zeroP = zeroP.next;
            } else {
                valP.next = curr;
                valP = valP.next;
            }
            curr = curr.next;
        }
        //TODO: why?
        valP.next = null;

        zeroP.next = valHead.next;

        return zeroHead.next;
    }
}
