package assignments;

public class DeleteEvenNodesFromTheList {

    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }


    static Node deleteEven(Node head) {
        Node curr = head;
        Node dummy = new Node(-1);
        Node run = dummy;
        while (curr != null) {
            if (curr.data % 2 == 1) {
                run.next = curr;
                run = run.next;
            }
            curr = curr.next;
            if (curr == head) { // circlular linked list
                break;
            }
        }
        run.next = dummy.next;
        return dummy.next;
    }
}
