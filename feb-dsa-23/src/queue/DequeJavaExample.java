package queue;


import java.util.*;


public class DequeJavaExample {
    public static void main(String args[]) {
        Deque<Integer> dq1 = new ArrayDeque<>();
        dq1.add(10);
        dq1.add(20);
        dq1.add(30);
        dq1.addFirst(99);
        dq1.addLast(101); // same as dq1.add(10)
        System.out.println(dq1.removeFirst()); // dq1.remove();
        System.out.println(dq1.removeLast());
        // dq1.removeLast();
    }
}