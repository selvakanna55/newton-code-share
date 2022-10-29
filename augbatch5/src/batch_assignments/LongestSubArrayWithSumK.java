package batch_assignments;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class LongestSubArrayWithSumK {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String nums1[] = sc.nextLine().split(" ");
            int n = Integer.parseInt(nums1[0]);
            int k = Integer.parseInt(nums1[1]);
            nums1 = sc.nextLine().split(" ");
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(nums1[i]);
            HashMap<Long, Integer> hm = new HashMap<>();
            long sum = 0;
            int maxiSub = 0;
            for (int i = 0; i < n; i++) {
                sum = sum + arr[i];
                if (sum == k) {
                    maxiSub = i + 1;
                }
                long diff = sum - k;
                if (hm.containsKey(diff)) {
                    int len = i - hm.get(diff);
                    if (len > maxiSub) {
                        maxiSub = len;
                    }
                }
                if (!hm.containsKey(sum)) {
                    hm.put(sum, i);
                }
            }
            System.out.println(maxiSub);
        }
    }
}
