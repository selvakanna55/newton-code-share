package queue;

import java.util.Deque;
import java.util.LinkedList;

public class DqueueJava {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addLast(10);
        dq.addFirst(20);
        System.out.println(dq.removeFirst());
        System.out.println(dq.removeLast());
    }
}
