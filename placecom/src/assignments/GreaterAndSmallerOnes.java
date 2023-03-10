package assignments;


import java.util.Arrays;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class GreaterAndSmallerOnes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] arr = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            printArray(arr, n, k);
        }
    }

    public static void printArray(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int c = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= k) {
                System.out.print(arr[i] + " ");
                c++;
            }
        }
        if (c == 0) System.out.print(-1);
        System.out.println();
        if (c == n) System.out.print(-1);
        else for (int i = 0; i < n - c; i++) System.out.print(arr[i] + " ");
        System.out.println();
    }
}