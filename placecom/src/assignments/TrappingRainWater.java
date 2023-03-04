package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class TrappingRainWater {
    public static long trap(long[] height) {
        int n = height.length;
        long leftMax[] = new long[n];
        long rightMax[] = new long[n];
        leftMax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        // System.out.println(Arrays.toString(leftMax));
        rightMax[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        // System.out.println(Arrays.toString(rightMax));

        long ans = 0;
        for (int i = 0; i < n; i++) {
            ans += Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return ans;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(read.readLine());
        long arr[] = new long[n];
        String nums[] = read.readLine().split(" ");
        for (int i = 0; i < n; i++)
            arr[i] = Long.parseLong(nums[i]);
        long result = trap(arr);
        System.out.println(result);
    }
}