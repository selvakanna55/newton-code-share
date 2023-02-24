package assignments;

import java.util.Scanner;

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
        int ans = n;
        int left = 0, right = n;
        while (left <= right) {
            int cut = (left + right) / 2; //mid
            long pieces = getPieces(arr, cut, n);
            System.out.println(cut + " " + pieces);
            if (pieces <= k) {
                ans = Math.min(ans, cut);
                right = cut - 1;
            } else {
                left = cut + 1;
            }
        }
        System.out.println(ans);
    }
}