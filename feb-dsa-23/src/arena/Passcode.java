package arena;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Passcode {

    static long pow(long a, long b) {
        long mod = 1000000007;
        if (b == 0) {
            return 1;
        } else if (b == 1) {
            return a;
        }
        long ans = 1;
        long power = pow(a, b / 2);
        if (b % 2 == 0) {
            ans = (power * power) % mod;
        } else {
            ans = ((power * power) % mod * a) % mod;
        }
        return ans;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long ans = 1;
        long mod = 1000000007;
        if (n % 2 == 0) {
            ans = (pow(5, n / 2) % mod * pow(4, n / 2) % mod) % mod;
        } else {
            ans = (pow(5, n / 2) % mod * pow(4, n / 2) % mod) % mod;
            ans = (ans * 5) % mod;
        }
        System.out.println(ans);
    }
}