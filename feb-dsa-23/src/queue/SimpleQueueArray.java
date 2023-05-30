package queue;


import java.util.*;

class QueueArray {
    int arr[];
    int size;
    int rear = 0;
    int front = 0;

    QueueArray(int capacity) {
        size = capacity;
        arr = new int[size];
    }

    void enqueue(int num) { // add at the join -> join in queue
        arr[rear] = num;
        rear++;
    }

    void dequeue() { // remove from the begining -> issue ticket
        System.out.println("removing " + arr[front]);
        front++;
    }
}

class SimpleQueueArray {
    public static void main(String args[]) {
        QueueArray q = new QueueArray(5);
        q.enqueue(10);
        q.enqueue(20);
        q.dequeue();
        q.dequeue();
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        System.out.println(Arrays.toString(q.arr));
        q.dequeue();
        q.dequeue();
        System.out.println(Arrays.toString(q.arr));
    }
}