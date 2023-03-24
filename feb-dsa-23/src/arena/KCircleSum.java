package arena;

public class KCircleSum {
    static void kCircleSum(int arr[], int n, int k) {
        long sum = 0;
        // add first k elements
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(sum + " ");
            sum = sum - arr[i] + arr[(i + k) % n];
        }
    }
}
