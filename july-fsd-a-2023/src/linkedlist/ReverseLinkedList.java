package linkedlist;

// https://leetcode.com/problems/reverse-linked-list/description/
public class ReverseLinkedList {
    //     // https://media.geeksforgeeks.org/wp-content/cdn-uploads/RGIF2.gif
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }
}