package linkedlist;


class LinkedList {
    Node head;

    void insertAtEnd(int number) {
        Node newNode = new Node(number);
        if (head == null) { // inserting first node
            head = newNode;
        } else {
            Node curr = head; // loop to reach the last node
            while (curr.next != null) { //how to find last node? -> last node.next will be null
                curr = curr.next;
            }
            curr.next = newNode; //insert once you reach last node
        }
    }


    void print() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.value + " ");
            curr = curr.next;
        }
    }
}


class SingltyLL {
    public static void main(String args[]) {
        LinkedList l1 = new LinkedList();
        l1.insertAtEnd(10);
        l1.insertAtEnd(20);
        l1.insertAtEnd(30);
        l1.insertAtEnd(40);
        l1.print();
    }
}




