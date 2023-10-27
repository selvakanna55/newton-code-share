package searching;

// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
class FirstAndLastIndexBinarySearch {
    public int[] searchRange(int[] nums, int target) {
        //    int start = -1, end = -1;
        int start = startSearch(nums, target);
        int end = endSearch(nums, target);
        int arr[] = {start, end};
        return arr;
    }

    int startSearch(int nums[], int target) {
        int left = 0, right = nums.length - 1;
        int ans = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                ans = mid;
                // break; // dint stop
                right = mid - 1; // find more elements in left side
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    int endSearch(int nums[], int target) {
        int left = 0, right = nums.length - 1;
        int ans = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                ans = mid;
                left = mid + 1; // find more values on the right side
                // break; // dint stop
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}