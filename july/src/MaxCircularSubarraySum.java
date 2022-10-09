import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class MaxCircularSubarraySum {
    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        int t = Integer.parseInt(r.nextLine());
        for (int j = 1; j <= t; j++) {
            int n = Integer.parseInt(r.nextLine());
            String nums[] = r.nextLine().split(" ");
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(nums[i]);
            }
            System.out.println(maxsubarraysum(arr, n));
        }
    }

    static long maxsubarraysum(int[] arr, int n) {
        //edge case
        if (n == 1) return arr[0];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        long current_sum = arr[0];
        long max_so_far = arr[0];
        long min_sum = arr[0];
        long min_so_far = arr[0];

        for (int i = 1; i < n; i++) {
            current_sum = Math.max(current_sum + arr[i], arr[i]);
            max_so_far = Math.max(current_sum, max_so_far);
            min_sum = Math.min(min_sum + arr[i], arr[i]);
            min_so_far = Math.min(min_so_far, min_sum);
        }
//all nos are negative in this case
        if (min_so_far == sum) {
            return max_so_far;


        }
        return Math.max(max_so_far, sum - min_so_far);
    }
}