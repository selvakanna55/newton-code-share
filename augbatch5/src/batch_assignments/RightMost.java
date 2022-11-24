package batch_assignments;


import java.util.Arrays;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class RightMost {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][2];
        int ans[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = i;
            ans[i] = i;
        }

        Arrays.sort(arr, (a, b) -> a[0] - b[0]);

        int maxi = 0;
        for (int i = n - 1; i >= 0; i--) {
            maxi = Math.max(maxi, arr[i][1]);
            ans[arr[i][1]] = maxi;
        }

        for (int i = 0; i < n; i++) {
            System.out.print((ans[i] + 1) + " ");
        }


    }
}
