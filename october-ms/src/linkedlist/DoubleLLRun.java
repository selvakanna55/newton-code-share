package linkedlist;

class DoubleLL {
    NodeDLL head = null;
    NodeDLL tail = null;
    int length = 0;

    void insertAtEnd(int val) {
        NodeDLL newNode = new NodeDLL(val);
        if (head == null) {
            head = newNode;
        } else {
            NodeDLL curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
            //            tail.next = newNode;
            newNode.prev = curr; // new line DLL
        }
//        tail = newNode;
//        length++;
    }

    void printForward() {
        NodeDLL curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    void printRevOrder() {

        NodeDLL lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        NodeDLL curr = lastNode;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.prev;
        }
        System.out.println();

    }

    void insertAtPos(int pos, int val) {
        NodeDLL newNode = new NodeDLL(val);
        if (pos == 1) {
            newNode.next = head;
            if (head != null) //new for DLL
                head.prev = newNode;
            head = newNode;
        } else {
            NodeDLL curr = head;
            for (int i = 2; i < pos; i++) {
                curr = curr.next;
            }
            NodeDLL nextNode = curr.next;
            newNode.next = nextNode;
            curr.next = newNode;
            // change for DLL
            newNode.prev = curr;
            if (nextNode != null) nextNode.prev = newNode;
        }
    }

    void deletePos(int pos) {
        if (pos == 1) {
            head = head.next;
            if (head != null) { //double
                head.prev = null;
            }
        } else {
            NodeDLL curr = head;
            for (int i = 2; i < pos; i++) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
            if (curr.next != null) // double
                curr.next.prev = curr;
        }
    }
}

public class DoubleLLRun {
    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.insertAtPos(1, 10);
        dll.insertAtPos(2, 20);
        dll.insertAtPos(3, 30);
        dll.insertAtPos(4, 40);
        dll.insertAtPos(5, 50);
        dll.printForward();
        dll.deletePos(3);
        dll.printForward();
        dll.deletePos(4);
        dll.printForward();
    }
}
