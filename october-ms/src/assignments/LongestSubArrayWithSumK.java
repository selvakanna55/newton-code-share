package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class LongestSubArrayWithSumK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = Integer.parseInt(sc.nextLine());
        while (tc-- > 0) {
            String nums[] = sc.nextLine().split(" ");
            int n = Integer.parseInt(nums[0]);
            int k = Integer.parseInt(nums[1]);
            long sum = 0;
            int arr[] = new int[n];
            nums = sc.nextLine().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(nums[i]);
            }

            HashMap<Long, Integer> hm = new HashMap<>();
            int ans = 0;
            for (int i = 0; i < n; i++) {
                sum = sum + arr[i];
                if (sum == k) {
                    ans = i + 1; //0 based index
                }
                if (hm.containsKey(sum - k)) {
                    int len = i - hm.get(sum - k);
                    ans = Math.max(ans, len);
                }
                if (!hm.containsKey(sum)) { // do only when sum is not in present in hashmap
                    hm.put(sum, i);
                }
            }
            System.out.println(ans);
        }
    }
}