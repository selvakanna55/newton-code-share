package searching;

public class BinarySearch {
    public static int binarySearch(int arr[], int target) {
        int left = 0, right = arr.length - 1, ans = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                ans = mid;
                break;
            }
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        //   0, 1, 2, 3, 4, 5, 6, 7
        int arr[] = {10, 12, 14, 18, 20, 21, 23};
        System.out.println(binarySearch(arr, 20));
        System.out.println(binarySearch(arr, 14));
        System.out.println(binarySearch(arr, 22));
    }
}
