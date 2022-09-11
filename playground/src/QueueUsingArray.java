class QueueArray {
    int front = 0;
    int rear = 0;
    int arr[];
    int capacity;

    QueueArray(int size) {
        arr = new int[size];
        capacity = size;
    }

    void enqueue(int num) {
        if (rear == capacity) {
            System.out.println("Queue is full");
        } else {
            arr[rear] = num;
            rear++;
        }
    }

    void deque() {
        if (rear == front) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("deleting " + arr[front]);
            front++;
        }

    }
}

public class QueueUsingArray {
    public static void main(String[] args) {
        QueueArray q = new QueueArray(3);
        q.deque(); // empty
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40); // full
        q.deque();
        q.deque();
        q.deque();
        q.deque();
    }
}
