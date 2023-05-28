package hashing;


import java.util.*;

class NumberFrequencies {
    public static void main(String args[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int arr[] = {12, 9, 10, 19, 19, 23, 12, 9, 12, 6, 10, 12};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(arr[i])) {
                int count = hm.get(arr[i]); // get value (get occurances)
                hm.put(arr[i], count + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        System.out.println(hm);
        System.out.println(hm.keySet());
        System.out.println(hm.values());
    }
}