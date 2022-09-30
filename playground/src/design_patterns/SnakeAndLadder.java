package design_patterns;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Jump {
    int start;
    int end;

    public Jump(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

class Cell {
    Jump jump;
}

class Player {
    public Player(int id, String name) {
        this.id = id;
        this.name = name;
    }

    int id;
    String name;
    int currentPosition = 0;

}

class Dice {
    int diceCount = 1;
    int min = 1;
    int max = 6;

    public Dice() {
    }

    public Dice(int diceCount) {
        this.diceCount = diceCount;
    }

    public int rollDice() {
        int diceSum = 0;
        for (int rotation = 1; rotation <= diceCount; rotation++) {
            diceSum += new Random().nextInt(max + 1);
        }
        return (diceSum % max) + 1;
    }
}

class Board {
    int length = 10;
    Cell[][] board;

    Board() {
        initBoard();
    }

    Board(int length) {
        this.length = length;
        initBoard();
    }


    void initBoard() {
        board = new Cell[length][length];
        for (int row = 0; row < length; row++) {
            for (int col = 0; col < length; col++) {
                board[row][col] = new Cell();
            }
        }
    }

    void addRandomSnakesLadders(int snakeCount, int ladderCount) {
        int maxiNumber = length * length;
        int ladder = 0;
        while (ladder < ladderCount) {
            int start = new Random().nextInt(maxiNumber + 1);
            int end = new Random().nextInt(maxiNumber + 1);
            if (start > 0 && end <= maxiNumber && start < end) {
                setCell(getCellFromNumber(start), start, end);
                ladder++;
            }
        }

        int snake = 0;
        while (snake < snakeCount) {
            int start = new Random().nextInt(maxiNumber + 1);
            int end = new Random().nextInt(maxiNumber + 1);
            if (start > 0 && end <= maxiNumber && start < end) {
                setCell(getCellFromNumber(end), start, end);
                snake++;
            }
        }
    }


    void setCell(Cell currCell, int start, int end) {
        currCell.jump = new Jump(start, end);
    }

    Cell getCellFromNumber(int num) {
        int r = (num - 1) / length;
        int c = (num - 1) % length;
        System.out.println(board[length - r - 1][r % 2 == 0 ? c : (length - c - 1)]);
        return board[length - r - 1][r % 2 == 0 ? c : (length - c - 1)];
    }

}

class SnakeAndLadderGame {
    List<Player> players;
    Dice dice;
    Board board;
    Player winner;

    SnakeAndLadderGame() {
        initGame();
        players = new ArrayList<>();
        players.add(new Player(1, "Alpha"));
        players.add(new Player(2, "Beta"));
    }

    void initGame() {
        dice = new Dice();
        board = new Board(10);
        board.addRandomSnakesLadders(4, 5);
        winner = null;
    }

    int getPositionAfterJumps(int position) {
        Cell currCell = board.getCellFromNumber(position);
        if (currCell.jump == null) {
            return position;
        } else {
            return currCell.jump.end;
        }
    }

    boolean isValid(int newRange) {
        return newRange > 0 && newRange <= 100;
    }

    String playGame() {

        int playerIndex = 0;
        while (winner == null) {
            int currChoice = dice.rollDice();
            Player currTurn = players.get(playerIndex % players.size());
            int newPosition = currTurn.currentPosition + currChoice;
            if (!isValid(newPosition)) {
                continue;
            }

            if (newPosition == board.length * board.length) {
                winner = currTurn;
                break;
            }
            currTurn.currentPosition = getPositionAfterJumps(newPosition);
            playerIndex++;
        }
        return winner.name;
    }
}

public class SnakeAndLadder {
    public static void main(String[] args) {
        System.out.println(new SnakeAndLadderGame().playGame());
    }
}
