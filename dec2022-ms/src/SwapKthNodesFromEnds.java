public class SwapKthNodesFromEnds {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }


    static Node swapkthnode(Node head, int num, int k) {

        if (k > num || (2 * k - 1) == num) return head;

        Node p1Prev = null;
        Node p2Prev = null;
        Node p1 = head, p2 = head;

        // k from beginning
        for (int i = 1; i < k; i++) {
            p1Prev = p1;
            p1 = p1.next;
        }

        for (int i = 0; i < num - k; i++) {
            p2Prev = p2;
            p2 = p2.next;
        }

        if (p1Prev != null) {
            p1Prev.next = p2;
        }

        if (p2Prev != null) {
            p2Prev.next = p1;
        }

        Node temp = p1.next;
        p1.next = p2.next;
        p2.next = temp;


        if (k == 1) {
            head = p2;
        }
        if (k == num) {
            head = p1;
        }

        return head;
    }
}