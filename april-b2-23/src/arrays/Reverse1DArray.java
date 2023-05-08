package arrays;

import java.util.Scanner;

class Reverse1DArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n]; // o to n-1, all other indices are error
        for (int i = 0; i < n; i++) { //input
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i]; //swap
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }


        for (int i = 0; i < n; i++) { // output
            System.out.print(arr[i] + " ");
        }

    }
}