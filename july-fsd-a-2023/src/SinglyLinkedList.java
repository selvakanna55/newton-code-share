
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

    }
}

public class SinglyLinkedList {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.insertAthEnd(10);
        l.insertAthEnd(20);
        l.insertAthEnd(30);
        l.insertAthEnd(40);
        l.print();
    }
}