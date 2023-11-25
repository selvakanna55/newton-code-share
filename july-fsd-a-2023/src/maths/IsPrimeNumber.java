package maths;

public class IsPrimeNumber {
    // Newton School Online Java compiler to run Java online.
    // Write Java code in this online editor and run it.
    public static boolean isPrime(int n) {
        if (n == 1 || n == 0) {
            return false;
        }
        // O(n)
        boolean ans = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                ans = false; //not prime
                break;
            }
        }
        return ans;
    }

    public static boolean isPrimeSqrt(int n) {
        if (n == 1 || n == 0) {
            return false;
        }
        // O(sqrt(n))
        boolean ans = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                ans = false; //not prime
                break;
            }
        }
        return ans;
    }


    public static void main(String[] args) {
        // n * sqrtn?
        int n = 500;
        for (int i = 0; i <= n; i++) {
            if (isPrimeSqrt(i)) {
                System.out.print(i + " ");
            }
        }

    }
}