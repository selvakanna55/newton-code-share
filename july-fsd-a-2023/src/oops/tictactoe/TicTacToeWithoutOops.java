package oops.tictactoe;

import java.util.*;

// https://geekflare.com/wp-content/uploads/2021/08/Tic-Tac-Toe-Winning-Arragements-e1629210910316.png
public class TicTacToeWithoutOops {

    public static void printMatrix(char arr[][]) {
        int rows = arr.length;
        int cols = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void resetMatrix(char arr[][]) {
        int rows = arr.length;
        int cols = arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = '-';
            }
        }

    }

    static boolean isSameRow(char arr[][], int n, char player) {
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == player) {
                    count++;
                }
            }
            if (count == n) return true;
        }
        return false;
    }

    public static boolean isSameCol(char arr[][], int n, char player) {
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j][i] == player) {
                    count++;
                }
            }
            if (count == n) return true;
        }
        return false;
    }

    public static boolean isSameDiagonal(char arr[][], int n, char player) {
        int lowerDiagonal = 0, upperDiagonal = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i][i] == player) {
                lowerDiagonal++;
            }
            if (arr[i][n - i - 1] == player) {
                upperDiagonal++;
            }
        }
        return lowerDiagonal == n || upperDiagonal == n;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        char matrix[][] = new char[n][n];
        resetMatrix(matrix);

        String result = "Draw";

        for (int i = 1; i <= (n * n); i++) {
            printMatrix(matrix);
            char player = i % 2 == 1 ? 'X' : 'O';
            System.out.println("provide " + player + " position: ");
            int row = sc.nextInt();
            int col = sc.nextInt();
            matrix[row][col] = player;
            if (isSameRow(matrix, n, player) || isSameCol(matrix, n, player) || isSameDiagonal(matrix, n, player)) {
                result = player + " won the match";
                break;
            }
        }
        printMatrix(matrix);
        System.out.println(result);

    }
}