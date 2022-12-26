package oct_meta;


import java.util.ArrayList;

class QueueArrayImpl {
    int arr[];
    //    ArrayList<Integer> arr;
    int len;
    int front = -1;
    int rear = -1;

    QueueArrayImpl(int size) {
        len = size;
        arr = new int[size];
//        arr = new ArrayList<>(size);
    }

    void enqueue(int val) {
        if (rear + 1 == len) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear++;
        arr[rear] = val;
//        arr.add(rear, val);
    }

    void dequeue() {
        if (front == len || front == -1) {
            System.out.println("Queue is empty");
            return;
        }
//        System.out.println("removing " + arr.get(front));
        System.out.println("removing " + arr[front]);
        front++;

    }
}

public class QueueArray {
    public static void main(String[] args) {
        QueueArrayImpl q = new QueueArrayImpl(3);
        q.dequeue();//empty
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40); // full
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();//empty
    }
}
