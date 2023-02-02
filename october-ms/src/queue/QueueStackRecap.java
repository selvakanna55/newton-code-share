package queue;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueStackRecap {
    static void stack() {
        Stack<Integer> st = new Stack<>();
        st.push(10); //add
        st.peek(); // without remove want to see the element
        st.pop(); //remove
        System.out.println(st.isEmpty());
        System.out.println(st.size());
    }


    void queue() {

        //stack();
        Queue<Integer> q = new LinkedList<>();
        // add
        q.offer(10); // no exp
        q.add(20);

        System.out.println(q.peek()); // without remove want to see the element

        // remove
        q.poll();
        q.remove();
        q.poll(); // no expe


        System.out.println(q.isEmpty());
        System.out.println(q.size());
    }

    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addLast(10);
        dq.addFirst(20);
        System.out.println(dq.peekFirst());
        System.out.println(dq.peekLast());
        dq.removeFirst();
        dq.removeLast();
        System.out.println(dq.isEmpty());
        System.out.println(dq.size());
    }
}
