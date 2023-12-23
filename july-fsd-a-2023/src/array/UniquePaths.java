package array;


class UniquePaths {
    public int uniquePaths(int m, int n) {
        int arr[][] = new int[m][n];
        //set last row as 1
        for (int c = 0; c < n; c++) {
            arr[m - 1][c] = 1;
        }

        // set last column as 1
        for (int r = 0; r < m; r++) {
            arr[r][n - 1] = 1;
        }

        for (int i = m - 2; i >= 0; i--) {
            for (int j = n - 2; j >= 0; j--) {
                arr[i][j] = arr[i + 1][j] + arr[i][j + 1];
            }
        }
        return arr[0][0];
    }
}