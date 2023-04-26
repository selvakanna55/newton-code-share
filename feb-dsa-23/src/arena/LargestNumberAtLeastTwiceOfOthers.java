package arena;


class LargestNumberAtLeastTwiceOfOthers {
    public int dominantIndex(int[] nums) {
        int firstMaxIdx, secondMaxIdx;
        // find first max and second max in first elements
        if (nums[0] < nums[1]) {
            firstMaxIdx = 1;
            secondMaxIdx = 0;
        } else {
            firstMaxIdx = 0;
            secondMaxIdx = 1;
        }

        int n = nums.length;
        for (int i = 2; i < n; i++) {
            if (nums[firstMaxIdx] < nums[i]) {
                secondMaxIdx = firstMaxIdx;  // before updating first max, set value of secondmax as firstmax.
                firstMaxIdx = i;
            } else if (nums[secondMaxIdx] < nums[i]) { // what if nums[i] is between secondmax < nums[i]  < firstmax
                secondMaxIdx = i;
            }
        }

        if (nums[secondMaxIdx] * 2 <= nums[firstMaxIdx]) {
            return firstMaxIdx;
        } else {
            return -1;
        }

    }
}

