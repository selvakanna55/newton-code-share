package stack;

class QueueArray {
    int front = -1;
    int rear = -1;
    int size = 0; // currently how many lements are present
    int capacity;
    int arr[];

    QueueArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
    }

    void enqueue(int num) {
        if (front == -1)
            front = 0;
        if (size == capacity) {
            System.out.println("Queue is full");
        } else {
            rear++;
            arr[rear] = num;
            size++;
        }
    }

    void dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(arr[front]);
            front++;
            size--;
        }
    }

    void peek() {
        if (size == 0) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(arr[front]);
        }
    }
}

public class QueueUsingArray {
    public static void main(String[] args) {
        QueueArray q = new QueueArray(3);
        q.dequeue(); // empty
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40); // queue is full
        q.dequeue();
        q.peek();
    }
}

