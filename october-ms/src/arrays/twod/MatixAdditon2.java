package arrays.twod;

public class MatixAdditon2 {
    public static void main(String[] args) {
        int rows = 3, cols = 3;
        int matrix1[][] = {{1, 2, 3}, {3, 4, 5}, {5, 6, 7}};
        int matrix2[][] = {{2, 3, 5}, {7, 6, 5}, {1, 2, 3}};

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                int sum = matrix1[row][col] + matrix2[row][col];
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}
