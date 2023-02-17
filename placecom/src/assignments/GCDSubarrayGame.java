package assignments;

import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class GCDSubarrayGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        boolean found = false;

        int gcd = a[0];
        for (int j = 1; j < n; j++) {
            gcd = gcd(gcd, a[j]);
        }

        if (gcd == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        sc.close();
    }

    // Utility method to calculate GCD of two numbers
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
}