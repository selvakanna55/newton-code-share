package maths;

public class PrintPrimeFactors {
    static void printPrimeFactors(int n) { // only for positive nums
        if (n <= 3) {
            System.out.print(n + " ");
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            while (n % i == 0) {
                System.out.print(i + " ");
                n = n / i;
            }
        }
        if (n > 2) {
            System.out.println(n);
        }
        //TC:  O(sqrt(n)
    }

    public static void main(String[] args) {
        printPrimeFactors(56);
//        printPrimeFactors(90);
    }
}
