package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework


// you can add inner classes if needed
class LeastSubarrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = Integer.parseInt(scan.nextLine());
        String[] nums;
        while (t-- > 0) {
            nums = scan.nextLine().split(" ");
            int n = Integer.parseInt(nums[0]);
            int m = Integer.parseInt(nums[1]);

            nums = scan.nextLine().split(" ");
            int[] arr1 = new int[n];
            for (int i = 0; i < n; i++) {
                arr1[i] = Integer.parseInt(nums[i]);
            }

            nums = scan.nextLine().split(" ");
            int[] arr2 = new int[m];
            for (int i = 0; i < m; i++) {
                arr2[i] = Integer.parseInt(nums[i]);
            }

            long s = Long.parseLong(scan.nextLine());
            int len = Math.min(n, m);
            int ans = -1;
            int l = 0, r = len;
            while (l <= r) {
                // for(int k=1;k<=len;k++){
                int k = (l + r) / 2;
                long sum1 = 0, sum = 0;
                for (int j = 0; j < n; j++) {
                    sum = sum + arr1[j];
                    if (j >= k) sum = sum - arr1[j - k];
                    sum1 = Math.max(sum1, sum);
                }
                sum = 0;
                long sum2 = 0;
                for (int j = 0; j < m; j++) {
                    sum = sum + arr2[j];
                    if (j >= k) sum = sum - arr2[j - k];
                    sum2 = Math.max(sum2, sum);
                }
                if (sum1 * sum2 >= s) {
                    ans = k;
                    r = k - 1;
                } else {
                    l = k + 1;
                }
            }

            System.out.println(ans);
        }
    }
}

