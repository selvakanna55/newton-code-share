package contest2;

import java.util.Scanner;

public class PatternPrinter {
    public static void main(String[] args) {
        // input = 3
        /*
        0 4 8
        6 10 14
        12 16 20
          */

        /*
        input = 5
          0 4 8 12 16
          6 10 14 18 22
          12 16 20 24 28
          18 22 26 30 34
          24 28 32 36 40
        */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int currSix = 6 * i;
            for (int j = 0; j < n; j++) {
                System.out.print((j * 4) + currSix + " ");
            }
            System.out.println();
        }
    }
}
