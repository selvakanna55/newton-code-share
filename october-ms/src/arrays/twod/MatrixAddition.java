package arrays.twod;

public class MatrixAddition {
    public static void main(String[] args) {
        int mat1[][] = {{1, 0, 1}, {4, 5, 6}, {1, 2, 3}};
        int mat2[][] = {{1, 1, 1}, {2, 3, 1}, {1, 5, 1}};
        int rows = 3, cols = 3;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int sum = mat1[i][j] + mat2[i][j];
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}