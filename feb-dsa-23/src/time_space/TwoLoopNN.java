package time_space;

import java.util.Scanner;

public class TwoLoopNN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // O(n)
        for (int i = 0; i < n; i++) {
            for (int j = 0; i < n / 2; i++) {
                System.out.print(i + " ");
            }
            System.out.println("-");
        }
    }
}
