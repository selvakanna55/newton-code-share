package assignments;

public class SmallerElements {
    static int smallerElements(int arr[], int n, int k) {
        int ans = 0;
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= k) {
                ans = mid + 1;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
