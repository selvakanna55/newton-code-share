package oops.tic_tac_toe;


import java.util.Scanner;

class Board {
    int rows;
    int cols;
    char board[][];

    Board(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        initBoard();
    }

    void initBoard() {
        board = new char[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                board[i][j] = '-';
            }
        }
    }

    void printBoard() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    void move(int row, int col, char symbol) {
        board[row][col] = symbol;
    }
}


class Player {
    String name;
    int score;
    char symbol;

    Player(String name, int score, char symbol) {
        this.name = name;
        this.score = score;
        this.symbol = symbol;
    }

}


class TicTacGameOops {

    public static void main(String args[]) {
        GamePlay game = new GamePlay();
        game.startGame();
    }

}

class GamePlay {

    boolean isWin(char arr[][], int rows, int cols) {
        boolean ans = false;
        for (int i = 0; i < rows; i++) {
            if (arr[i][0] != '-' && (arr[i][0] == arr[i][1]) && (arr[i][1] == arr[i][2])) { //row
                ans = true;
                break;
            }
        }

        for (int j = 0; j < cols; j++) {
            if (arr[0][j] != '-' && (arr[0][j] == arr[1][j]) && (arr[1][j] == arr[2][j])) { //cols
                ans = true;
                break;
            }
        }
        return ans;
    }

    void startGame() {
        // players
        Player p1 = new Player("Tarun", 10, 'O');
        Player p2 = new Player("Varun", 10, 'X');

        // board
        int rows = 3, cols = 3;
        Board gameBoard = new Board(rows, cols);


        Scanner sc = new Scanner(System.in);


        String gameResult = "draw";

        for (int i = 1; i <= 9; i++) {
            Player currPlayer;
            if (i % 2 == 0) {
                currPlayer = p1;
            } else {
                currPlayer = p2;
            }
            System.out.println("enter position for " + currPlayer.symbol);
            int row = sc.nextInt();
            int col = sc.nextInt();
            gameBoard.move(row, col, currPlayer.symbol);
            gameBoard.printBoard();

            if (isWin(gameBoard.board, rows, cols)) {
                gameResult = currPlayer.name + " is winner";
                break;
            }
        }
        System.out.println(gameResult);
    }
}