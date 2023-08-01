package hashing;


import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;

class SetExample {
    public static void main(String args[]) {
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(40);
        hs.add(20);
        hs.add(30);
        hs.add(-6);
        System.out.println(hs);
        System.out.println(hs.contains(30));  //search
        System.out.println(hs.contains(11));
        for (int num : hs) {
            System.out.println(num);
        }
    }
}

// hashmap, hashset