package batch_assignments;


import java.util.Arrays;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class KthSmallestDifference {
    static int possiblePairWithDiff(int[] arr, int diff) {
        int count = 0;
        int n = arr.length;
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i] + diff;
            if (arr[i] + diff > arr[n - 1]) {
                count = count + (n - (i + 1));
            } else {
                count = count + upperbound(arr, arr[i] + diff) - (i + 1);
            }
        }
        return count;
    }

    static int upperbound(int[] arr, int val) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = (l + r) / 2;
            if (val >= arr[mid]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] nums = sc.nextLine().split(" ");
            int n = Integer.parseInt(nums[0]);
            int k = Integer.parseInt(nums[1]);
            int[] arr = new int[n];
            nums = sc.nextLine().split(" ");
            for (int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(nums[i]);
            Arrays.sort(arr);

            int low = arr[1] - arr[0];
            for (int i = 1; i < n - 1; i++) {
                low = Math.min(low, arr[i + 1] - arr[i]);
            }
            int high = arr[n - 1] - arr[0];


            while (low < high) {
                int mid = (low + high) / 2;
                int pair = possiblePairWithDiff(arr, mid);
                if (pair < k) {
                    low = mid + 1;
                } else {
                    high = mid;
                }
            }
            System.out.println(low);
        }

    }
}