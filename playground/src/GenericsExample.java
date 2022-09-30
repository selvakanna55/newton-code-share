import java.io.DataOutput;
import java.util.HashMap;
import java.util.HashSet;

class Node1<T> {
    T val;
    Node1<T> next;

    Node1(T val) {
        this.val = val;
    }

}



public class GenericsExample {
    static void printLL(Node1 head) {
        Node1 curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        HashSet<String> s = new HashSet<>();
        Node1<String> node11 = new Node1<>("10");
        //" aa" > "bb" ->101

        Node1 head = new Node1("aa"); // aa
        head.next = new Node1("bb"); // aa -> bb
        head.next.next = new Node1("cc"); // aa -> bb -> cc
        head.next.next.next = new Node1(651477777754584L); // aa -> bb -> cc
        printLL(head);


        Node1 head1 = new Node1(99); // aa
        head1.next = new Node1(101); // aa -> bb
        head1.next.next = new Node1(959); // aa -> bb -> cc
        printLL(head1);

    }
}
