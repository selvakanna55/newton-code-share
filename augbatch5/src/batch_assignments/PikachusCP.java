package batch_assignments;


import java.util.Arrays;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class PikachusCP {
    static int getPrimeFactors(int n) { //O(sqrt(n)) -> O(1)
        int count = 0;
        if (n % 2 == 0) count++;
        while (n % 2 == 0) {
            n = n / 2;
        }
        for (int i = 3; i <= (int) Math.sqrt(n); i += 2) {
            boolean isDiv = false; // i+=2
            while (n % i == 0) {
                isDiv = true;
                n = n / i;
            }
            if (isDiv) count++;
        }
        if (n > 2) {
            count++;
        }
        return count;
    }

    static int n = 1000000;
    static int[] noOfFactors = new int[n + 1];

    static void primeSeive() {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true); // all are not a prime number
        for (int p = 2; p <= n; p++) {
            if (isPrime[p]) {
                noOfFactors[p] = 1; // if it is a prime no, then prime factor is 1;
                for (int j = 2 * p; j <= n; j += p) {
                    noOfFactors[j]++; // increasing prime factors
                    isPrime[j] = false; // as it is divisible. not a prime
                }
            }
        }
    }

    public static void main(String[] args) {
        primeSeive(); // pre computation
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for (int t = 0; t < tc; t++) {
            int ci = sc.nextInt();
            int cf = sc.nextInt();
            int f = sc.nextInt();
            int count = 0; // to numbers in range(ci, cf) contains prime factor as f
            for (int i = ci + 1; i <= cf; i++) {
                if (noOfFactors[i] == f) {
                    count++;
                }
            }

            if (count == 0) {
                System.out.println(-1);
            } else {
                System.out.println(count);
            }
        }
    }
}