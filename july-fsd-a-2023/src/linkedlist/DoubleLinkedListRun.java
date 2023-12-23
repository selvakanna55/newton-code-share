package linkedlist;



class NodeDLL {
    int val;
    NodeDLL next;
    NodeDLL prev;

    NodeDLL(int val) {
        this.val = val;
    }
}

class DoubleLinkedList {
    NodeDLL head;

    void insertAtEnd(int val) {
        NodeDLL newNode = new NodeDLL(val);
        if (head == null) {
            head = newNode;
        } else {
            NodeDLL curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
            newNode.prev = curr; // added extra for DLL
        }
    }

    void print() {
        NodeDLL curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    void printRev() {
        NodeDLL curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        // curr is now pointing to the last node in DoubleLinkedList
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.prev;
        }
        System.out.println();
    }

    void palindrome() {
        // run a loop to find a last node
        NodeDLL curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        NodeDLL left = head, right = curr;
        boolean ans = true;
        while (right.next != left && right != left) { //left<right
            if (left.val != right.val) {  // (arr[left]!=arr[right])
                ans = false;
                break;
            }
            left = left.next; // left++;
            right = right.prev; // right--; DLL
        }
        System.out.println(ans);
    }

}

public class DoubleLinkedListRun {
    public static void main(String[] args) {
        DoubleLinkedList l = new DoubleLinkedList();
        l.insertAtEnd(10);
        l.insertAtEnd(11);
        l.insertAtEnd(10);
        l.print();
        l.printRev();
        l.palindrome();
    }
}