package oops.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
    Board board;
    Player players[];

    TicTacToeGame(Player players[]) {
        board = new Board();
        this.players = players;
    }

    void gamePlay() {
        Scanner sc = new Scanner(System.in);
        int turn = 1;
        boolean isGameRunning = true;
        while (isGameRunning) {
            Player currPlayer = players[turn % players.length];
            int row = sc.nextInt();
            int col = sc.nextInt();
            board.move(row, col, currPlayer.key);
            // loop for checking all the sides
        }
    }
}
