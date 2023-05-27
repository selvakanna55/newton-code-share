package hashing;


import java.util.ArrayList;
import java.util.*;
import java.util.LinkedList;

public class SetsExample {
    void linkedList() {
        LinkedList<Integer> li = new LinkedList<>();
        li.add(10);
        li.add(20);
        li.add(30);
        li.add(40);
        System.out.println(li);
    }

    public static void main(String[] args) {
        LinkedHashSet<Integer> hs = new LinkedHashSet<>(); // tree set
        hs.add(10);
        hs.add(20);
        System.out.println(hs);
        hs.add(20);
        System.out.println(hs);
        hs.add(35);
        hs.add(48);
        hs.add(1);
        hs.add(48);
        hs.add(10);
        System.out.println(hs);

    }
}


// HashSet      -> hashing      -> O(1)     -> no order
// TreeSet      -> binary trees -> O(logn)  -> sorted order
// LinkedHashSet-> linkedList   -> O(n)     -> inserted order