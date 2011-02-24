package binary_search;

// https://my.newtonschool.co/playground/code/2pio0il7zcle
public class BinarySearch {
    static int isPresent(long arr[], int n, long k) {
        int left = 0, right = n - 1, ans = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == k) {
                ans = 1;
                break;
            }
            if (arr[mid] > k) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
        // Your code here
    }
}
