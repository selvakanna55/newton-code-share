package assignments;


public class InsertNodeAtTheHead {
    static class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
            next = null;
        }
    }

    public static Node addElement(Node head, int k) {
        Node newNode = new Node(k);
        newNode.next = head;
        return newNode;
    }
}
