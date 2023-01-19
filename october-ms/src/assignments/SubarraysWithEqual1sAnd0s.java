package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class SubarraysWithEqual1sAnd0s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nums[] = sc.nextLine().split(" ");
        int n = Integer.parseInt(nums[0]);
        int k = 0;
        long sum = 0;
        int arr[] = new int[n];
        nums = sc.nextLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(nums[i]);
            if (arr[i] == 0) arr[i] = -1;
        }

        HashMap<Long, Long> hm = new HashMap<>();
        long ans = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            if (sum == 0) {
                ans++; //0 based index
            }
            if (hm.containsKey(sum)) {
                long count = hm.get(sum);
                ans = ans + count;
                hm.put(sum, count + 1);
            } else {
                hm.put(sum, 1L);
            }
        }
        System.out.println(ans);
    }
}

// T: O(n)
//S: O(n)
// 3.4f -> 4L