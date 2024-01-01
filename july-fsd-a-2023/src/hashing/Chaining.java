package HashingChaining;


import java.util.*;


class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class LinkedList {
    Node head;

    void insertAthEnd(int num) {
        Node newNode = new Node(num);
        if (head == null) { //this is the first
            head = newNode;
        } else {
            Node curr = head;
            while (curr.next != null) {
                curr = curr.next;
            }
            // curr is same as taol
            curr.next = newNode;
        }
    }

    void print() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
        // System.out.println("curr value->"+(curr==null ? curr : curr.val));
    }

    boolean contains(int num) {
        Node curr = head;
        while (curr != null) {
            if (curr.val == num) {
                return true;
            }
            curr = curr.next;
        }
        return false;
    }

}


class HashingChaining {
    LinkedList hashTable[];
    int size;

    HashingChaining(int size) {
        this.size = size;
        hashTable = new LinkedList[size];
        System.out.println("before new LinkedList[] " + Arrays.toString(hashTable));
        for (int i = 0; i < size; i++) {
            hashTable[i] = new LinkedList();
        }
        System.out.println("after new LinkedList[] " + Arrays.toString(hashTable));
    }

    int hashFunction(int num) {
        // return num;
        return num % size;
    }

    void add(int num) {
        int index = hashFunction(num);
        hashTable[index].insertAthEnd(num);
        // hashTable[index] = num;
    }

    void check(int num) {
        int index = hashFunction(num);
        // if(hashTable[index] == num){
        if (hashTable[index].contains(num)) {
            System.out.println(num + " is present");
        } else {
            System.out.println(num + " is not present");
        }
    }
}

public class Chaining {
    public static void main(String[] args) {
        int n = 10;
        HashingChaining h = new HashingChaining(n);
        // int nums[] = {88,91,20,98,30,99};
        int nums[] = {55, 65, 75, 85, 95, 106, 12, 14, 16, 18, 22, 33};
        for (int num : nums) {
            h.add(num);
        }
        // for(int i=0;i<n;i++){
        //     System.out.print(i+" ");
        //     h.hashTable[i].print();
        // }
        // System.out.println(Arrays.toString(h.hashTable));
        // h.check(91);
        h.check(87);
        h.check(22);
        h.check(32);
    }
}