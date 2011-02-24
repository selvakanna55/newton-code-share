package basic_problem_solving;
// https://my.newtonschool.co/playground/code/ah0ra2yhjzf9l

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class ArrayRotation {
    private static void reverse(int arr[], int left, int right) {
        // int n = arr.length;
        // int left = 0, right = n-1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        // Your code here
        // Your code here
        // reverse the whole array
        // reverse 0 to n-k-1
        // reverse n-k to n-1

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr, 0, n - 1);
        reverse(arr, 0, n - d - 1);
        reverse(arr, n - d, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}