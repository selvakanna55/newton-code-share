package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class MatrixZigZagTraversal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int arr[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            int r = i; // row is decrese
            int c = 0;
            while (r >= 0 && c < cols) {
                System.out.print(arr[r][c] + " ");
                r--;
                c++;
            }
            System.out.println();
        }

        for (int i = 1; i < cols; i++) {
            int r = rows - 1;
            int c = i;
            while (r >= 0 && c < cols) {
                System.out.print(arr[r][c] + " ");
                r--;
                c++;
            }
            System.out.println();
        }

    }
}