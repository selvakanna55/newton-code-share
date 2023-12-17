package oops.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
    Player p1;
    Player p2;
    TicTacToeBoard board;
    int rows = 3;
    int cols = 3;

    public TicTacToeGame(Player p1, Player p2) {
        this.p1 = p1;
        this.p2 = p2;
        this.board = new TicTacToeBoard(rows, cols);
    }

    private Player getCurrentPlayer(int turn) {
        return turn % 2 == 1 ? p1 : p2;

    }

    void gamePlay() {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        char matrix[][] = new char[n][n];
        board.fillBoard('-');

        String result = "Draw";

        for (int i = 1; i <= (n * n); i++) {
            board.printMatrix();
            Player p = getCurrentPlayer(i);
            System.out.println("provide " + p.piece + " position: ");
            int row = sc.nextInt();
            int col = sc.nextInt();
            board.setValue(row, col, p.piece);
            if (board.isSameRow(p.piece) || board.isSameCol(p.piece) || board.isSameDiagonal(p.piece)) {
                result = p.name + " won the match, piece is " + p.piece;
                break;
            }
        }
        board.printMatrix();
        System.out.println(result);

    }
}
