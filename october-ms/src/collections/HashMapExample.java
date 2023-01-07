package collections;

import java.util.*;

public class HashMapExample {
    static void printFreq(int arr[]) {
        int freq[] = new int[100];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }
        for (int i = 0; i < 100; i++) {
            if (freq[i] > 0) {
                System.out.println(i + " " + freq[i]);
            }
        }
    }

    static void printFreqHashMapNumber() {
        int arr[] = {10, 20, 11, 20, 11, 44, 11, 10};
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (freq.containsKey(arr[i])) {
                int count = freq.get(arr[i]);
                freq.put(arr[i], count + 1);
            } else {
                freq.put(arr[i], 1);
            }
        }
        for (Integer num : freq.keySet()) {
            System.out.println(num + " " + freq.get(num));
        }

//        System.out.println(freq.get(10)); // no of occurrences of  10 (return value)
//        System.out.println(freq.keySet()); // all keys
//        Iterator<Integer> it = freq.keySet().iterator();
//        while (it.hasNext()) {
//            System.out.print(it.next() + " ");
//        }
//        System.out.println();


//        double arr2[] = {1.9, 2.5, 9.8};
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }
//        System.out.println();
//        for (double i : arr2) {
//            System.out.print(i + " ");
//        }
    }

    public static void main(String[] args) {
        double nums[] = {3.3, 1.1, 2.2, 3.3, 1.1, 2.2, 9.1};
        LinkedHashMap<Double, Integer> freq = new LinkedHashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (freq.containsKey(nums[i])) {
                int count = freq.get(nums[i]);
                freq.put(nums[i], count + 1);
            } else {
                freq.put(nums[i], 1);
            }
        }
        System.out.println(freq);
        for (Double num : freq.keySet()) {
            System.out.println(num + " " + freq.get(num));
        }

    }
}
