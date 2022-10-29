package batch_assignments;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class SuperExponentiation {
    static long expo(long a, long b, long mod) { // logn
        long res = 1;
        while (b != 0) {
            if (b % 2 == 1)
                res = (res * a) % mod;
            a = (a * a) % mod;
            b = b / 2;
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long mod = 1000000007;
            long bPowc = expo(b, c, mod - 1);
            long aPowbc = expo(a, bPowc, mod);
            System.out.println(aPowbc);
        }
    }
}
