package queue;


class MaximumSubarray {
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum = currSum + nums[i];
            if (maxSum < currSum) {
                maxSum = currSum;
            }
            if (currSum < 0) {
                currSum = 0; // from next element new sub array begins
            }
        }
        return maxSum;
    }
}