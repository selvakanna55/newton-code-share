package tictactoe;

import java.nio.channels.Pipe;

public class Board {
    char[][] board;
    int n = 3;

    Board() {
        board = new char[n][n];
    }

    void printBoard() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    void move(int row, int col, Piece piece) {
        board[row][col] = piece.value;
    }
}
