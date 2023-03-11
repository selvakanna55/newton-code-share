package arrays;


public class MatrixAddition {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 2;
        int matrix1[][] = {{1, 2}, {3, 4}, {5, 6}};
        int matrix2[][] = {{10, 12}, {18, 20}, {44, 55}};

        int res[][] = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                res[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }


    }
}

//  System.out.print(matrix[2][1]);


//  int cols = matrix[0].length;
//         for (int i = 0; i < n; i++) {
//             System.out.print(matrix[0][i] + " ");
//         }
//         System.out.println();
//         for (int i = 0; i < n; i++) {
//             System.out.print(matrix[1][i] + " ");
//         }
//         System.out.println();
//           for (int i = 0; i < n; i++) {
//             System.out.print(matrix[2][i] + " ");
//         }
//         System.out.println();