package assignments;

public class KCircleSum {
    static void kCircleSum(int arr[], int n, int k) {
        long sum = 0;
        for (int j = 0; j < k; j++) {
            sum += arr[j];
        }
        int j = k;
        for (int i = 0; i < n; i++) {
            System.out.print(sum + " ");
            sum = sum - arr[i % n];
            sum = sum + arr[j % n];
            j++;
        }
    }
}
