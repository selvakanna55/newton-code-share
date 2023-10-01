package array2d;


import java.util.*;

class MatrixRowSum {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int arr[][] = new int[rows][cols];

        // row sum?
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            int rowSum = 0;
            for (int j = 0; j < cols; j++) {
                rowSum = rowSum + arr[i][j];
            }
            System.out.print(rowSum + " ");
        }


    }
}
