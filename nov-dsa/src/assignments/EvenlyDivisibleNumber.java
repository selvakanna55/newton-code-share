package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class EvenlyDivisibleNumber {
    static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        long ans = 1;
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            ans = (ans * i) / gcd(ans, i);
        }
        System.out.println(ans);
    }
}