package linkedlist;

// https://leetcode.com/problems/merge-two-sorted-lists/
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode p1 = list1, p2 = list2;
        ListNode dummy = new ListNode(-1);
        //O(1)
        ListNode result = dummy;
        while (p1 != null && p2 != null) {
            if (p1.val < p2.val) {
                result.next = p1;
                p1 = p1.next;//i++
            } else {
                result.next = p2;
                p2 = p2.next;//j++
            }
            result = result.next; //k++
        }

        if (p1 != null) {
            result.next = p1;
        }
        if (p2 != null) {
            result.next = p2;
        }
        return dummy.next;

    }
}
