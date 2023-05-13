package linkedlist;


class Node {
    int value;
    Node next;

    Node(int number) { //added
        value = number;
    }
}


class LLBasicInt {
    public static void main(String args[]) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
    }
}