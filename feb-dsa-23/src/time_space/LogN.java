package time_space;

import java.util.Scanner;

public class LogN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            System.out.print(i + " ");
        }
        // n 10
        // n 20
        // n = 100

    }
}
//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 // O(n)


