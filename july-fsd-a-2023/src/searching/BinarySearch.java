package searching;

// https://learn.newtonschool.co/visuals/binary_search/0
public class BinarySearch {
    public static int binarySearch(int arr[], int target) {
        // array must be sorted for binarySearch
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int ans = -1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) { // is target is found?
                ans = mid;
                break;
            } else if (target < arr[mid]) { // target can be on left side
                right = mid - 1;
            } else {
                left = mid + 1; //  target can  be on right side
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {11, 12, 16, 18, 22, 24, 26, 29, 31};
        System.out.println(binarySearch(arr, 31)); // 1
        System.out.println(binarySearch(arr, 29)); // 7
        System.out.println(binarySearch(arr, 27)); // -1
    }
}
