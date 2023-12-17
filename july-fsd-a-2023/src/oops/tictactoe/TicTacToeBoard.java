package oops.tictactoe;

public class TicTacToeBoard extends Board {

    TicTacToeBoard(int rows, int cols) {
        super(rows, cols); // super points to immediate parent
    }

    boolean isSameRow(char player) {
        int n = rows;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (board[i][j] == player) {
                    count++;
                }
            }
            if (count == n) return true;
        }
        return false;
    }

    public boolean isSameCol(char player) {
        int n = rows;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (board[j][i] == player) {
                    count++;
                }
            }
            if (count == n) return true;
        }
        return false;
    }

    public boolean isSameDiagonal(char player) {
        int n = rows;
        int lowerDiagonal = 0, upperDiagonal = 0;
        for (int i = 0; i < n; i++) {
            if (board[i][i] == player) {
                lowerDiagonal++;
            }
            if (board[i][n - i - 1] == player) {
                upperDiagonal++;
            }
        }
        return lowerDiagonal == n || upperDiagonal == n;
    }

}
