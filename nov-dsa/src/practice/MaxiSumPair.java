package practice;

import java.util.Arrays;
import java.util.Scanner;

public class MaxiSumPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(arr[n - 1] * arr[n - 2]);
        /* maximum pair product
            10, 9, -8, 6, 14
            140 -> 10*14

            10,9,2,4,6
            // 90 -> 10*9

        */

    }
}
