import java.lang.reflect.Array;
import java.util.ArrayList;

class Node<T> {
    T val;
    Node next;

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
        ArrayList<Integer> li = new ArrayList<>();
        Node<Integer> head = new Node<>(10);
        head.next = new Node<Integer>(20);
        head.next.next = new Node<Integer>(30);

        Node<String> head1 = new Node<>("dfr");
        head1.next = new Node<Integer>(20);
        head1.next.next = new Node<Integer>(30);


        printLL(head);
        printLL(head1);
    }
}
