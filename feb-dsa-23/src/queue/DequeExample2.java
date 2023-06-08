package queue;


import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample2 {
    public static void main(String args[]) {
        // Queue<Integer> dq = new LinkedList<>();
        Deque<Integer> dq = new ArrayDeque<>();
        dq.addFirst(10);
        dq.addFirst(20);
        dq.addLast(30);
        dq.addLast(40);
        System.out.println(dq.getFirst());
        System.out.println(dq.removeLast());
    }
}