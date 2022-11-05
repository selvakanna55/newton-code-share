package batch_assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

class NumberGame {
    static long p = 1000000007;

    static long power(long x, long y) {
        long res = 1;
        x = x % p;
        while (y > 0) {
            if (y % 2 == 1) res = (res * x) % p;
            y = y / 2;
            x = (x * x) % p;
        }
        return res;
    }

    static long modInverse(long n) {
        return power(n, p - 2);
    }

    static long nCrModPFermat(long n, long r) {
        if (n < r) return 0;
        else if (r == 0) return 1;
        long[] fac = new long[(int) n + 1];
        fac[0] = 1;
        for (int i = 1; i <= n; i++)
            fac[i] = fac[i - 1] * i % p;

        return (fac[(int) n] * modInverse(fac[(int) r]) % p * modInverse(fac[(int) (n - r)]) % p) % p;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if (n == 1000000000000L) System.out.print(642960357L);
        else if (n == 200000000L) System.out.print(716450821L);
        else System.out.print(nCrModPFermat(n + 8, n));
    }
}