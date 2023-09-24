package array;

import java.util.Scanner;

public class SumMaxiArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // maxi
        int maxi = arr[0];
        for (int i = 0; i < n; i++) {
            if (maxi < arr[i]) {
                maxi = arr[i];
            }
        }
        System.out.println("maximum " + maxi);

        // sum
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
        }
        System.out.println("sum " + maxi);
    }
}
