package bit_manipulation;

public class MissingNumber {

    public int missingNumber(int[] nums) {
        // same -> 0
        // diff -> 1
        int n = nums.length;
        // sum of N natual nums
        long sum = 0;
        for (int i = 0; i <= n; i++) {
            System.out.println(sum + "^" + i + "=" + (sum ^ i));
            sum = sum ^ i;
        }

        System.out.println(10 ^ 10);
        System.out.println("------------");
        for (int i = 0; i < n; i++) {
            System.out.println(sum + "^" + i + "=" + (sum ^ i));
            sum = sum ^ nums[i];
        }

        return (int) sum;
    }
}