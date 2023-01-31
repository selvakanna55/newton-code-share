package queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueJava {
    // insertion -> offer, add
    // deletion  -> poll, remove

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(10); //at end
        q.offer(20);
        q.offer(30);
        System.out.println(q.poll());//removal beg
        System.out.println(q.poll());
        System.out.println(q.poll());
    }
}
