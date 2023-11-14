package dsa1_recap_quetions_;


// https://leetcode.com/problems/3sum/

import java.util.*;


class ThreeSumLeetCode {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int index = 0; index < n; index++) {
            if (index > 0 && nums[index] == nums[index - 1]) {
                continue;
            }
            int target = -nums[index];
            int i = index + 1, j = n - 1;
            while (i < j) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    ArrayList<Integer> li = new ArrayList<>();
                    li.add(nums[index]);
                    li.add(nums[i]);
                    li.add(nums[j]);
                    result.add(li);
                    i++;
                    j--;
                    while (i < j && nums[i] == nums[i - 1]) {
                        i++;
                    }
                    while (i < j && nums[j] == nums[j + 1]) {
                        j--;
                    }
                } else if (sum > target) {
                    j--;
                } else {
                    i++;
                }
            }
        }
        return result;
    }
}