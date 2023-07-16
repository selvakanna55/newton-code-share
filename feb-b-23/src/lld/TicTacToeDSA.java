package lld;


import java.util.Scanner;

public class TicTacToeDSA {
    public static void print2DMatrix(char board[][], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean isWinner(char board[][], int n, char piece) {
        // rows
        for (int row = 0; row < n; row++) {
            int count = 0;
            for (int col = 0; col < n; col++) {
                if (board[row][col] == piece) {
                    count++;
                }
            }
            if (count == n) return true;
        }

        // col
        for (int col = 0; col < n; col++) {
            int count = 0;
            for (int row = 0; row < n; row++) {
                if (board[row][col] == piece) {
                    count++;
                }
            }
            if (count == n) return true;
        }

        // lower diagonal
        if (board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return true;
        }

        //upper diagonal
        if (board[2][0] != '-' && board[2][0] == board[1][1] && board[1][1] == board[0][2]) {
            return true;
        }
        return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        char board[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '-'; //unfilled values
            }
        }

        for (int i = 1; i <= 9; i++) {
            char piece;
            if (i % 2 == 0) piece = 'O';
            else piece = 'X';
            System.out.println("Enter position for " + piece);
            int r = sc.nextInt();
            int c = sc.nextInt();
            board[r][c] = piece; //filling the matrix
            print2DMatrix(board, n);
            if (isWinner(board, n, piece)) {
                System.out.println(piece + " is the winner");
                break;
            }
        }
    }
}