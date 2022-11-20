package arrays;

import java.util.Scanner;

public class TwoDRecap {
    public static void main(String[] args) {
//        int arr1[] = {12, 14, 17};
//        int arr2[] = {12, 874, 76};
//        int arr3[] = {34, 991, 56};
//
//        int matrix[][] = {arr1, arr2, arr3};

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int matrix[][] = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = sc.nextInt();
            }
        }


        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
