package hashing;


import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;


public class HashMapExample {
    static void simpleHashMap() {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Tarun");
        hm.put(2, "Varun");
        hm.put(3, "Ashok");
        hm.put(4, "Nikunj");
        hm.put(5, "Ayush");
        System.out.println(hm);
        System.out.println("student name with rollNo 2" + hm.get(2));
        hm.put(1, "Shubham");
        System.out.println("rollNo 14 is present or not? " + hm.containsKey(14));
        // System.out.println(hm);
    }    // Newton School Online Java compiler to run Java online.

    // Write Java code in this online editor and run it.
    public static void main(String[] args) {
        LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
        int arr[] = {1, 2, 3, 4, 1, 2, 3, 2, 4, 2};
        for (int i = 0; i < arr.length; i++) {
            //    if(hm.containsKey(arr[i])){
            //        int prevCount = hm.get(arr[i]);
            //        hm.put(arr[i], prevCount+1);
            //    }else{
            //        hm.put(arr[i], 1);
            //    }
            hm.put(arr[i], hm.getOrDefault(arr[i], 0) + 1);
        }
        hm.keySet();
        hm.clear();
        hm.containsValue(10);
//        hm.remove();
        if (!hm.containsKey(10)) {
            hm.put(10, 14);
        }
        hm.putIfAbsent(10, 14);
        System.out.println(hm);
        //    System.out.println(hm.keySet());
        //    System.out.println(hm.values());

        for (int key : hm.keySet()) {
            //                  key -> value
            System.out.println(key + " -> " + hm.get(key));
        }
    }
}