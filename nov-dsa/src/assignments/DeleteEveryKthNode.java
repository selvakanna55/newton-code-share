package assignments;

public class DeleteEveryKthNode {
    static class Node {
        int data;
        Node next;

        Node(int x) {
            data = x;
            next = null;
        }
    }

    static void print(Node head) {
        if (head == null) {
            return;
        }

        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
            if (curr == head) { // circular linkedlist
                break;
            }
        }
        System.out.println(head.data);
    }

    static Node deleteK(Node head, int k) {
        Node curr = head;
        Node prev = null;

        while (true) {
            if (curr == head && curr.next == head) {
                break;
            }
            print(head);
            for (int i = 0; i < k; i++) {
                prev = curr;
                curr = curr.next;
            }
            if (curr == head) {
                head = curr.next;
            }
            prev.next = curr.next;
        }
        return head;
    }
}
