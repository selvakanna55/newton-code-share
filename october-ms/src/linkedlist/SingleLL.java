package linkedlist;

class Node {
    int val;

    Node(int val) {
        this.val = val;
    }

    Node next;

}

public class SingleLL {
    public static void main(String[] args) {
        Node head = new Node(11);
        Node node1 = new Node(21);
        Node node2 = new Node(31);
        head.next = node1;
        node1.next = node2;

        for (Node curr = head; curr != null; curr = curr.next) {
            System.out.print(curr.val + " ");
        }

    }
}
