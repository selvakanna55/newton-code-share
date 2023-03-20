package assignments;

import java.util.HashMap;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class SubarraysWithEqual1sAnd0s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 0) arr[i] = -1;
        }

        // sub array with sum as 0 (k)
        long ans = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            if (sum == 0) {
                ans++;
            }
            if (hm.containsKey(sum)) {
                ans = ans + hm.get(sum);
            }
            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        }
        System.out.println(ans);
    }
}

// change 0 to -1
// problem -> count no of sub array with sum 0