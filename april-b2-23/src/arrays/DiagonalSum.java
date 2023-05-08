package arrays;

import java.util.Scanner;

public class DiagonalSum {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) { // one row
                arr[i][j] = sc.nextInt();
            }
        }

        // diangonal 1
        int sum1 = 0;
        for (int i = 0; i < rows; i++) {
            sum1 = sum1 + arr[i][i];
        }

        // diangona2
        int sum2 = 0;
        for (int i = 0; i < rows; i++) {
            sum2 = sum2 + arr[i][rows - i - 1];
        }

        System.out.println(sum1 + " " + sum2);

    }
}

