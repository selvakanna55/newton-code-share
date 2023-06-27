package dsa2_revision;

import java.util.HashMap;

// https://leetcode.com/problems/subarray-sum-equals-k/
public class SubarraySumEqualsK {
    // [10,5,2,7,1,9,3,2] k = 15, ans = 3

    public int subarraySum(int[] num, int k) {
        HashMap<Long, Integer> hm = new HashMap<>();
        long sum = 0;
        int ans = 0;
        int n = num.length;
        for (int i = 0; i < n; i++) {
            sum = sum + num[i];
            if (sum == k) ans++;

            if (hm.containsKey(sum - k)) {
                ans = ans + hm.get(sum - k);
            }
            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        }
        return ans;
    }


}
