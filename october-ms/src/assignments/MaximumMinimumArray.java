package assignments;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MaximumMinimumArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        for (int prob = 1; prob <= testcase; prob++) { //n*(3n) -> 3n^2 -> n^2
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int minimum = arr[0];
            for (int i = 0; i < n; i++) {
                if (minimum > arr[i]) {
                    minimum = arr[i];
                }
            }
            int maximum = arr[0];
            for (int i = 1; i < n; i++) {
                if (maximum < arr[i]) {
                    maximum = arr[i];
                }
            }
            System.out.println(maximum + " " + minimum);
        }
    }
}
