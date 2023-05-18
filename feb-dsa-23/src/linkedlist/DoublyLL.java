package linkedlist;


class NodeDLL {
    int value;
    NodeDLL next;
    NodeDLL prev; // to go to previous NodeDLL

    NodeDLL(int number) {
        value = number;
    }
}

class DoublyLinkedList {
    NodeDLL head;

    void insertAtPos(int pos, int number) {
        NodeDLL newNodeDLL = new NodeDLL(number);
        if (pos == 1) {
            newNodeDLL.next = head;
            if (head != null) {  //doubly LinkedList
                head.prev = newNodeDLL;
            }
            head = newNodeDLL;
        } else {
            NodeDLL curr = head;
            for (int i = 1; i < pos - 1; i++) {
                curr = curr.next;
            }
            NodeDLL nextNodeDLL = curr.next;

            curr.next = newNodeDLL;
            newNodeDLL.next = nextNodeDLL;

            newNodeDLL.prev = curr; // doubly LinkedList
            if (nextNodeDLL != null) { // doubly LinkedList
                nextNodeDLL.prev = newNodeDLL;
            }
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

    void printFromBack() {
        NodeDLL curr = head;
        // move curr to last NodeDLL
        while (curr.next != null) {
            curr = curr.next;
        }

        while (curr != null) {
            System.out.print(curr.value + " ");
            curr = curr.prev; // go to previous NodeDLL
        }
        System.out.println();
    }
}

class DoublyLL {
    public static void main(String args[]) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtPos(1, 10);
        list.insertAtPos(2, 20);
        list.insertAtPos(3, 30);
        list.insertAtPos(4, 40);
        list.print();
        list.printFromBack();
    }
}