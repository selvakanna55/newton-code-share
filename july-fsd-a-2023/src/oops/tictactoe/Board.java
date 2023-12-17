package oops.tictactoe;

public class Board {
    char board[][];
    int rows;
    int cols;

    Board(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        board = new char[rows][cols];
    }


    public void fillBoard(char defaultValue) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void setValue(int row, int col, char value) {
        board[row][col] = value;
    }
}
