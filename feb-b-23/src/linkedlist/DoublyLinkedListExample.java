package linkedlist;


class NodeDLL {
    int value;
    NodeDLL next;
    NodeDLL prev;

    NodeDLL(int value) {
        this.value = value;
    }
}


class DoublyLinkedList {
    NodeDLL head;

    void insertAtPos(int pos, int num) {
        NodeDLL newNodeDLL = new NodeDLL(num);
        if (pos == 1) {
            if (head != null) {
                head.prev = newNodeDLL;
            }
            newNodeDLL.next = head;
            head = newNodeDLL;
        } else {
            NodeDLL curr = head;
            for (int i = 2; i < pos; i++) {
                curr = curr.next;
            }
            if (curr.next != null) { // insert in between
                curr.next.prev = newNodeDLL;
            }
            newNodeDLL.prev = curr; // extra DLL
            newNodeDLL.next = curr.next;
            curr.next = newNodeDLL;
        }
    }


    void deleteAtPos(int pos) {
        if (pos == 1) {
            if (head.next != null) {
                head.next.prev = null;
            }
            head = head.next;
        } else {
            NodeDLL curr = head;
            for (int i = 2; i < pos; i++) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
        }
    }


    void print() {
        NodeDLL curr = head;
        while (curr != null) {
            System.out.print(curr.value + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    void printFromLastNodeDLL() {
        NodeDLL curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        while (curr != null) {
            System.out.print(curr.value + " ");
            curr = curr.prev;
        }
        System.out.println();
    }
}

public class DoublyLinkedListExample {
    public static void main(String args[]) {
        DoublyLinkedList d1 = new DoublyLinkedList();
        d1.insertAtPos(1, 10);
        d1.insertAtPos(2, 20);
        d1.insertAtPos(3, 30);
        d1.insertAtPos(4, 35);
        d1.insertAtPos(5, 40);
        d1.print();
        d1.printFromLastNodeDLL();
    }
}