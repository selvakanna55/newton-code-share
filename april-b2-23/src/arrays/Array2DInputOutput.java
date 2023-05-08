package arrays;

import java.util.Scanner;

public class Array2DInputOutput {

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


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) { // one row
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}

