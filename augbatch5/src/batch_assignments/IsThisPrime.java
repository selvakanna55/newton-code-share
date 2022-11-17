package batch_assignments;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class IsThisPrime {
    static long mod = 1000000007;

    static long pow(long a, long b) { // logn
        long res = 1;
        while (b != 0) {
            if (b % 2 == 1)
                res = (res * a) % mod;
            a = (a * a) % mod;
            b = b / 2;
        }
        return res;
    }

    static long f(long x, long p) {
        long curr = 1;
        while (x % pow(p, curr) == 0) {
            curr++;
        }
        return pow(p, curr - 1);
    }

    static ArrayList<Long> getPrimes(long n) {
        ArrayList<Long> li = new ArrayList<>();
        if (n % 2 == 0) {
            li.add(2L);
            while (n % 2 == 0)
                n /= 2;
        }
        for (long i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                while (n % i == 0)
                    n /= i;
                li.add(i);
            }
        }
        if (n > 2)
            li.add(n);
        return li;
    }


    static long g(List<Long> primes, int y) {
        long ans = 1;
        for (long num : primes) {
            ans = (ans * f(y, num)) % mod;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long n = sc.nextLong();
        long ans = 1;
        ArrayList<Long> primes = getPrimes(x);
        for (int i = 1; i <= n; i++) {
            ans = (ans * g(primes, i)) % mod;
        }
        System.out.println(ans);
    }
}