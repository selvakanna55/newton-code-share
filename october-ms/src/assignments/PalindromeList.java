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

    static Node reve(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public static boolean IsPalindrome(Node head) {
        Node slow = head;
        Node fast = head;
        Node prev = head;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;

        Node first = head;

        Node second = reve(slow);
        // System.out

        while (first != null && second != null) {
            // System.out.println(first.val+" "+second.val);
            if (first.val != second.val) {
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
    }
}
