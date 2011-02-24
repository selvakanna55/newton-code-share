package basic_problem_solving;

// https://my.newtonschool.co/playground/code/pkmejewb57h5

import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class RotateImageBy90Degrees {
    static void reverse(int arr[][], int n) {
        int left = 0, right = n - 1;

        while (left < right) {
            int temp[] = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    static void transpose(int arr[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        reverse(arr, n);
        transpose(arr, n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}