package bit_manipulation;

// https://leetcode.com/problems/single-number/description/
class SingleNumber {
    public int singleNumber(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }
}