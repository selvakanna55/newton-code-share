package oops.tictactoe;

public class Board {
    char board[][];

    int boardSize = 3;

    Board() {
        board = new char[boardSize][boardSize];
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                board[i][j] = '-';
            }
        }
    }

    boolean isValidMove(int row, int col) {
        if (row >= 0 && row < boardSize && col >= 0 && col < boardSize && board[row][col] == '-') {
            return true;
        } else {
            return false;
        }
    }

    void move(int row, int col, char piece) {
        if (isValidMove(row, col)) {
            board[row][col] = piece;
        } else {
            System.out.println("Invalid move");
        }
    }

    void print() {
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
