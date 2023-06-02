package queue;


class QueueArrayString {
    String arr[];
    int size;
    int rear = 0;
    int front = 0;

    QueueArrayString(int capacity) {
        size = capacity;
        arr = new String[size];
    }

    void enqueue(String name) { // add at the join -> join in queue
        if (rear == arr.length) { // at last index
            System.out.println("Queue is full");
        } else {
            arr[rear] = name;
            rear++;
        }
    }

    void dequeue() { // remove from the begining -> issue ticket
        if (front == rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("removing " + arr[front]);
            arr[front] = ""; // reset to deault
            front++;
        }
    }
}

public class QueueArrayStringExample {
    public static void main(String args[]) {
        QueueArrayString q = new QueueArrayString(3);
        q.dequeue(); // quque is empty
        q.enqueue("arun");
        q.enqueue("varun");
        q.enqueue("raj");
        q.enqueue("yash"); // quque is full
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue(); // queue is empty
    }
}