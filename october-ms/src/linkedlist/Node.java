package linkedlist;

public class Node {
    public int val;

    public Node(int val) {
        this.val = val;
    }

    public Node next;

    @Override
    public String toString() {
        return Integer.toString(val);
    }
}