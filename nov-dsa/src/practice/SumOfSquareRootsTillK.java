package practice;

import java.util.Arrays;
import java.util.Scanner;

public class SumOfSquareRootsTillK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] < 0) {
                arr[i] = arr[i] * -1;
            }
        }
        Arrays.sort(arr);
        long sum = 0;
        for (int i = n - 1; i >= n - k; i--) {
            sum = sum + (arr[i] * arr[i]);
        }
        System.out.println(sum);

    }
}
