package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class StrangeElementEasyVersion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr = new int[N][M];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int rowCount = 0;
        int colCount = 0;

        for (int row = 0; row < N; row++) {
            int count = 0;
            for (int col = 0; col < M; col++) {
                if (arr[row][col] == 1) {
                    count++;
                }
            }
            if (count == M) rowCount++;
        }

        for (int col = 0; col < M; col++) {
            int count = 0;
            for (int row = 0; row < N; row++) {
                if (arr[row][col] == 1) {
                    count++;
                }
            }
            if (count == N) colCount++;
        }

        System.out.println(rowCount * colCount);


    }
}