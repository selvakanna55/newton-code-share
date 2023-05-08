package arrays;

//https://leetcode.com/problems/sort-colors/description/
class SortColors {
    public void sortColors(int[] nums) {
        int zeros = 0, ones = 0, twos = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) zeros++;
            else if (nums[i] == 1) ones++;
            else if (nums[i] == 2) twos++;
        }

        int idx = 0;
        for (int i = 0; i < zeros; i++) {
            nums[idx] = 0;
            idx++;
        }

        for (int i = 0; i < ones; i++) {
            nums[idx] = 1;
            idx++;
        }

        for (int i = 0; i < twos; i++) {
            nums[idx] = 2;
            idx++;
        }

    }
}