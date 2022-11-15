package arrays.twod;

import java.util.Scanner;

public class Day3TwoD {
    public static void main(String[] args) {
////        int a = 10;
////        int b = 20;
////        int arr1d[] = {10, 20};
////        int arr1[] = {10, 20, 30};
////        int arr2[] = {40, 50, 60};
////        int arr3[] = {70, 80, 90};
////
////        int arr[][] = {arr1, arr2, arr3};
//        int matrix[][] = {
////               0   1    2
//                {10, 20, 30},  // 0
//                {40, 50, 60}, // 1
//                {70, 80, 90} // 2
//        };
////        //matrix[row][col]
////        System.out.println(matrix[1][2]);
////        System.out.println(matrix[2][1]);
//        for (int row = 0; row < 3; row++) {
//            for (int i = 0; i < 3; i++) { // i -> col
//                System.out.print(matrix[row][i] + "(" + row + "" + i + ") ");
//            }
//            System.out.println();
//        }
        Scanner sc = new Scanner(System.in);
        int rows = 3;
        int cols = 3;
        int arr[][] = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
