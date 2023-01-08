package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashSetExample {
    public static void main(String[] args) {
        // uniq
        int nums[] = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        // number is present or not?
        System.out.println(set.contains(10)); // contains
        System.out.println(set.contains(4));
        System.out.println(set);

    }
}
