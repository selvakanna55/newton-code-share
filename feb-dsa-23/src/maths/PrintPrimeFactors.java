package maths;

public class PrintPrimeFactors {
    public static void main(String[] args) {
        int n = 54;
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }

        if (n > 1) { // n is a prime number
            System.out.println(n);
        }


    }
}
