package linkedlist;


class Node {
    int value;
    double pecentage; //added
    Node next;

    Node(int number, double pecent) { //added
        value = number;
        pecentage = pecent; //added
    }
}


class LLBasicInt {
    public static void main(String args[]) {
        Node head = new Node(10, 20.5);
        head.next = new Node(20, 3.5);
        head.next.next = new Node(30, 4.5);
    }
}