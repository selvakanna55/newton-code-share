package modulo;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }

    @Override
    public String toString() {
        return String.valueOf(val);
    }
}

class Chaining {
    Node ht[]; // hashtable
    int size;

    Chaining(int size) {
        ht = new Node[size];
        this.size = size;
    }

    int hashFunction(int num) {
        return num % size;
    }

    void put(int num) {
        int idx = hashFunction(num);
        if (ht[idx] == null)
            ht[idx] = new Node(num);
        else {
            // insert at the end
            Node temp = ht[idx];
            while (temp.next != null)
                temp = temp.next;
            temp.next = new Node(num);
        }
    }

    boolean get(int num) {
        int idx = hashFunction(num);
        Node temp = ht[idx];
        while (temp != null) {
            if (temp.val == num)
                return true;
            temp = temp.next;
        }
        return false;
    }
}

public class Hashing1 {
    public static void main(String[] args) {
        Chaining hSet = new Chaining(4);
        hSet.put(1);
        hSet.put(3);
        hSet.put(5);
        hSet.put(9);
        hSet.put(13);
        System.out.println(hSet.get(1)); //true
        System.out.println(hSet.get(10)); //false
        System.out.println(hSet.get(13)); //true
    }
}
