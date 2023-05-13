package arena;

// https://my.newtonschool.co/playground/code/14g5sh4btq4v
public class ListPairSumLinkedList {


    class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
            next = null;
        }
    }


    public static int solve(Node head) {
        int firstMax = Math.max(head.val, head.next.val);
        int secondMax = Math.min(head.val, head.next.val);
        Node q = head.next.next;
        while (q != null) {
            if (q.val >= firstMax) {
                secondMax = firstMax;
                firstMax = q.val;
            } else if (q.val >= secondMax) {
                secondMax = q.val;
            }
            q = q.next;
        }
        return firstMax + secondMax;
    }
}