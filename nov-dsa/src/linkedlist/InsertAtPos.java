package linkedlist;


class LinkedListI {
    Node head = null;

    void insertAtPos(int pos, int val) { //assuming positions are valid
        Node temp = new Node(val);
        if (pos == 1) {
            temp.next = head;
            head = temp;
        } else {
            Node curr = head; //13
            for (int i = 2; i < pos; i++) {
                curr = curr.next;
            }
            Node nextNode = curr.next; // 6
            curr.next = temp;
            temp.next = nextNode;
        }
    }

    void printLL() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

class InsertAtPos {
    public static void main(String args[]) {
        LinkedListI ll = new LinkedListI();
        ll.insertAtPos(1, 10);
        ll.insertAtPos(2, 20);
        ll.insertAtPos(3, 30);
        ll.insertAtPos(4, 40);
        ll.printLL();
        ll.insertAtPos(3, 999);
        ll.printLL();
    }
}