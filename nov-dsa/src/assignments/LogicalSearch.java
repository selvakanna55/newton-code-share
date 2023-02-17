package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class LogicalSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long d = ((arr[n - 1]) - (arr[0])) / n; // to find the diffrence. ((last - first element) / size of the array(n)).
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (mid + 1 < n && arr[mid + 1] - arr[mid] != d) {
                System.out.print(arr[mid + 1] - d);
                break;
            }
            if (mid - 1 >= 0 && arr[mid] - arr[mid - 1] != d) {
                System.out.print(arr[mid - 1] + d);
                break;
            }
            if (arr[mid] - arr[0] != (mid - 0) * d) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        // return -1;
    }
}