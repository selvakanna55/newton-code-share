package arrays.twod;

import java.util.Scanner;

public class Day2TwoD {
    public static void main(String[] args) {
        int arr1[] = {10, 20, 30, 88, 98};
        int arr2[] = {91, 65, 32, 90, 66};
        int arr3[] = {11, 28, 39, 51, 59};
//        arr3[2] = 39;
        int matrix[][] = {
//               0    1   2   3   4
                {10, 20, 30, 88, 98}, //0
                {91, 65, 32, 90, 66}, //1
                {11, 28, 39, 51, 59} //2
        };
//
//        System.out.println(matrix[0][0]);
//        System.out.println(matrix[0][1]);
//        System.out.println(matrix[0][2]);
//        System.out.println(matrix[0][3]);
//        System.out.println(matrix[0][4]);
//        for (int i = 0; i < 5; i++) {
//            System.out.print(matrix[0][i] + " ");
//        }
//        System.out.println();
//
//        for (int i = 0; i < 5; i++) {
//            System.out.print(matrix[1][i] + " ");
//        }
//        System.out.println();
//
//        for (int i = 0; i < 5; i++) {
//            System.out.print(matrix[2][i] + " ");
//        }
//        System.out.println();

//        for (int row = 0; row < 3; row++) {
//            for (int i = 0; i < 5; i++) {
//                System.out.print(matrix[row][i] + " ");
//            }
//            System.out.println();
//        }
//
//        int arr2d[][] = {
////                0   1   2   3
//                {11, 22, 33, 44}, //0
//                {10, 20, 30, 40}, // 1
//                {50, 60, 70, 80} // 2
//        };
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 4; j++) {
//                System.out.print(arr2d[i][j] + " ");
//            }
//            System.out.println();
//        }

        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int nums[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            nums[i] = sc.nextInt();
//        }
//        for (int i = 0; i < n; i++) {
//            System.out.print(nums[i]+" ");
//        }

        int rows = 3;
        int cols = 3;
        int arr2d[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr2d[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr2d[i][j] + " ");
            }
            System.out.println();
        }
    }
}
