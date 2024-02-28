package recursion;
// https://my.newtonschool.co/playground/code/yvfcl3r8enng?lecture_hash=hq9o5ugbekwr

import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class InsertOperator {
    static boolean canReachK(int idx, long sum, long arr[], long k) {
        if (idx == arr.length) {
            return sum == k;
        }
        return canReachK(idx + 1, sum + arr[idx], arr, k) || canReachK(idx + 1, sum - arr[idx], arr, k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        if (canReachK(1, arr[0], arr, k)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
