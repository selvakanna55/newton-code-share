package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class FinalOutput {
    public static final int MOD = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long x[] = new long[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }

        long product = 1;
        for (int i = 0; i < n; i++) {
            product = (product * x[i]) % MOD;
        }

        System.out.println(product);
    }
}