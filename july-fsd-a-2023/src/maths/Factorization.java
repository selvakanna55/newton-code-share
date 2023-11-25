package maths;


import java.util.*;


public class Factorization {
    // Newton School Online Java compiler to run Java online.
    // Write Java code in this online editor and run it.
    public static void factorsN(int n) {
        // TC: O(n)
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        // TC: O(sqrt(n))
        int n = 24;
        int sqrt = (int) Math.sqrt(n);
        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i != n / i) {
                    System.out.print((n / i) + " ");
                }
            }
        }
    }
}