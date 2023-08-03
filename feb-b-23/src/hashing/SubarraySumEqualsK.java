package hashing;


import java.util.HashMap;

// https://leetcode.com/problems/subarray-sum-equals-k/description/

// other questions:
// https://www.geeksforgeeks.org/longest-sub-array-sum-k/
// https://www.geeksforgeeks.org/count-subarrays-equal-number-1s-0s/
// count total no of sub array with 0 sum

class SubarraySumEqualsK {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int n = nums.length;
        HashMap<Long, Integer> hm = new HashMap<>();
        long sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
            if (sum == k) count++;
            if (hm.containsKey(sum - k)) {
                count = count + hm.get(sum - k);
            }
            // count frequ of sum
            if (hm.containsKey(sum)) {
                hm.put(sum, hm.get(sum) + 1);
            } else {
                hm.put(sum, 1);
            }
        }
        return count;
    }
}