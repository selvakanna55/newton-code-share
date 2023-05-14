package linkedlist;

class Node {
    Node next;
    int value;

    Node(int value) {
        this.value = value;
    }
}

class LinkedList {
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
        }
    }


    void deleteAtPos(int position) {
        if (position == 1) {
            head = head.next;
        } else {
            Node curr = head;
            for (int i = 1; i < position - 1; i++) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
        }
    }

    void deleteNodewByValue(int number) {
        if (head.value == number) {
            head = head.next;
        } else {
            Node curr = head;
            Node prev = null;
            while (curr != null) {
                if (curr.value == number) {
                    prev.next = prev.next.next;
                    break;
                }
                prev = curr;
                curr = curr.next;
            }
        }
    }

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




