import java.util.Arrays;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class QueryTime {


    static int upperBound(int arr[], int num) {
        int l = 0, r = arr.length - 1;
        int ans = r;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] >= num) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return ans;
    }

    static int lowerBound(int arr[], int num) {
        int l = 0, r = arr.length - 1;
        int ans = 0;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] <= num) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int L, R;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        while (Q-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();
            int lb = upperBound(arr, l);
            int up = lowerBound(arr, r);
            int diff = up - lb;
            System.out.println(diff + 1);
        }
    }
}