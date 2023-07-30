package linkedlist;


class IsPalindrome {
    public ListNode reverseList(ListNode head) {
        // https://media.geeksforgeeks.org/wp-content/cdn-uploads/RGIF2.gif
        ListNode curr = head;
        ListNode prev = null;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) { //n
            slow = slow.next;
            fast = fast.next.next;
        }
        // slow is the middle
        ListNode p1 = head;
        ListNode p2 = reverseList(slow); //n

        boolean ans = true; //n
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