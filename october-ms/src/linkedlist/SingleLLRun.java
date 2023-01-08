package linkedlist;

class SingleLL {
    Node head = null;

    void insertAtTheEnd(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    void updateAtPos(int pos, int val) {
        Node prev = head;
        for (int i = 2; i <= pos; i++) {
            prev = prev.next;
        }
        prev.val = val;
    }


    void insertAtPos(int pos, int val) {
        Node newNode = new Node(val);
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            Node prev = head;
            for (int i = 2; i < pos; i++) {
                prev = prev.next;
            }
            newNode.next = prev.next;
            prev.next = newNode;
//            Node next = prev.next;
//             prev.next = newNode;
//            newNode.next = next;
        }
    }

    void deleteAtPos(int pos) {
        if (pos == 1) {
            head = head.next;
        } else {
            Node curr = head;
            for (int i = 2; i < pos; i++) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
        }
    }

    void print() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

public class SingleLLRun {
    public static void main(String[] args) {
        SingleLL list = new SingleLL();
        for (int i = 10; i <= 50; i += 10) {
            list.insertAtTheEnd(i);
        }
        list.print();
        list.deleteAtPos(3);
        list.print();

        Node a = new Node(10);
        a.val = 999;
    }
}
