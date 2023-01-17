package hashing;

import java.util.HashMap;

class HashingSimple { //O(1) -> O(n)
    int hashtable[];
    int size;

    HashingSimple(int size) {
        this.size = size;
        hashtable = new int[size];
    }

    int hashFunction(int num) {
        return num % size;
    }

    void add(int num) {
        int key = hashFunction(num);
        if (hashtable[key] == 0) {
            hashtable[key] = num;
        } else {
            System.out.println("key is already, collision");
        }
    }

    void search(int num) {
        int key = hashFunction(num);
        if (hashtable[key] == num) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }


}

public class HashingSimpleRun {
    public static void main(String[] args) {
        HashingSimple hs = new HashingSimple(7);
        hs.add(4);
        hs.add(3);
        hs.add(5);
        hs.add(2);
        hs.add(10);
        hs.search(4);
        hs.search(14);
    }
}
