package array2d;


import java.util.*;

class Array2DIO {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int totalRows = 2; // arr.length
        int totalCols = 2; // arr[0].length


        int arr[][] = new int[totalRows][totalCols];

        // input
        for (int row = 0; row < totalRows; row++) {
            for (int j = 0; j < totalCols; j++) {
                arr[row][j] = sc.nextInt();
            }
        }

        // ouput
        for (int row = 0; row < totalRows; row++) {
            for (int j = 0; j < totalCols; j++) {
                System.out.print(arr[row][j] + " ");
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