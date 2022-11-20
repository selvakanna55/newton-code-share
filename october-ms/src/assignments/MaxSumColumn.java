package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class MaxSumColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int arr[][] = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                arr[row][col] = sc.nextInt();
            }
        }

        int maxiSum = 0;
        for (int col = 0; col < cols; col++) {
            int sum = 0;
            for (int row = 0; row < rows; row++) {
                sum = sum + arr[row][col];
            }
            if (sum > maxiSum) {
                maxiSum = sum;
            }
        }
        System.out.println(maxiSum);

    }
}


// 1 4 7
// 2 5 8
// 3 6 9