package queue;


class QueueArray{
    int arr[];
    int size;
    int front = -1;
    int rear = -1;

    QueueArray(int size){
        arr = new int[size];
        this.size = size;
    }

    void add(int val){
        if(rear+1<size){
            if(front==-1){
                front = 0;
            }
            rear++;
            arr[rear] = val;
        }else{
            System.out.println("Queue is full");
        }
    }

    void remove(){
        if(front==-1 || front>=size){
            System.out.println("Queue is empty");
        }else{
            System.out.println("removing "+arr[front]);
            front++;
        }
    }
}

public class QueueArrayImpl {
    public static void main(String[] args) {
        QueueArray q  = new QueueArray(4);
        q.remove(); //empty
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50); // full
        q.remove(); //  10
        q.remove(); //  20
        q.remove(); //  30
        q.remove(); //  40
        q.remove(); //  empty
    }
}