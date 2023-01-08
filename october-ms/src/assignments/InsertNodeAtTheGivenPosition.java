package assignments;

public class InsertNodeAtTheGivenPosition {
    static class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
            next = null;
        }
    }

    public static Node addElement(Node head, int k, int pos) {

        Node newNode = new Node(k);

        if (pos == 1) {

            newNode.next = head;

            head = newNode;

        } else {

            Node prev = head;

            for (int i = 2; i < pos; i++) {

                prev = prev.next;

            }

            newNode.next = prev.next;

            prev.next = newNode;

        }

        return head;

    }
}
