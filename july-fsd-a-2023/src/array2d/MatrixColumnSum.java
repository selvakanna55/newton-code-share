package array2d;

// don't change the name of this class
// you can add inner classes if needed
class MatrixColumnSum {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int rows = arr.length;
        int cols = arr[0].length;

        for (int j = 0; j < cols; j++) {
            int sum = 0;
            for (int i = 0; i < rows; i++) {
                sum = sum + arr[i][j];
            }
            System.out.println(sum + " ");
        }
    }
}


// rowsum -> first ith row, jth cols
// col sum -> first jth col, i th tow
