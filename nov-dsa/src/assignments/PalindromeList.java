package assignments;

public class PalindromeList {
    static class Node {
        Node next;
        int val;

        Node(int val) {
            this.val = val;
            next = null;
        }
    }

    public static Node reverseList(Node head) {
        Node curr = head;
        Node prev = null;
        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public static boolean IsPalindrome(Node head) {
        Node fast = head;
        Node slow = head;
        Node prevSlow = head;
        while (fast != null && fast.next != null) {
            prevSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prevSlow.next = null;
        Node reversed = reverseList(slow);

        Node p1 = head;
        Node p2 = reversed;
        while (p1 != null) {
            if (p1.val != p2.val) {
                return false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }
}
