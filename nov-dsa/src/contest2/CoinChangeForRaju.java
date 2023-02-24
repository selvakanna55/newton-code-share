package contest2;

import java.util.Scanner;

public class CoinChangeForRaju {
    public static void main(String[] args) {
        // there are coins, 1, 2, 5, 10, 50, 100
        // give change with less no of notes
        // 700 ->
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int amount = sc.nextInt();
            int coins = 0;
            int arr[] = {1, 2, 5, 10, 50, 100};
            for (int i = arr.length - 1; i >= 0; i--) {
                int currNotes = amount / arr[i];
                coins = coins + currNotes;
                amount = amount - (currNotes * arr[i]);
            }
            System.out.println(coins);
        }


    }
}
