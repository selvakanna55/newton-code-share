package hashing;


import linkedlist.Node;

class HashingChaining { //O(1) -> O(n)
    Node hashtable[];
    int size;

    HashingChaining(int size) {
        this.size = size;
        hashtable = new Node[size];
    }

    int hashFunction(int num) {
        return num % size;
    }

    void add(int num) {
        int key = hashFunction(num);
        Node newNode = new Node(num);
        if (hashtable[key] == null) {
            hashtable[key] = newNode;
        } else {
            Node curr = hashtable[key];
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    void search(int num) {
        int key = hashFunction(num);
        Node curr = hashtable[key];
        boolean ans = false;
        while (curr != null) {
            if (curr.val == num) {
                ans = true;
                break;
            }
            curr = curr.next;
        }
        System.out.println(ans);
    }


}

public class HashingChainingRun {
    public static void main(String[] args) {
        HashingChaining hs = new HashingChaining(7);
        hs.add(4);
        hs.add(3);
        hs.add(5);
        hs.add(2);
        hs.add(10);
        hs.add(17);
        hs.search(4);
        hs.search(14);
        hs.search(17);
        hs.search(24);
    }
}
