package arena;

//https://my.newtonschool.co/playground/code/g0kjpvcm5u40
public class SwapNodesInALinkedList {
    public static Node solve(Node head) {
        Node second = head.next;

        // to find second last node
        Node curr = head;
        while (curr.next.next != null) { //when loop ends, curr will be at second last node
            curr = curr.next;
        }
        Node secondLast = curr;

        //swap
        int temp = second.val;
        second.val = secondLast.val;
        secondLast.val = temp;
        return head;
    }
}
