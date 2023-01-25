package revision_dsa1;


class JumpGame {
    public boolean canJump(int[] nums) {
        int maxReach = 0;
        boolean ans = true;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (i > maxReach) {
                ans = false;
                break;
            }
            int currReach = i + nums[i];
            if (maxReach < currReach) {
                maxReach = currReach;
            }
        }
        return ans;
    }
}