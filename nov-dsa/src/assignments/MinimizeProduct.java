package assignments;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MinimizeProduct {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr1[] = new int[n];
        int arr2[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = scan.nextInt();
        }

        for (int i = 0; i < n; i++) {
            arr2[i] = scan.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + (arr1[i] * arr2[n - i - 1]);
        }
        System.out.println(sum);

    }
}
