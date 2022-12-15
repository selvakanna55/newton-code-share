package assignments;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class FindAPairWithTheGivenSumInAnArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        long arr[] = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextLong();
        }
        long target = scan.nextLong();
        Arrays.sort(arr);
        int i = 0;
        int j = n - 1;
        boolean found = false;
        while (i < j) {
            long sum = arr[i] + arr[j];
            if (sum == target) {
                System.out.println("Pair found (" + arr[j] + ", " + arr[i] + ") ");
                found = true;
                break;
            } else if (sum > target) {
                j--;
            } else {
                i++;
            }
        }
        if (!found) {
            System.out.println("Pair not found");
        }
    }
}