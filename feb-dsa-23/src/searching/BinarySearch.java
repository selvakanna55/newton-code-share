package searching;

public class BinarySearch {
    public static int find(int arr[], int target) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) { //left
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {10, 12, 14, 16, 18, 28}; //ascending
        int ans = find(arr, 18);
        System.out.println(ans);

    }
}
