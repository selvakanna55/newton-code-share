package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class TwoBits {
    public static void count(long n) {
        long min = Long.MAX_VALUE;
        for (int i = 0; i < 60; i++) {
            for (int j = i + 1; j < 60; j++) {
                long curr = Math.abs(n - (1L << i) - (1L << j));
                min = Math.min(curr, min);
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();

        count(n);
    }
}