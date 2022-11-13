public class ReverseLinkedListII {
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummyNode = new ListNode(-1);
        dummyNode.next = head;
        head = dummyNode;

        ListNode prev = dummyNode;
        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }
        ListNode revTail = prev.next;


        int count = right - left + 1;
        ListNode curr = prev.next;
        ListNode prevR = null;
        while (count-- > 0) {
            ListNode temp = curr.next;
            curr.next = prevR;
            prevR = curr;
            curr = temp;
        }

        prev.next = prevR;
        revTail.next = curr;


        return dummyNode.next;


    }
}


