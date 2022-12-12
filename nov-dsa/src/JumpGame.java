class JumpGame {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        boolean ans = true;
        int maxi = 0;
        for (int i = 0; i < n - 1; i++) {
            int curr = i + nums[i];
            if (curr > maxi) {
                maxi = curr;
            }
            if (i == maxi) {
                ans = false;
                break;
            }
        }
        return ans;
    }
}