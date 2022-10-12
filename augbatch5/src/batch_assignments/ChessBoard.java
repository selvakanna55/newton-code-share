package batch_assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class ChessBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int[][] arr = new int[n][n];
        int match = 0, notMatch = 0;
        for (int i = 0; i < n; i++) {
            String row[] = sc.nextLine().split(" ");
            for (int j = 0; j < n; j++) {
                int value = (i + j) % 2;
                if (value == Integer.parseInt(row[j])) match++;
                if (value != Integer.parseInt(row[j])) notMatch++;
            }
        }
        System.out.println(Math.min(match, notMatch));
    }
}
