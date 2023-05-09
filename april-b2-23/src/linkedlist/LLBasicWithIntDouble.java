package linkedlist;


class Node1 {
    int value;
    double percentage; //added
    Node1 next;

    Node1(int number, double pecent) { //added
        value = number;
        percentage = pecent; //added
    }
}


class LLBasicWithIntDouble {
    public static void main(String args[]) {
        Node1 head = new Node1(10, 5.5);
        head.next = new Node1(20, 6.6);
        head.next.next = new Node1(30, 7.7);
    }
}