package batch_assignments;

import java.util.Scanner;
// https://my.newtonschool.co/playground/code/ma2or7etrq46/

// don't change the name of this class
// you can add inner classes if needed
class TwoBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long ans = 1000000000000000L;
        for (int i = 0; i < 60; ++i) {
            for (int j = i + 1; j < 60; ++j) {
                ans = Math.min(ans, Math.abs(n - ((long) 1 << i) - ((long) 1 << j)));
            }
        }
        System.out.println(ans);
    }
}