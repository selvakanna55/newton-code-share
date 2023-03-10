package assignments;

public class AddTwoNumbers {
    static class Node {
        Node next;
        int data;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    static Node addNumber(Node first, Node second) {
        int carry = 0;
        Node result = new Node(-1);
        Node curr = result;
        while (first != null && second != null) {
            int sum = carry + first.data + second.data;
            curr.next = new Node(sum % 10);
            carry = sum / 10;
            curr = curr.next;
            first = first.next;
            second = second.next;
        }
        while (first != null) {
            int sum = carry + first.data;
            curr.next = new Node(sum % 10);
            carry = sum / 10;
            curr = curr.next;
            first = first.next;
        }
        while (second != null) {
            int sum = carry + second.data;
            curr.next = new Node(sum % 10);
            carry = sum / 10;
            curr = curr.next;
            second = second.next;
        }
        if (carry != 0) {
            curr.next = new Node(carry);
        }
        return result.next;
    }

}
