import java.util.Arrays;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Arrays.sort(nums); // [3 2 1] -> [1 2 3]
        int res[] = new int[2];
        boolean found = false;
        int n = nums.length;
        int i = 0;
        int j = n - 1;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum == target) {
                res[0] = i;
                res[1] = j;
                break;
            }
            if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return res;
    }
}

