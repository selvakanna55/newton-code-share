package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class TribonacciNumberEasyVersion {
    static int Tribonacci(int n) {
        if (n == 1) return 0;
        if (n == 2) return 0;
        if (n == 3) return 1;
        return Tribonacci(n - 1) + Tribonacci(n - 2) + Tribonacci(n - 3);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Tribonacci(n));
    }
}