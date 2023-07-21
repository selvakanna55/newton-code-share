package leetcode;

// https://leetcode.com/problems/unique-paths/description/
public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int rows = m;
        int cols = n;
        int arr[][] = new int[rows][cols];
        //set last row as 1
        for (int c = 0; c < cols; c++) {
            arr[rows - 1][c] = 1;
        }

        // set last column as 1
        for (int r = 0; r < rows; r++) {
            arr[r][cols - 1] = 1;
        }

        for (int i = rows - 2; i >= 0; i--) {
            for (int j = cols - 2; j >= 0; j--) {
                arr[i][j] = arr[i + 1][j] + arr[i][j + 1];
            }
        }
        return arr[0][0];
    }
}