package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class SimpleDeterminant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 2;
        int arr[][] = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int upper = arr[0][0] * arr[1][1];
        int lower = arr[0][1] * arr[1][0];
        System.out.println(upper - lower);
    }
}