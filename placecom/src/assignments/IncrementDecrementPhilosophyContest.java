package assignments;


import java.util.Arrays;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class IncrementDecrementPhilosophyContest {
    public static void main(String[] args) {
        // Your code hereqwwww77
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        n--;
        int[] arr = new int[n];
        int max = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = (max + arr[i] + 1) / 2;
            }
        }
        System.out.println(max);
    }
}