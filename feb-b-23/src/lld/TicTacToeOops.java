package lld;


import java.util.Scanner;

class Board {
    int size;
    char board[][];

    Board(int size) {
        this.size = size;
        this.board = new char[size][size];
        initBoard();
    }

    void initBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = '-'; //unfilled values
            }
        }
    }

    void printBoard() {
        int n = size;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    void move(int r, int c, char piece) {
        board[r][c] = piece;
    }
}


class TicTacToeGame {
    Board board;
    int size;


    public static boolean isWinner(char board[][], int n, char piece) {
        // rows
        for (int row = 0; row < n; row++) {
            int count = 0;
            for (int col = 0; col < n; col++) {
                if (board[row][col] == piece) {
                    count++;
                }
            }
            if (count == n) return true;
        }

        // col
        for (int col = 0; col < n; col++) {
            int count = 0;
            for (int row = 0; row < n; row++) {
                if (board[row][col] == piece) {
                    count++;
                }
            }
            if (count == n) return true;
        }

        // lower diagonal
        if (board[0][0] != '-' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return true;
        }

        //upper diagonal
        if (board[2][0] != '-' && board[2][0] == board[1][1] && board[1][1] == board[0][2]) {
            return true;
        }
        return false;
    }

    TicTacToeGame(int size) {
        this.size = size;
        this.board = new Board(size);
    }

    void play() {
        Scanner sc = new Scanner(System.in);


        for (int i = 1; i <= 9; i++) {
            char piece;
            if (i % 2 == 0) piece = 'O';
            else piece = 'X';
            System.out.println("Enter position for " + piece);
            int r = sc.nextInt();
            int c = sc.nextInt();
            board.move(r, c, piece);
            board.printBoard();
            if (isWinner(board.board, size, piece)) {
                System.out.println(piece + " is the winner");
                break;
            }
        }
    }
}

public class TicTacToeOops {
    public static void main(String[] args) {
        TicTacToeGame tg = new TicTacToeGame(3);
        tg.play();
    }
}
