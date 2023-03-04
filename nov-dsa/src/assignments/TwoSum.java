package assignments;

import java.util.*;

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int res[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            int y = target - x;
            if (hm.containsKey(y)) {
                res[0] = hm.get(y);
                res[1] = i;
                break;
            }
            hm.put(nums[i], i);
        }

        return res;
    }
}