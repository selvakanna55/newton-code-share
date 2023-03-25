package arena;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class GridMagicContest {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char[][] grid = new char[n][n];
        for (int i = 0; i < n; i++) {
            String line = sc.next();
            for (int j = 0; j < n; j++) {
                grid[i][j] = line.charAt(j);
            }
        }

        char dC = grid[0][0];
        char otherC = grid[0][1];
        boolean isM = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char ch = grid[i][j];
                if (i == j || i == n - j - 1) {
                    if (ch != dC) {
                        isM = false;
                    }
                } else {
                    if (ch != otherC) {
                        isM = false;
                    }
                }
            }
        }
        if (isM && otherC != dC) {
            System.out.print("YES");
        } else {
            System.out.print("NO");
        }
    }
}