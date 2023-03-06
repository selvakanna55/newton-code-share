package tictactoe;

import java.util.Scanner;

public class TicTacToe {
    Board board;


    TicTacToe() {
        board = new Board();
    }

    boolean getWinner(Piece piece) {
        // row
        for (int i = 0; i < board.n; i++) {
            int count = 0;
            for (int j = 0; j < board.n; j++) {
                if (board.board[i][j] == piece.value) count++;
            }
            if (count == board.n) {
                System.out.println(piece.value + " is the winner");
                return true;
            }
        }

        //col
        for (int i = 0; i < board.n; i++) {
            int count = 0;
            for (int j = 0; j < board.n; j++) {
                if (board.board[j][i] == piece.value) count++;
            }
            if (count == board.n) {
                System.out.println(piece.value + " is the winner");
                return true;
            }
        }

        //diagonals
        int diagonal1 = 0;
        int diagonal2 = 0;
        for (int i = 0; i < board.n; i++) {
            if (board.board[i][i] == piece.value) diagonal1++;
            if (board.board[i][board.n - i - 1] == piece.value) diagonal2++;
        }
        if (diagonal1 == board.n || diagonal2 == board.n) {
            System.out.println(piece.value + " is the winner");
            return true;
        }
        return false;
    }

    void play() {
        Piece x = new Piece('X'); //even
        Piece o = new Piece('O'); //odd

        Scanner sc = new Scanner(System.in);
        int turn = 1;
        boolean winner = false;
        Piece currPiece;
        while (!winner && turn <= 9) {
            System.out.println("enter row and colum for turn: " + turn);
            int row = sc.nextInt();
            int col = sc.nextInt();
            if (turn % 2 == 0) {
                currPiece = x;
            } else {
                currPiece = o;
            }
            board.move(row, col, currPiece);
            board.printBoard();
            turn++;
            winner = getWinner(currPiece);
        }

    }
//
//
//    int findResult() {
//
//    }

}