package assignments;


import java.util.Arrays;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class CheckIfNAnd2NExists {
    public static int linearSearch(int arr[], int number) {
        // T: O(n)
        // S: O(1)
        int ans = -1; // not found
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                ans = i;
                break;
            }
        }
        return ans;
    }

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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr); // nlogn
        boolean found = false;

        for (int i = 0; i < n; i++) {
            int val = 2 * arr[i];
            if (binarySearch(arr, val) != -1) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

// N^2