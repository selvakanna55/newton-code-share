// https://my.newtonschool.co/playground/code/dsyv105yc8sv/
// https://my.newtonschool.co/playground/code/hl73mpzpwvaq/
//https://my.newtonschool.co/playground/code/tptamm30uj4z/
//        https://my.newtonschool.co/playground/code/zw4bznm44ggw/
class NodeLL {
    int val;

    NodeLL(int value) {
        val = value;
    }

    @Override
    public String toString() {
        return Integer.toString(val);
    }

    NodeLL next;
}

public class ReverseLinkedList {
    static void printLL(NodeLL head) {
        NodeLL curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    static NodeLL reverse(NodeLL head) {
        NodeLL prev = null;
        NodeLL curr = head;
        while (curr != null) {
            NodeLL temp = curr.next; // temp
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public static void main(String[] args) {
        NodeLL head = new NodeLL(10);
        head.next = new NodeLL(20);
        head.next.next = new NodeLL(30);
        head.next.next.next = new NodeLL(40);
        printLL(head);
        NodeLL reversed = reverse(head);
        printLL(reversed);
    }
}
