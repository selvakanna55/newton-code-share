package queue;

class QueueArray {
    int arr[];
    int size;
    int front = 0;
    int rear = -1;

    QueueArray(int size) {
        arr = new int[size];
        this.size = size;
    }

    void enqueue(int val) { // insert
        if (rear + 1 == size) {
            System.out.println("Queue is full");
        } else {
            rear++;
            arr[rear] = val;
        }
    }

    void dequeue() { // deletion
        if (rear + 1 == front) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(arr[front]);
            front++;
        }
    }
}

public class QueueUsingArray {
    public static void main(String[] args) {
        QueueArray qa = new QueueArray(3);
        qa.dequeue(); // queue is empty
        qa.enqueue(10);
        qa.enqueue(20);
        qa.enqueue(30);
        qa.dequeue(); // 10
        qa.enqueue(40); // queue is full
        qa.dequeue(); // 20
        qa.dequeue(); //30
    }
}
