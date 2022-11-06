package TimeSpace;

import java.util.Scanner;

public class TimeBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // to run 1 line of code 1 rupee, how much rupee?
        int n = sc.nextInt(); // 1
        int sum = 0; // 1

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
    }
}
