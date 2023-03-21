package arena;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class RowWithMaximum1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int maxOneIdx = 0, maxOneCount = 0;

        for (int row = 0; row < n; row++) {
            int ones = 0;
            for (int col = 0; col < m; col++) {
                if (arr[row][col] == 1) {
                    ones++;
                }

            }
            if (ones > maxOneCount) {
                maxOneCount = ones;
                maxOneIdx = row;
            }
        }
        System.out.println(maxOneIdx);
    }
}