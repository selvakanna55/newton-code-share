package maths;

import java.util.Scanner;

public class IsPrime {

    public static boolean isNumberIsPrime(int n) { //Sqrt(n)
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            if (isNumberIsPrime(i)) {
                System.out.print(i + " ");
            }
        }

    }
}
