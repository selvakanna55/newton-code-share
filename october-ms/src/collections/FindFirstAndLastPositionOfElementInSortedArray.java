package collections;

import java.util.*;

public class FindFirstAndLastPositionOfElementInSortedArray {
    public int[] searchRange(int[] nums, int target) {
        HashMap<Integer, ArrayList<Integer>> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (hm.containsKey(num)) {
                ArrayList<Integer> li = hm.get(num);
                li.add(i);
                hm.put(num, li);
            } else {
                ArrayList<Integer> li = new ArrayList<>();
                li.add(i);
                hm.put(num, li);
            }
        }
        int res[] = new int[2];
        res[0] = -1;
        res[1] = -1;
        if (hm.containsKey(target)) {
            ArrayList<Integer> li = hm.get(target);
            res[0] = li.get(0);
            res[1] = li.get(li.size() - 1);
        }
        return res;
    }
}