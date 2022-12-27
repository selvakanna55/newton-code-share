package oct_meta;

import java.util.HashSet;

public class FindMaxUniq {
    public static void main(String[] args) {
        // increase uniq element in arr1, by swaping with arr2
        int arr1[] = {1, 2, 3, 2, 3, 7, 7}; //
        int arr2[] = {8, 9, 8, 9, 7};
        int n1 = arr1.length;
        int n2 = arr2.length;

        HashSet<Integer> hs1 = new HashSet<>(); // unqi
        for (int i = 0; i < n1; i++) {
            hs1.add(arr1[i]);
        }
        int nonUniq = n1 - hs1.size(); // 2 3 7 // 3 -> already 4 uniq
        HashSet<Integer> hs2 = new HashSet<>();
        for (int i = 0; i < n2; i++) {
            hs2.add(arr2[i]);
        }
        hs2.removeAll(hs1); // b - (a^b)
        int uniqNotPresentInArr1 = hs2.size();
        int swap = Math.min(uniqNotPresentInArr1, nonUniq);
        System.out.println(swap + hs1.size());
    }
}
