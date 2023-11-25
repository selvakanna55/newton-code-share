package maths;


public class PrimeFactorization {
    public static void main(String[] args) {
        // O(n) -> O(sqrtn)
        int n = 36;

        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }
        if (n > 1) { // if n is prime
            System.out.print(n + " ");
        }

    }
}