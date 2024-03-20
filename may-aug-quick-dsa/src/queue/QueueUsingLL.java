package queue;


class Node {
    Node next;
    int val;

    Node(int val) {
        this.val = val;
    }
}

class QueueLL {
    Node head = null, tail = null;

    void insert(int num) { //O(1)
        Node newNode = new Node(num);
        if (head == null) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
    }

    int remove() { //O(1)
        int val = -1;
        if (head != null) {
            val = head.val;
            head = head.next;
        }
        return val;
    }

    boolean isEmpty() {
        return head == null;
    }
}

public class QueueUsingLL {
    public static void main(String[] args) {
        QueueLL qll = new QueueLL();
        qll.insert(10);
        qll.insert(20);
        qll.insert(30);
        System.out.println(qll.remove());//10
        System.out.println(qll.remove());//20
        System.out.println(qll.remove());//30
        System.out.println(qll.remove()); //-1
        qll.insert(40);
        System.out.println(qll.remove()); //40
    }
}