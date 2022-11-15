package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();


        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int primary = 0;
        for (int i = 0; i < n; i++) {
            primary = primary + arr[i][i];
        }

        int secondary = 0;
        for (int i = 0; i < n; i++) {
            secondary = secondary + arr[i][n - i - 1];
        }
        System.out.println(primary + " " + secondary);

    }
}
