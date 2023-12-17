package java_collections;

import java.util.HashSet;

//https://leetcode.com/problems/single-number/description/
public class SingleNumberWithSet {


    public int singleNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (hs.contains(nums[i])) {
                hs.remove(nums[i]);
            } else {
                hs.add(nums[i]);
            }
        }
        int ans = -1;
        for (int num : hs) {
            ans = num;
            break;
        }
        return ans;
    }
}