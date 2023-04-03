import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MaximumDifferenceArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int maxRight[] = new int[n];
        maxRight[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i + 1], arr[i]);
        }
        // System.out.println(Arrays.toString(maxRight));

        int minLeft[] = new int[n];
        minLeft[0] = arr[0];
        for (int i = 1; i < n; i++) {
            minLeft[i] = Math.min(minLeft[i - 1], arr[i]);
        }

        // System.out.println(Arrays.toString(minLeft));
        int i = 0, j = 0;
        int maxDiff = -1;
        while (i < n && j < n) {
            if (minLeft[i] < maxRight[j]) {
                int diff = j - i;
                if (maxDiff < diff) {
                    maxDiff = diff;
                }
                j++;
            } else {
                i++;
            }
        }
        System.out.println(maxDiff);
    }
}