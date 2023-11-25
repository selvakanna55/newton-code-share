package maths;


public class GcdLcm {
    // Newton School Online Java compiler to run Java online.
    // Write Java code in this online editor and run it.

    public static int gcd(int a, int b) {
        // SC: O(1), TC: O(log min(a,b))
        // best case -> O(1) -> gcd(A,0) -> A
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;
    }

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    public static void main(String[] args) {
        System.out.println(gcd(18, 24));
        System.out.println(lcm(18, 24));
    }
}