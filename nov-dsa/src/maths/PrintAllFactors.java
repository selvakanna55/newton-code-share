package maths;

public class PrintAllFactors {
    static void factorN(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
        //TC: O(N)
    }

    public static void main(String[] args) {
        int n = 36;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                if (i != n / i) {
                    System.out.print(n / i + " ");
                }
            }
        }
        //TC: O(N)
    }
}
