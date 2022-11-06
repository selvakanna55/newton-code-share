import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class CatalanNumbers {
    static long power(long x, long y, long p) {

        // Initialize result
        long res = 1;

        // Update x if it is more than or
        // equal to p
        x = x % p;

        while (y > 0) {

            // If y is odd, multiply x
            // with result
            if (y % 2 == 1)
                res = (res * x) % p;

            // y must be even now
            y = y >> 1; // y = y/2
            x = (x * x) % p;
        }

        return res;
    }

    static long modInverse(long n, long p) {
        return power(n, p - 2, p);
    }


    public static void main(String[] args) {
        // long pow(long a, lon)

        int N = 2000000;
        long mod = 1000000007L;
        long fact[] = new long[N + 1];

        fact[0] = 1;
        for (int i = 1; i <= N; i++) {
            fact[i] = (fact[i - 1] * i) % mod;
        }

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long a = ((fact[2 * n] * (modInverse(fact[n + 1], mod) % mod)) % mod * (modInverse(fact[n], mod) % mod)) % mod;
            // long b = (fact[n+1] * fact[n])%mod;
            // System.out.println(a+" "+b);
            System.out.println(a);
        }
    }
}