package linkedlist;

// https://leetcode.com/problems/palindrome-linked-list/
public class PalindromeLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null, curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {

        // find middle
        ListNode slow = head, fast = head, prevSlow = head;
        while (fast != null && fast.next != null) {
            prevSlow = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prevSlow.next = null;
        ListNode reversed = reverseList(slow);
        ListNode p1 = head, p2 = reversed;
        boolean ans = true;
        while (p1 != null && p2 != null) {
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
