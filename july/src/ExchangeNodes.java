class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
    }
}

public class ExchangeNodes {

    public static Node exchangeNodes(Node head) {

        if (head == null || head.next == null) return head;
        Node temp = head;
        Node prev = null, last = null;
        while (temp != null) {
            if (temp.next == head) {
                last = temp;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        last.next = head.next;
        prev.next = head;
        return last;
    }
}
