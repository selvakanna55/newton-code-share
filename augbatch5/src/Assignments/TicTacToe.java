package Assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char player1 = sc.next().charAt(0);
        char player2 = sc.next().charAt(0);

        if (player1 == 'R' || player2 == 'R') {
            System.out.println('R');
        } else if (player1 == 'J') {
            System.out.println(player2);
        } else if (player2 == 'J') {
            System.out.println(player1);
        } else {
            System.out.println('D');
        }

    }
}