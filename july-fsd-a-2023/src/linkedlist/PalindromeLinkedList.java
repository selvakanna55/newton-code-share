package linkedlist;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        // 1. find middle
        ListNode slow = head;
        ListNode fast = head;
        ListNode prevSlow = head;
        while (fast != null && fast.next != null) {
            prevSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        // break the connection
        prevSlow.next = null;

        // slow is starting point for next half;
        // reverse second half
        ListNode prev = null;
        ListNode curr = slow;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }


        ListNode p1 = head;
        ListNode p2 = prev; //prev is begning of the reversed node
        boolean ans = true;
        while (p1 != null) {
            if (p1.val != p2.val) {
                ans = false;
                break;
            }
            p1 = p1.next;
            p2 = p2.next;
        }
        return ans;
    }
}
