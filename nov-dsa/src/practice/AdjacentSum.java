package practice;

import java.util.Scanner;

public class AdjacentSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        long sum = 0;
        for (int i = 0; i < n; i += 2) {
            sum = sum + arr[i] + arr[i + 1];
            System.out.print((arr[i] + arr[i + 1]) + " ");
        }
        System.out.println();
        System.out.println(sum);
    }
}
