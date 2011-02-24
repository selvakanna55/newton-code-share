package binary_search;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class SearchInRotatedSortedArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextLong();
        }
        long target = scan.nextLong();
        int ans = 0;
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                ans = 1;
                break;
            }
            // find sorted?
            if (arr[left] <= arr[mid]) { //first half sorted
                if (arr[left] <= target && target <= arr[mid]) { // is target is present in left to mid
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } else { //second half is sorted
                if (arr[mid] <= target && target <= arr[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        System.out.println(ans);
    }
}