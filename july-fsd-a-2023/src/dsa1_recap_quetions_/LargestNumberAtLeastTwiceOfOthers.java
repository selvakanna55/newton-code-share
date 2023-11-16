package dsa1_recap_quetions_;


class LargestNumberAtLeastTwiceOfOthers {
    public int dominantIndex(int[] nums) {
//        return solution1(nums);
        return solution2(nums);
    }

    int solution1(int nums[]) {
        // TC: O(n), SC: O(1)
        int maxiIndex = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[maxiIndex]) {
                maxiIndex = i;
            }
        }
        int ans = maxiIndex;
        for (int i = 0; i < n; i++) {
            if (i != maxiIndex && nums[i] * 2 > nums[maxiIndex]) {
                ans = -1;
                break;
            }
        }
        return ans;
    }

    int solution2(int nums[]) {
        int maxiIndex = 0;
        int secondMaximumIndex = -1;
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[maxiIndex]) {
                secondMaximumIndex = maxiIndex;
                maxiIndex = i;
            } else if (secondMaximumIndex == -1 || nums[i] > nums[secondMaximumIndex]) {
                secondMaximumIndex = i;
            }
        }

        int ans = maxiIndex;
        if (nums[secondMaximumIndex] * 2 > nums[maxiIndex]) {
            ans = -1;
        }

        return ans;
    }

}
