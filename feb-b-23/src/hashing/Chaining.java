package hashing;


import java.util.*;
import java.io.*;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class Hashing {
    Node arr[];
    int len;

    Hashing(int len) {
        this.len = len;
        arr = new Node[len];
    }

    int hasFunction(int num) {
        return num % len;
    }

    void insert(int num) {
        int idx = hasFunction(num);
        Node newNode = new Node(num);
        Node curr = arr[idx];
        if (curr == null) {
            arr[idx] = newNode;
        } else {
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = newNode;
        }
    }

    void search(int num) {
        int idx = hasFunction(num);
        Node curr = arr[idx];
        boolean found = false;
        while (curr != null) {
            if (curr.val == num) {
                found = true;
                break;
            }
            curr = curr.next;
        }
        System.out.println("is " + num + " present? " + found);
    }
}

class Chaining {
    public static void main(String args[]) {
        Hashing obj = new Hashing(6);
        obj.insert(1);
        obj.insert(7);
        obj.insert(13);
        obj.insert(4);
        obj.insert(10);
        obj.insert(16);
        obj.insert(22);
        obj.search(10);
        obj.search(13);
        obj.search(14);
    }
}