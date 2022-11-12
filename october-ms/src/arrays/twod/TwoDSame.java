package arrays.twod;

public class TwoDSame {
    public static void main(String[] args) {
        int arr[] = new int[4];
        int arr1[] = {10, 20, 30, 40};

        int a[] = {1, 2, 3};
        int b[] = {4, 5, 6};
        int c[] = {7, 8, 9};

        int matrix[][] = {{1, 2, 3}, {4, 5, 6}, c};
//        System.out.println(matrix[1][2]);
//        System.out.println(matrix[2][1]);
//        for (int i = 0; i < 3; i++) {
//            System.out.print(matrix[0][i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < 3; i++) {
//            System.out.print(matrix[1][i] + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < 3; i++) {
//            System.out.print(matrix[2][i] + " ");
//        }
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}
