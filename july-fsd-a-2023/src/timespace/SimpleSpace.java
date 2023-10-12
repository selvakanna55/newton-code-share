package timespace;

public class SimpleSpace {
    public static void main(String[] args) {
        int n = 3;

        boolean arr[] = new boolean[n]; // space complexity -> O(n)

        int arr1[][] = new int[n][n];  // space complexity -> O(n^2)


        int rows = 5, cols = 5;
        int grid[][] = new int[rows][cols]; // space complexity O(rows*cols)
    }
}
