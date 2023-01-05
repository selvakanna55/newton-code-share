package oops.tictactoe;

import java.util.Scanner;

public class TicTacToeGame {
    Board tictactoeBoard;
    Player players[];

    TicTacToeGame() {
        tictactoeBoard = new Board();
    }

    TicTacToeGame(Player players[]) {
        this.players = players;
        tictactoeBoard = new Board();
    }

    void gamePlay() {
        Scanner sc = new Scanner(System.in);
        int turn = 1;
        int playerCount = players.length;
        int boardSize = tictactoeBoard.boardSize;
        boolean isGameRunning = true;
        tictactoeBoard.print();
        while (isGameRunning) {
            Player currPlayer = players[turn % playerCount];
            int row = sc.nextInt();
            int col = sc.nextInt();
            tictactoeBoard.move(row, col, currPlayer.key);
            tictactoeBoard.print();
            if (isWinner(currPlayer)) {
                System.out.println("winner is" + currPlayer.name);
                isGameRunning = false;
            }
            if (turn == boardSize * boardSize) {
                System.out.println("Draw");
                isGameRunning = false;
            }
            turn++;
        }
    }

    boolean sameRowCheck(Player currPlayer) {
        for (int row = 0; row < tictactoeBoard.boardSize; row++) {
            int count = 0;
            for (int col = 0; col < tictactoeBoard.boardSize; col++) {
                if (tictactoeBoard.board[row][col] == currPlayer.key) {
                    count++;
                }
            }
            if (count == tictactoeBoard.boardSize) {
                return true;
            }
        }
        return false;
    }

    boolean sameColCheck(Player currPlayer) {
        for (int col = 0; col < tictactoeBoard.boardSize; col++) {
            int count = 0;
            for (int row = 0; row < tictactoeBoard.boardSize; row++) {
                if (tictactoeBoard.board[row][col] == currPlayer.key) {
                    count++;
                }
            }
            if (count == tictactoeBoard.boardSize) {
                return true;
            }
        }
        return false;
    }

    boolean sameLeftDiagonalCheck(Player currPlayer) {
        int count = 0;
        for (int i = 0; i < tictactoeBoard.boardSize; i++) {
            if (tictactoeBoard.board[i][i] == currPlayer.key) {
                count++;
            }
        }
        if (count == tictactoeBoard.boardSize) {
            return true;
        } else {
            return false;
        }
    }

    boolean sameUpperDiagonalCheck(Player currPlayer) {
        int n = tictactoeBoard.boardSize;
        int count = 0;
        for (int i = 0; i < tictactoeBoard.boardSize; i++) {
            if (tictactoeBoard.board[i][n - i - 1] == currPlayer.key) {
                count++;
            }
        }
        if (count == tictactoeBoard.boardSize) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isWinner(Player currPlayer) {
        if (sameRowCheck(currPlayer) || sameColCheck(currPlayer) || sameLeftDiagonalCheck(currPlayer) || sameUpperDiagonalCheck(currPlayer)) {
            return true;
        } else {
            return false;
        }
    }
}
