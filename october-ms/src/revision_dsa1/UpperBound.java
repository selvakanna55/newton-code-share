package revision_dsa1;

public class UpperBound {
    static int lower_bound(int arr[], int target) {
        int ans = -1;
        int n = arr.length;
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] <= target) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 6, 8, 10};
        int idx = lower_bound(arr, 6);
        System.out.println(idx + " " + arr[idx]);
    }
}
