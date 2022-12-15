package maths;

public class PrimeFactorization {
    public static void main(String[] args) {
        int n = 48;
        while (n % 2 == 0) {
            System.out.print(2 + " ");
            n = n / 2;
        }
        int sqrt = (int) Math.sqrt(n);
        // 2, 3, 4, 5,6,
        // 2, 3,5,7,9
        for (int i = 3; i <= sqrt; i += 2) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }
        // if is true only fpr prime numbers
        if (n > 1) {
            System.out.print(n);
        }
        // n is odd
    }
}
