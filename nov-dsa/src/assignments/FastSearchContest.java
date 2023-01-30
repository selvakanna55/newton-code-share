package assignments;

import java.util.Arrays;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class FastSearchContest {
    static int findLeft(int arr[], int target) {
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    static int findRight(int arr[], int target) {
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int q = sc.nextInt();
        while (q-- > 0) {
            int left = sc.nextInt();
            int right = sc.nextInt();
            left--;
            right++;
            int leftIdx = findLeft(arr, left);
            int rightIdx = findRight(arr, right);
            System.out.print((rightIdx - leftIdx - 1) + " ");
        }
    }
}