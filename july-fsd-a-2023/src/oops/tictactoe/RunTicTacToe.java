package oops.tictactoe;

public class RunTicTacToe {
    public static void main(String[] args) {
        Player p1 = new Player("Raj", 'X');
        Player p2 = new Player("Varun", 'O');
        TicTacToeGame game = new TicTacToeGame(p1, p2);
        game.gamePlay();
    }
}
