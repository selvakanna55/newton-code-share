package arrays.twod;
//        int rows = matrix1.length, cols = matrix1[0].length;


public class MatrixMultiplication {
    public static void main(String[] args) {
        int matrix1[][] = {
//               0  1
                {-1, 4}, //0
                {2, 3}}; // 1
        int matrix2[][] = {
//               0  1
                {9, -3}, //0
                {6, 1}}; //1

        int rows = 2, cols = 2;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                int sum = 0;
                for (int k = 0; k < rows; k++) {
                    sum = sum + (matrix1[row][k] * matrix2[k][col]);
                }
                System.out.print(sum + " ");
            }
            System.out.println();
        }

    }
}
