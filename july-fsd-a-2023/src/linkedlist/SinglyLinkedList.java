package linkedlist;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class LinkedList {
    Node head;


    void insertAthEnd(int num) {
        Node newNode = new Node(num);
        if (head == null) { //this is the first
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    void print() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
        // System.out.println("curr value->"+(curr==null ? curr : curr.val));
    }

    void insertAtPos(int pos, int num) {
        // 1 to n
        Node newNode = new Node(num);
        if (pos == 1) {
            if (head == null) {
                head = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }

        } else {
            Node curr = head;
            for (int i = 1; i < pos - 1; i++) { //<pos-1 or <=pos-2
                curr = curr.next;
            }
            newNode.next = curr.next;
            curr.next = newNode;
        }
    }

    void deleteAtPos(int pos) {
        if (pos == 1) {
            head = head.next;
        } else {
            Node curr = head;
            for (int i = 1; i < pos - 1; i++) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
        }
    }
}

public class SinglyLinkedList {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insertAthEnd(10);
        l.insertAthEnd(20);
        l.insertAthEnd(27);
        l.insertAthEnd(30);
        l.insertAthEnd(40);
        l.print();
        l.deleteAtPos(4);//deletes 30
        l.print();
        l.deleteAtPos(1);//deletes 10
        l.print();
        l.deleteAtPos(3);//deletes 40
        l.print();
    }
}


// l.insertAthEnd(10);
//         l.insertAthEnd(20);
//         l.insertAthEnd(30);
//         l.print();
// l.insertAtPos(4, 40);
// l.print();
// l.insertAtPos(3, 27);
// l.print();
// l.insertAtPos(1, 7);
// l.print();