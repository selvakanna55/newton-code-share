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

        for (int i = 0; i < n; i++) {
            long sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum >= k) {
                    miniLen = Math.min(miniLen, j - i + 1);
                    break;
                }
            }
        }
        System.out.println(miniLen);
    }
}
