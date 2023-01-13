package assignments;

import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class InsertOperator {
    static boolean canReachTarget(long sum, int idx, long k, long arr[]) {
        if (idx == arr.length) {
            if (sum == k) return true;
            else return false;
        }
        if (canReachTarget(sum + arr[idx], idx + 1, k, arr)) return true;
        if (canReachTarget(sum - arr[idx], idx + 1, k, arr)) return true;
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
        if (canReachTarget(arr[0], 1, k, arr) == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}