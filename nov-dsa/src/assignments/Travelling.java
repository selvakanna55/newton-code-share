package assignments;

import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class Travelling {
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int result = Math.abs(arr[0] - x);
        for (int i = 1; i < n; i++) {
            result = gcd(result, Math.abs(arr[i] - x));
        }
        System.out.println(result);
    }
}