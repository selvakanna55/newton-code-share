package batch_assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class SumSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int miniLen = n;

        int j = 0;
        long sum = 0;
        for (int i = 0; i < n; i++) {
            //add
            while (j < n && sum < k) {
                sum = sum + arr[j];
                j++;
            }
            // sum>=k may be
            if (sum >= k) {
                miniLen = Math.min(miniLen, j - i);
            }

            // remove
            sum = sum - arr[i];
        }
        System.out.println(miniLen);
    }
}
