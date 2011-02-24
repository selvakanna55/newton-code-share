package basic_problem_solving;


import java.util.*;

public class TwoDArray {
    // Newton School Online Java compiler to run Java online.
    // Write Java code in this online editor and run it.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int rowLength = sc.nextInt();
        int colLength = sc.nextInt();
        int arr[][];

        arr = new int[rowLength][colLength];

        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rowLength; i++) {
            for (int j = 0; j < colLength; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(Arrays.toString(arr[0]));
    }
}