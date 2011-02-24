package basic_problem_solving;


import java.util.Scanner;

public class OneDArray {
    // Newton School Online Java compiler to run Java online.
    // Write Java code in this online editor and run it.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }

        // enhaced for loop
        for (int val : arr) {
            System.out.println(val);
        }

    }
}