package maths;

import java.util.ArrayList;

public class Factorization {
    static void factorsN(int n) {
        // O(n)
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 36;
        //O(sqrt(n))
        int sqrt = (int) Math.sqrt(n);
        ArrayList<Integer> li = new ArrayList<>();

        for (int i = 1; i <= sqrt; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (n / i != i) {
                    System.out.print(n / i + " ");
                }
            }
        }


    }
}
