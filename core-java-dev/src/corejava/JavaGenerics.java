package corejava;

class Node<T> {
    T value;
    Node next;

    Node(T value) {
        this.value = value;

    }
}

public class JavaGenerics {
    static void printLL(Node root) {
        Node curr = root;
        while (curr != null) {
            System.out.println(curr.value);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(5);
        head.next.next = new Node(9.8);
        printLL(head);
    }
}
