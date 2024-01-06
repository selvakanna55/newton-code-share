package queue;

import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayDeque;

public class JavaUtilQueue {
    // Newton School Online Java compiler to run Java online.
    // Write Java code in this online editor and run it.
    public static void main(String[] args) {
        // Queue<Integer> q = new ArrayDeque<>();
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);

        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q.remove());
        System.out.println(q);

        // offer and poll -> same as add and remove, but exception are ignored instead of throwing
        q.offer(40);
        System.out.println(q.poll());
    }
}