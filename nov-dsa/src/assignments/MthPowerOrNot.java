package assignments;

import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class MthPowerOrNot {
    static int n = 1000002;
    static boolean isPrime[] = new boolean[n];

    static void findPrimes() {
        for (int i = 0; i < n; i++) {
            isPrime[i] = true;
        }
        isPrime[0] = false;
        isPrime[1] = false;
        // 100 -> 10
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (isPrime[i]) {
                for (int j = (i * i); j < n; j = j + i) {
                    isPrime[j] = false;
                }
            }
        }
    }

    public static void main(String[] args) {
        findPrimes();
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            boolean ans = false;
            int n = sc.nextInt();
            int m = sc.nextInt();
            for (int x = 2; x < 1000002; x++) {
                if (isPrime[x]) {
                    double pow = Math.pow(x, m);
                    if (pow == n) {
                        ans = true;
                        break;
                    }
                }
            }
            if (ans) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}