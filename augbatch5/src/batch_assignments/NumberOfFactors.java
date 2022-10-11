package batch_assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NumberOfFactors {
    static int maxi = 100;
    static boolean isPrime[] = new boolean[maxi + 1];

    public static void primeSeive() {
        for (int i = 0; i <= maxi; i++) {
            isPrime[i] = true; // every no is prime
        }
        isPrime[1] = false;
        for (int i = 2; i <= maxi; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= maxi; j += i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    // logn
    public static long f(int n, int prime) {
        // 5, 2
        long ans = 0;
        long p = prime; // 2
        while ((n / p) > 0) {
            ans += (n / p);
            p = p * prime;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        primeSeive();
        long res = 1;
        for (int i = 1; i <= n; i++) {
            if (isPrime[i]) { // 2 3 5
                res = res * (f(n, i) + 1);
            }
        }
        System.out.println(res);
    }
}
