package linkedlist;


public class BasicsLL {
    static class Node {
        int val;

        Node(int val) {
            this.val = val;
        }

        Node next;
    }

    public static void main(String[] args) {
        Node head = new Node(11);
        Node node1 = new Node(21);
        Node node2 = new Node(31);
        head.next = node1;
        node1.next = node2;

        Node run = head;
        while (run != null) {
            System.out.println(run.val);
            run = run.next;
        }
        for (Node curr = head; curr != null; curr = curr.next) {
            System.out.println(curr.val);
        }
    }
}
