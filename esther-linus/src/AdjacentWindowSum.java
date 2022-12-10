

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class AdjacentWindowSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long sum = sc.nextLong();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean ans = false;
        long left = 0;
        for (int i = 0; i < k; i++) {
            left = left + arr[i];
        }

        for (int i = k; i < n; i++) {
            long right = left - arr[i - k] + arr[i];
            if (left + right == sum) {
                ans = true;
                break;
            }
            left = right;
        }
        if (ans) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}