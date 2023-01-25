package revision_dsa1;

public class BinarySearch {
    static int binarySearchNum(int arr[], int target) {
        int ans = -1;
        int n = arr.length;
        int start = 0, end = n - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                ans = mid;
                break;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
//        int arr[] = {10, 8, 6, 4, 2};
        System.out.println(binarySearchNum(arr, 4));
    }
}
