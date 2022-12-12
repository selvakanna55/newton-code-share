package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class MaximumAndMinimumInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int maxi = Integer.MIN_VALUE;
            int mini = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (arr[i] > maxi) {
                    maxi = arr[i];
                }
                if (arr[i] < mini) {
                    mini = arr[i];
                }
            }
            System.out.println(maxi + " " + mini);
        }
    }
}
