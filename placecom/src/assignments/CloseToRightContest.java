package assignments;

import java.util.Scanner;

class CloseToRightContest {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        int q = inp.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = inp.nextInt();
        }

        while (q-- > 0) {
            int x = inp.nextInt();
            int l = 0, r = n - 1;
            while (l <= r) {
                int mid = l + (r - l) / 2;
                if (arr[mid] <= x) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            }
            System.out.println(l);
        }
    }
}