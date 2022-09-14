package collection_example;

import java.util.*;

public class SetExamples {
    public static void main(String[] args) {
        // Set -> set of unique numbers
        //
        // only store numbers
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(43);
        hs.add(30);
        hs.add(20);
//        System.out.println(hs);
        //Hashing
        //searching -> O(1), insertion -> O(1)
        //order: cannot be predicted

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        // LinkedList
        //searching -> O(n), insertionAtEnd -> O(1)
        //order: insertion order
        lhs.add(10);
        lhs.add(43);
        lhs.add(30);
        lhs.add(20);
//        System.out.println(lhs);

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(10);
        ts.add(43);
        ts.add(30);
        ts.add(20);
//        System.out.println(ts);
//        System.out.println(ts.add(20));
//        System.out.println(ts.add(666));
//        System.out.println(ts.contains(20));
//        System.out.println(ts.contains(564));
//        System.out.println(ts);

        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()) {
            System.out.print(it.next()+" ");
        }

        //Tree -> self balanced trees
        // Searching -> logn, insertion -> logn
        // order: sorted order
    }
}
