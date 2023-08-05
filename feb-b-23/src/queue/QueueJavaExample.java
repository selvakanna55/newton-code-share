package queue;


import java.util.LinkedList;
import java.util.Queue;

public class QueueJavaExample {
    public static void main(String args[]) {
        Queue<Integer> q1 = new LinkedList<>();
        // linkedlist implements the interface Queue
        q1.add(10); //enqueue
        q1.add(20);
        q1.offer(30);
        System.out.println(q1.remove()); //dequeue
        System.out.println(q1.remove()); //dequeue
        System.out.println(q1.remove()); //dequeue
        System.out.println(q1.poll()); //dequeue

    }
}

// System.out.println(q1.size());
//         System.out.println(q1.peek()); //peek