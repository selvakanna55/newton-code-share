public class SearchingAnElementInASortedArray {
    static int isPresent(long arr[], int n, long k) {
        // Your code here
        int start = 0;
        int end = n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            if (arr[mid] == k) {
                return 1;
            } else if (arr[mid] < k) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
