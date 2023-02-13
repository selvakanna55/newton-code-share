package assignments;

import java.util.Arrays;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class CandyStoreEarningsContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        long sum = 0;
        int m = 0;
        for (int j = 0; j < n; j++) {
            if (arr[j] <= 0 && m < k) {
                sum += arr[j];
                m++;
            }
        }
        System.out.println(Math.abs(sum));
    }
}