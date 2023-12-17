package java_collections;


import java.util.HashSet;

// https://static.javatpoint.com/images/java-collection-hierarchy.png
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExample {
    // Newton School Online Java compiler to run Java online.
    // Write Java code in this online editor and run it.
    public static void main(String[] args) {
//        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
//        HashSet<Integer> hs = new HashSet<>();
        TreeSet<Integer> hs = new TreeSet<>();
        hs.add(30);
        hs.add(10);
        hs.add(20);
        System.out.println(hs);
        hs.add(40);
        System.out.println(hs);
        hs.remove(20);
        System.out.println(hs);
        System.out.println(hs.size());
        System.out.println(hs.contains(10)); //true
    }
}