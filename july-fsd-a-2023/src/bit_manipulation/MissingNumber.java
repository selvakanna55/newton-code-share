package bit_manipulation;


class MissingNumber {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int xorVal = 0;
        for (int i = 0; i <= n; i++) {
            xorVal = xorVal ^ i;
        }

        for (int i = 0; i < n; i++) {
            xorVal = xorVal ^ nums[i];
        }
        // from 0 to n -> all numbers are preset in array.expect one number
        return xorVal;
    }
}