package queue;


class ArrayQueue {
    int capacity;
    int arr[];
    int rear = 0, front = 0;

    ArrayQueue(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
    }

    void enqueue(int num) { // insertion
        if (rear == capacity) {
            System.out.println("Queue is full");
        } else {
            arr[rear] = num;
            rear++;
        }
    }

    void dequeue() { // deletion
        if (front == rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(arr[front]);
            front++;
        }
    }

    void peek() { // with deleting, show then elememnt
        if (front == rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("peek is " + arr[front]);
        }
    }
}

class QueueUsingArray {
    public static void main(String args[]) {
        ArrayQueue aq = new ArrayQueue(3);
        aq.dequeue(); // Queue is empty
        aq.enqueue(10);
        aq.enqueue(20);
        aq.enqueue(30);
        aq.enqueue(40); // Queue is full
        aq.dequeue(); // 10
        aq.peek();
        aq.dequeue(); //20
        aq.dequeue(); // 30
        aq.dequeue(); // Queue is empty
    }
}