package maths;

public class Primes {
    static boolean isPrimeN(int n) {
        //O(n)
        // 1, n
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static boolean isPrimeSqrtN(int n) {
        //O(SqrtN)
        // 1, n
        int sqrt = (int) Math.sqrt(n);
        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                return false; //not
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrimeSqrtN(10));
        System.out.println(isPrimeSqrtN(97));
        System.out.println(isPrimeSqrtN(107));
    }
}
