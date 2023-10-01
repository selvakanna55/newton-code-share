package array2d;


import java.util.*;

class MatrixAddition {

    public static void main(String args[]) {
        int m1[][] = {{10, 12, 13}, {25, 23, 14}};
        int m2[][] = {{15, 19, 1}, {11, 22, 1}};

        int rows = m1.length; // no of elements in the arr
        int cols = m1[0].length;


        int sum[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = m1[i][j] + m2[i][j];
            }
        }


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }


    }
}


// System.out.println(Arrays.toString(arr[0]));
// System.out.println(Arrays.toString(arr[1]));
// System.out.println(Arrays.toString(arr[2]));


// int arr1[] = {10, 20, 30};
//         int arr2[] = {40, 50, 60};
//         int arr3[] = {70, 80, 90};
//         int arr4[] = {51, 88, 24};

//         int arr2d[][] = {arr1, arr2, arr3, arr4}; //2D array