package linkedlist;

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }
}

class LinkedList {
    Node head;

    void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.value + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    void insertAtPos(int pos, int num) {
        Node newNode = new Node(num);
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            Node curr = head;
            for (int i = 2; i < pos; i++) {
                curr = curr.next;
            }
            newNode.next = curr.next;
            curr.next = newNode;
        }
    }

    void insertAtEnd(int num) {
        Node newNode = new Node(num);
        if (head == null) {
            head = newNode;
        } else {
            Node curr = head;
            // move curr to the last node
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }


    void deletePos(int pos) {
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

}

public class LinkedListExample {

    public static void main(String args[]) {
        LinkedList l1 = new LinkedList();
        l1.insertAtPos(1, 10);
        l1.insertAtPos(2, 20);
        l1.insertAtPos(3, 30);
        l1.insertAtPos(4, 40);
        l1.insertAtPos(5, 50);
        l1.printList();
        l1.deletePos(4); //delete middle nodes
        l1.printList();
        l1.deletePos(4); // delete last node
        l1.printList();
        l1.deletePos(1); // delete head
        l1.printList();

//
//        Node head = new Node(10);
//        head.next = new Node(20);
//        head.next.next = new Node(30);
//        head.next.next.next = new Node(40);


//        l1.insertAtPos(4, 33);
//        l1.insertAtPos(1, 9); // insert at head
//        l1.printList();


        // Scanner sc = new Scanner(System.in);
        // // int n  =  sc.nextInt();
        // // for(int i=0;i<n;i++){
        // //     int num = sc.nextInt();
        // //     l1.insertAtEnd(num);
        // // }
        // // l1.printList();
    }
}




