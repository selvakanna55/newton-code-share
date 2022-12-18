package maths;

public class Seq {
    public static void main(String[] args) {


//        1^2 + 1^3 = 2
//
//        2^2 + 2^3 = 12
//
//        3^2 + 3^3 = 36
//
//        4^2 + 4^3 = 80
//
//        5^2 + 5^3 = 150
//
//        6^2 + 6^3 = 252


        int start1 = 2;
        int start2 = 10;
        // 10 +
        int n = 20;
        int arr[][] = new int[n][n];

        for (int row = 0; row < n; row++) {
            arr[row][0] = 1;
            arr[row][row] = 1;
            for (int col = 1; col <= row; col++) {
                arr[row][col] = arr[row - 1][col] + arr[row - 1][col - 1];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


        //
    }
}
