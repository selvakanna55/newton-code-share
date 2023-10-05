package array2d;

public class MatrixMultiplication {

    public static void main(String args[]) {
        int m1[][] = {{3, 4}, {2, 1}};
        int m2[][] = {{1, 5}, {3, 7}};
        int rows1 = 2, cols1 = 2;
        int rows2 = 2, cols2 = 2;

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                int sum = 0;
                for (int k = 0; k < rows2; k++) {
                    sum = sum + (m1[i][k] * m2[k][j]);
                }
                System.out.print(sum + " ");
            }
            System.out.println();
        }
    }
}