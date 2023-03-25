package arena;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class BuildingEnergy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long expend = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                expend = expend + 2 * (arr[i + 1] - arr[i]);
            } else if (arr[i] > arr[i + 1]) {
                expend = expend + (arr[i] - arr[i + 1]);
            }
        }
        System.out.print(expend);
    }
}