package searching;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
// https://my.newtonschool.co/playground/code/3f81uuebnne5

class TheGabbaTest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        long player = sc.nextInt();
        long rupess = sc.nextInt();
        long fixPrice = sc.nextInt();
        long sellingPrice = sc.nextInt();

        long ans = 0;
        // for(int i=1;i<=player;i++){
        long left = 1, right = player;
        while (left <= right) {
            long mid = (left + right) / 2;
            long i = mid;
            long cashInHand = rupess + (player - i) * sellingPrice;
            if (cashInHand >= (i * fixPrice)) {
                ans = i;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(ans);
    }
}


// 5 (N) players are there, all are injured
// 10 (M) rupess
// to fix a player rupess 2 (X)
// selling price for player is 1 (Y)

// fix as many players as possible?