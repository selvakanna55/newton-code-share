package linkedlist;


class LinkedList1 {
    Node head;

    void insertAtEnd(int val) {
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

    boolean search(int number) {
        Node curr = head;
        boolean ans = false;
        while (curr != null) {
            if (curr.value == number) {
                ans = true;
                break;
            }
            curr = curr.next;
        }
        return ans;
    }
}

public class Chaining {
    public static int hashFunction(int number) {
        int tableLength = 8;
        return number % tableLength;
    }

    public static void main(String args[]) {
        int arr[] = {6, 4, 14, 22, 30};
        int n = arr.length;
        int tableLength = 8;

        LinkedList1 table[] = new LinkedList1[tableLength];
        // int -> LinkedList

        for (int i = 0; i < tableLength; i++) {
            table[i] = new LinkedList1();
        }

        for (int i = 0; i < n; i++) { // assign values
            table[hashFunction(arr[i])].insertAtEnd(arr[i]);
        }

        // search
        System.out.println(table[hashFunction(3)].search(3)); //
        System.out.println(table[hashFunction(22)].search(22)); //
        System.out.println(table[6].search(22)); //
        System.out.println(table[hashFunction(86)].search(86)); //
    }
}