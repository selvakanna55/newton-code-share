package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class InsertOperator {
    static boolean canReachK(long sum, int i, long arr[], long k) {
        if (i < arr.length) {
            boolean add = canReachK(sum + arr[i], i + 1, arr, k);
            boolean sub = canReachK(sum - arr[i], i + 1, arr, k);
            return sub || add;
        }
        return sum == k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        if (canReachK(arr[0], 1, arr, k)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
