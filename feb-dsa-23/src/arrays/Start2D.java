package arrays;

public class Start2D {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int arr1[] = {a, b, c}; //{10,20,30}

        int a1[] = {1, 2, 3};
        int a2[] = {4, 5, 6};
        int a3[] = {7, 8, 9};
        int arr2[][] = {a1, a2, a3}; // {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}
        int matrix[][] = {{1, 2, 3}, {14, 15, 16}, {7, 8, 9}};

        int n = matrix[1].length;
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[1][i] + " ");
        }
        System.out.println();


    }
}
