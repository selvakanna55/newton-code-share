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
        return row >= 0 && row < boardSize && col >= 0 && col < boardSize && board[row][col] == '-';
    }

    void move(int row, int col, char piece) {
        if (!isValidMove(row, col)) {
            System.out.println("Invalid move");
            return;
        }
        board[row][col] = piece;
    }

}
