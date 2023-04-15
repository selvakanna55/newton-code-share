package maths;

public class PrintAllDivisors {
    public static void printN(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) { // if divisible remainder is 0
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        int n = 36;
        int sqrt = (int) Math.sqrt(n); //6
        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                System.out.print(i + " " + n / i + " ");
            }
        }
    }
}
