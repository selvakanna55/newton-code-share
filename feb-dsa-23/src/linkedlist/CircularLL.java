package linkedlist;


class CircularLinkedList {
    Node head;

    void insertAtPos(int position, int number) {
        Node newNode = new Node(number);
        if (position == 1) {// insert at pos
            newNode.next = head;
            head = newNode;
        } else {
            Node curr = head;
            for (int i = 1; i < position - 1; i++) {
                curr = curr.next;
            }
            Node nextNode = curr.next;

            // make connection
            curr.next = newNode;
            newNode.next = nextNode;

            if (newNode.next == null) {
                newNode.next = head;
            }

        }
    }


    void print() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.value + " ");
            curr = curr.next;
            if (curr == head) {
                break;
            }
        }
    }
}

class CircularLL {
    public static void main(String args[]) {
        CircularLinkedList l1 = new CircularLinkedList();
        l1.insertAtPos(1, 10);
        l1.insertAtPos(2, 20);
        l1.insertAtPos(3, 30);
        l1.insertAtPos(4, 40);
        l1.print();
    }
}