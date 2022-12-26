package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class TriangularMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int upper = 0;
        for (int row = 0; row < n; row++) {
            for (int col = row; col < n; col++) {
                upper = upper + a[row][col];
            }
        }

        int lower = 0;
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                lower = lower + a[row][col];
            }
        }

        System.out.println(upper + " " + lower);


    }
}