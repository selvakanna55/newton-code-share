package assignments;


import java.util.Arrays;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class WaveArray {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long arr[] = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextLong();
        }
        Arrays.sort(arr);
        for (int i = 0; i < n; i++) {
            if (i + 1 < n) {
                System.out.print(arr[i + 1] + " ");
            }
            System.out.print(arr[i] + " ");
            i++;
        }
    }
}