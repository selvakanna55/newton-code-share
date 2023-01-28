package revision_dsa1;

public class ModuloExpo {
    static long pow(long a, long b, long mod) {
        if (b == 0) return 1;
        if (b == 1) return a;
        long currPow = pow(a, b / 2, mod);
        if (b % 2 == 0) {
            return (currPow * currPow) % mod;
        } else {
            return (((a * currPow) % mod) * currPow) % mod;
        }
    }

    public static void main(String[] args) {
        long a = 2;
        long b = 852545985;
        long mod = 1000000007;
        System.out.println(pow(a, b, mod));
    }
}
