package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class CheckIfArrayIsSortedAndRotatedClockwise {
    static boolean isAsc(int arr[], int n) {
        int idx = 0;
        for (int i = 1; i < n; i++) { // find min element idx
            if (arr[i] < arr[i - 1]) {
                idx = i;
                break;
            }
        }
        if (idx == 0) return false;
        for (int i = idx + 1; i < idx + n; i++) {
            if (arr[i] <= arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    static boolean isDesc(int arr[], int n) {
        int idx = 0;
        for (int i = 1; i < n; i++) { // find max element idx
            if (arr[i] > arr[i - 1]) {
                idx = i;
                break;
            }
        }
        if (idx == 0) return false;
        for (int i = idx + 1; i < idx + n; i++) {
            if (arr[i] >= arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[2 * n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                arr[i + n] = arr[i];
            }
            System.out.println(Arrays.toString(arr));

            if (isAsc(arr, n)) {
                System.out.println("Yes");
            } else if (isDesc(arr, n)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        }
    }
}