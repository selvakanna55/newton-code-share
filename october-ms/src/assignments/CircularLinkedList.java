package assignments;

public class CircularLinkedList {


    static class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
            next = null;
        }
    }


    public static int check(Node head) {
        Node curr = head;
        int ans = 0;
        while (curr != null) {
            curr = curr.next;
            if (curr == head) { //circle
                ans = 1;
                break;
            }
        }
        return ans;
    }
}