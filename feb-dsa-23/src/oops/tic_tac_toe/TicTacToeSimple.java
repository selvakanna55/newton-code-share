package oops.tic_tac_toe;


import java.util.Scanner;

class TicTacToeSimple {

    static boolean isWin(char arr[][], int rows, int cols) {
        boolean ans = false;
        for (int i = 0; i < rows; i++) {
            if (arr[i][0] != '-' && (arr[i][0] == arr[i][1]) && (arr[i][1] == arr[i][2])) { //row
                ans = true;
                break;
            }
        }

        for (int j = 0; j < cols; j++) {
            if (arr[0][j] != '-' && (arr[0][j] == arr[1][j]) && (arr[1][j] == arr[2][j])) { //cols
                ans = true;
                break;
            }
        }
        return ans;
    }

    static void print2dMatrix(char arr[][], int rows, int cols) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int rows = 3, cols = 3;
        char board[][] = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = '-';
            }
        }
        Scanner sc = new Scanner(System.in);

        String gameResult = "draw";

        for (int i = 1; i <= 9; i++) {
            char currPlayer;
            if (i % 2 == 0) {
                currPlayer = 'O';
            } else {
                currPlayer = 'X';
            }
            System.out.println("enter position for " + currPlayer);
            int row = sc.nextInt();
            int col = sc.nextInt();
            board[row][col] = currPlayer;
            print2dMatrix(board, rows, cols);
            if (isWin(board, rows, cols)) {
                gameResult = currPlayer + " is winner";
                break;
            }
        }
        System.out.println(gameResult);
    }
}