package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class BoundaryTraversalOfMatrix {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int arr[][] = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }

            for (int col = 0; col < m; col++) {
                System.out.print(arr[0][col] + " ");
            }

            for (int row = 1; row < n; row++) {
                System.out.print(arr[row][m - 1] + " ");
            }

            if (n != 1) {
                for (int col = m - 2; col >= 0; col--) {
                    System.out.print(arr[n - 1][col] + " ");
                }
            }
            if (m != 1) {
                for (int row = n - 2; row >= 1; row--) {
                    System.out.print(arr[row][0] + " ");
                }
            }
            System.out.println();

            t--;
        }
    }
}