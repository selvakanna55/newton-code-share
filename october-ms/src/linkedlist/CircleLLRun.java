package linkedlist;

class CircleLL {
    Node head = null;
    Node tail = null;

    void insertAtEnd(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        tail.next = head;
    }

    void print() {

//        Node curr = head;
//        while (curr != null) {
//            System.out.print(curr.val + " ");
//            curr = curr.next;
//            if (curr == head) {
//                break;
//            }
//        }
        Node curr = head;
        do {
            System.out.print(curr.val + " ");
            curr = curr.next;
        } while (curr != head);
        System.out.println();

    }
}

public class CircleLLRun {
    public static void main(String[] args) {
        CircleLL cll = new CircleLL();
        cll.insertAtEnd(10);
        cll.insertAtEnd(20);
        cll.insertAtEnd(30);
        cll.insertAtEnd(40);
        cll.print();
    }
}
