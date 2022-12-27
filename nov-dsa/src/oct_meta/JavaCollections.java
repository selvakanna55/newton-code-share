package oct_meta;

import java.util.*;

public class JavaCollections {
    static void hashset() {
        Set<Integer> hs = new HashSet<>(); // hashing -> no order -> O(1)
        hs.add(10);
        hs.add(20);
        hs.add(-9);
        hs.add(11);
        System.out.println(hs);
        hs.add(20);
        System.out.println(hs);
        System.out.println(hs.contains(-9));
        System.out.println(hs.contains(29));
    }

    static void treeset() {
        Set<Integer> hs = new TreeSet<>(); // self balanced trees -> sorted order -> O(logn)
        hs.add(10);
        hs.add(20);
        hs.add(-9);
        hs.add(11);
        System.out.println(hs);
        hs.add(-22);
        hs.add(20);
        System.out.println(hs);
        System.out.println(hs.contains(-9));
        System.out.println(hs.contains(29));
    }

    static void linkedhashset() {
        Set<Integer> hs = new LinkedHashSet<>(); // linkedlist -> insert order -> O(n)
        hs.add(10);
        hs.add(20);
        hs.add(-9);
        hs.add(11);
        System.out.println(hs);
        hs.add(-22);
        hs.add(20);
        System.out.println(hs);
        System.out.println(hs.contains(-9));
        System.out.println(hs.contains(29));

    }

    public static void main(String[] args) {
//        ArrayList<Integer> list1 = new ArrayList<>();
//        list1.add(10);
//        list1.add(20);
//        list1.add(30);

//        for (int i = 0; i < list1.size(); i++) {
//            System.out.println(list1.get(i));
//        }

        Set<Integer> hs = new LinkedHashSet<>(); // linkedlist -> insert order -> O(n)
        hs.add(10);
        hs.add(20);
        hs.add(-9);

        Iterator<Integer> it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }


    }
}
