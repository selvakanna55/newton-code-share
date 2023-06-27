package dsa2_revision;

import java.util.*;


class HashingRevision {
    public static void setExample() {
        // HashSet<Integer> hs = new HashSet<>();
        // TreeSet<Integer> hs = new TreeSet<>();
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        hs.add(10);
        hs.add(20);
        hs.add(10);
        for (int num : hs) {
            System.out.println(num);
        }
        System.out.println(hs.contains(20)); // true
        System.out.println(hs.contains(99)); //false
        System.out.println(hs);
    }

    public static void main(String args[]) {
        // HashMap<Integer, Integer> hm = new HashMap<>();
        TreeMap<Integer, Integer> hm = new TreeMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (hm.containsKey(num)) {
                int freq = hm.get(num); // 1
                hm.put(num, freq + 1);
            } else {
                hm.put(num, 1);
            }
        }
        // System.out.println(hm);
        // System.out.println(hm.keySet()); // all uniq keys
        for (Integer key : hm.keySet()) {
            System.out.println(key + " " + hm.get(key));
        }
    }
}


/*
Set -> unique values
[10, 12, 13, 12, 19, 14, 14]

HashSet => [10,12,19,13,14] -> any order -> O(1) -> hashing
TreeSet => [10,12,13,14,19] -> sorted -> O(logn) -> tree
LinkedHashSet => [10,12,13,19,14] -> inserted order -> Linkedlist -> O(N)

Map -> {1: {'name':'a', 'age': 40}, 2:{}}
key value pairs
key - rollNo
value - student info


HashMap -> any order -> O(1) -> hashing
TreeMap -> sorted -> O(logn) -> tree
LinkedHashMap -> inserted order -> Linkedlist -> O(N)



print numbers and its frequencies sort by number ascending order

input:
9
10 12 13 12 19 14 14 14 19

output:
10 -> 1
14 -> 3
12 -> 2
13 -> 1
19 -> 2



*/




//  9
//  10 12 13 12 19 14 14 14 19