package assignments;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class BoundaryTraversalMatrix {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int rows = sc.nextInt();
            int cols = sc.nextInt();
            int[][] mat = new int[rows][cols];

            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    mat[i][j] = sc.nextInt();
                }
            }

            for (int i = 0; i < cols; i++) { // top row
                System.out.print(mat[0][i] + " ");
            }
            for (int i = 1; i < rows; i++) { // last  col
                System.out.print(mat[i][cols - 1] + " ");
            }
            if (rows != 1) {
                for (int i = cols - 2; i >= 0; i--) { // bottom row
                    System.out.print(mat[rows - 1][i] + " ");
                }
            }
            if (cols != 1) {
                for (int i = rows - 2; i >= 1; i--) { // first col
                    System.out.print(mat[i][0] + " ");
                }
            }
            t--;
            System.out.println();
        }
    }
}