package assignments;

import java.util.*;

public class FindBadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        long badNum = findBadNumber(n, x, sc);
        System.out.println(badNum);
    }

    public static long findBadNumber(int n, int x, Scanner sc) {
        for (int i = 0; i < n; i++) {
            long num = sc.nextLong();
            long input = num;
            while (num > 1) {
                if (num % x != 0) {
                    return input;
                }
                num = num / x;
            }
        }
        return -1;
    }
}