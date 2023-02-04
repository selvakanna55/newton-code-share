package queue;


class RangeSumQueryImmutable {
    int sumArray[];

    public RangeSumQueryImmutable(int[] nums) {
        int n = nums.length;
        sumArray = new int[n + 1];
        for (int i = 0; i < n; i++) {
            sumArray[i + 1] = sumArray[i] + nums[i];
        }
    }

    public int sumRange(int left, int right) {//1->O(1), K-> O(K)
        return sumArray[right + 1] - sumArray[left];
    }
}