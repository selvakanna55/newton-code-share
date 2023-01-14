package linkedlist;

class DoubleCircleLL {
    NodeDLL head = null;

    void insertAtEnd(int val) {
        NodeDLL newNode = new NodeDLL(val);
        if (head == null) {
            head = newNode;
        } else {
            NodeDLL curr = head;
            while (curr.next != head) { // head
                curr = curr.next;
            }
            curr.next = newNode;
            newNode.prev = curr;//DLL
        }
        newNode.next = head; //DCLL
        head.prev = newNode;//DCLL
    }

    void printForward() {
        NodeDLL curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
            if (curr == head) {
                break;
            }
        }
        System.out.println();
    }

    void printReverse() {
        NodeDLL lastNode = head;
        while (lastNode.next != head) {
            lastNode = lastNode.next;
        }
        // reve
        NodeDLL curr = lastNode;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.prev;
            if (curr == lastNode) {
                break;
            }
        }
        System.out.println();
    }
}

public class DoubleCircleLLRun {
    public static void main(String[] args) {
        DoubleCircleLL dcll = new DoubleCircleLL();
        dcll.insertAtEnd(10);
        dcll.insertAtEnd(20);
        dcll.insertAtEnd(30);
        dcll.printForward();
        dcll.printReverse();
    }
}
