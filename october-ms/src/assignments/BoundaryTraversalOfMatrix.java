package assignments;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class BoundaryTraversalOfMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        for (int t = 0; t < testcases; t++) {
            int rows = sc.nextInt();
            int cols = sc.nextInt();
            int arr[][] = new int[rows][cols];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            for (int c = 0; c < cols; c++) {
                System.out.print(arr[0][c] + " ");
                // System.out.print(0+""+c+" ");
            }

            for (int r = 1; r < rows - 1; r++) {
                System.out.print(arr[r][cols - 1] + " ");
                // System.out.print(r+""+(cols-1)+" ");
            }
            if (rows != 1) {
                for (int c = cols - 1; c >= 0; c--) {
                    System.out.print(arr[rows - 1][c] + " ");
                    // System.out.print((rows-1)+""+c+" ");
                }
            }

            if (cols != 1) {
                for (int r = rows - 2; r >= 1; r--) {
                    System.out.print(arr[r][0] + " ");
                    // System.out.print(r+""+0+" ");
                }
            }
            System.out.println();
        }
    }
}