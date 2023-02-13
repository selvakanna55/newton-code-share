package assignments;

import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class PrimeNumbersBeforeN {
    static int n = 100002;
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

        int count[] = new int[n];
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count[i] = 1 + count[i - 1];
            } else {
                count[i] = count[i - 1];
            }
        }

        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while (testcases-- > 0) {
            int num = sc.nextInt();
            System.out.println(count[num]);
        }
    }
}