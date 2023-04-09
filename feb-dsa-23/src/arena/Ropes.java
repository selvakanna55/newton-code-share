package arena;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Ropes {
    // can we make k pieces of length len
    public static boolean canGetKPieces(double arr[], int k, double len) {
        long totalNoPieces = 0;
        for (int i = 0; i < arr.length; i++) {
            totalNoPieces = totalNoPieces + (int) (arr[i] / len);
            if (totalNoPieces >= k) return true;
        }
        if (totalNoPieces >= k) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        double arr[] = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }

        double left = 0;
        double right = 1000000000;
        double ans = 0;
        while ((right - left) > 0.000001) { // l<=r
            double mid = left + (right - left) / 2;
            if (canGetKPieces(arr, k, mid)) {
                ans = mid;
                left = mid;
            } else {
                right = mid;
            }
        }
        System.out.printf("%.6f\n", ans);
    }
}
//802+743+457+539