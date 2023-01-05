package oops.tictactoe;

public class RunGame {
    public static void main(String[] args) {
        Player playerArray[] = new Player[2];
        playerArray[0] = new Player("Ab", 'X');
        playerArray[1] = new Player("Bc", 'O');
        TicTacToeGame tic = new TicTacToeGame(playerArray);
        tic.gamePlay();
    }
}
