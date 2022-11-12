package arrays.twod;

import java.lang.reflect.Array;
import java.util.Scanner;

public class TwoD {
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
//        int n = 5;
//        int arr[] = new int[5];
//        for (int i = 0; i < n; i++) {
//            arr[i] = (i + 1) * 10;
//        }
//
//        for(int i=0;i<n;i++){
//            System.out.print(arr[i]+" ");
//        }
        int a = 10;
        int b = 20;
        int c = 30;
        int nums[] = {a, b, c};
//
        int arr1[] = {10, 20, 30};
        int arr2[] = {11, 21, 31};
        int arr3[] = {44, 55, 66};

//        System.out.println(matirx[0][0]);
//        System.out.println(matirx[0][1]);
//        System.out.println(matirx[0][2]);
//        int matirx[][] = {{10, 20, 30}, {11, 21, 31}, {44, 55, 66}};
//        int maxt2[][] = {
//                {11, 12, 13},
//                {21, 22, 23},
//                {31, 32, 33}};
//
//        int rows = 3, cols = 3;
//        for (int row = 0; row < rows; row++) {
//            for (int col = 0; col < cols; col++) {
//                System.out.print(maxt2[row][col] + " "); //arr1 -> matrix[0]
//            }
//            System.out.println();
//        }
        Scanner sc = new Scanner(System.in);


        int rows = 4;
        int cols = 4;
        int matr3[][] = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matr3[row][col] = sc.nextInt();
            }
        }

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(matr3[row][col] + " "); //arr1 -> matrix[0]
//                System.out.print("*");
            }
            System.out.println();
        }


//        for (int i = 0; i < n; i++) {
//            System.out.print(matirx[1][i] + " "); //arr1 -> matrix[0]
//        }
//        System.out.println();
//        for (int i = 0; i < n; i++) {
//            System.out.print(matirx[2][i] + " "); //arr1 -> matrix[0]
//        }
//        System.out.println();
    }
}
