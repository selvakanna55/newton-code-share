package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class GCD {
    static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    // O(log(min(a,b))))
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long m = sc.nextLong();
        long n = sc.nextLong();
        System.out.println(gcd(m, n));
    }
}