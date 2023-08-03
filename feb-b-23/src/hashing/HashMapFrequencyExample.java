package hashing;


import java.util.HashMap;

class HashMapFrequencyExample {
    public static void main(String args[]) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int arr[] = {1, 1, 1, 2, 2, 3, 3, 3, 3};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        System.out.println(hm);
    }
}