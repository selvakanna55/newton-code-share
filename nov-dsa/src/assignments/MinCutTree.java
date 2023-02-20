package assignments;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MinCutTree {
    static long getPieces(int arr[], int height, int n) {
        long pieces = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > height) {
                pieces = pieces + (arr[i] - height);
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
        int ans = 0;
        for (int cut = 1; cut <= n; cut++) {
            if (getPieces(arr, cut, n) <= k) {
                ans = cut;
                break;
            }
        }
        System.out.println(ans);
    }
}
