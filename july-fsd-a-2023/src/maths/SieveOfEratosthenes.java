package maths;


import java.util.*;

public class SieveOfEratosthenes {
    public static void primeSieve(int n) {
        boolean isPrime[] = new boolean[n + 1];
        for (int i = 0; i <= n; i++) { // all are primes numbers
            isPrime[i] = true;
        }
        isPrime[0] = false;
        isPrime[1] = false; // 0,1 is not a prime
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j = j + i) {
                    isPrime[j] = false;
                }
            }
        }
        System.out.println(Arrays.toString(isPrime));

        for (int i = 0; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        // n*log(logn)
        primeSieve(50);
    }

}