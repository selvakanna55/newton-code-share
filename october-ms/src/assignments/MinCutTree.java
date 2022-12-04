package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MinCutTree {
    public static long getPieces(int arr[], int height, int n) {
        long pieces = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > height) { // 2>4
                pieces = pieces + arr[i] - height;
            }
        }
        return pieces;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int ans = Integer.MAX_VALUE;
        int left = 1;
        int right = n;
        while (left <= right) {
            int mid = (left + right) / 2;
            long pieces = getPieces(arr, mid, n);
            System.out.println(mid + " " + pieces);
            if (pieces <= k) {
                if (ans > mid) {
                    ans = mid;
                }
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println(ans);
    }
}