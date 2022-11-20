package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class RotateTheMatrix {
    static void transpose(int arr[][], int n) {
        // transpose
        for (int row = 0; row < n; row++) {
            for (int col = row + 1; col < n; col++) {
                int temp = arr[col][row];
                arr[col][row] = arr[row][col];
                arr[row][col] = temp;
            }
        }
    }


    static void reverse(int arr[][], int n) {
        // reverse every row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int idx1 = j;
                int idx2 = n - j - 1;
                int temp = arr[i][idx1];
                arr[i][idx1] = arr[i][idx2];
                arr[i][idx2] = temp;
            }
        }
    }

    static void printMatrix(int arr[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        transpose(arr, n);
        reverse(arr, n);
        printMatrix(arr, n);

        System.out.println();

        transpose(arr, n);
        reverse(arr, n);
        printMatrix(arr, n);

    }
}