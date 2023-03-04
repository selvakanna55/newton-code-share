package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class CandyLoveContest {
    static int f(long x) { // no of digits in x
        // while loop
        int count = 0;
        while (x > 0) {
            x = x / 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long T = sc.nextLong();

        long start = 0;
        long end = 1000000001;

        while (start < end) {
            long mid = start + (end - start) / 2;
            long amount = (A * mid) + (B * f(mid));
            if (amount > T) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        if (start == 0) System.out.println(start);
        else System.out.println(start - 1);
    }
}
