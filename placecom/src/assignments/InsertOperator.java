package assignments;

import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class InsertOperator {
    static boolean isPossibleToReachK(long arr[], long k, int idx, long sum) {
        if (idx == arr.length) {
            if (sum == k) {
                return true;
            }
            return false;
        }
        if (isPossibleToReachK(arr, k, idx + 1, sum + arr[idx])) {
            return true;
        }
        if (isPossibleToReachK(arr, k, idx + 1, sum - arr[idx])) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        if (isPossibleToReachK(arr, k, 1, arr[0])) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}