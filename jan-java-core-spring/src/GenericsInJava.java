class Node<T> {
    T val;
    Node<T> next;

    Node(T value) {
        val = value;
    }
}


public class GenericsInJava {

    static void printLL(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node<Integer> head = new Node<Integer>(10);
        head.next = new Node<Integer>(20);
        head.next.next = new Node<Integer>(30);
        printLL(head);
    }
}
