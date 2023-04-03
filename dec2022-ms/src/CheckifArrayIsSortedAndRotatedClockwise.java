import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class CheckifArrayIsSortedAndRotatedClockwise {
    public static boolean isIncrase(int arr[], int n) {
        int idx = -1;
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                idx = i;
                break;
            }
        }
        //i is the begining new array
        if (idx == -1) return false;
        for (int i = idx + 1; i < idx + n; i++) {
            if (arr[i] <= arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isDecrese(int arr[], int n) {
        int idx = -1;
        for (int i = 1; i < n; i++) {
            if (arr[i] > arr[i - 1]) {
                idx = i;
                break;
            }
        }
        //i is the begining new array
        if (idx == -1) return false;
        for (int i = idx + 1; i < idx + n; i++) {
            if (arr[i] >= arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testacse = sc.nextInt();
        for (int t = 0; t < testacse; t++) {
            int n = sc.nextInt();
            int arr[] = new int[n * 2];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                arr[n + i] = arr[i];
            }
            if (isIncrase(arr, n) || isDecrese(arr, n)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}