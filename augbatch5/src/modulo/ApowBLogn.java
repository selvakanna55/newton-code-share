package modulo;

public class ApowBLogn {
    // 2 16
    static long mod = 1000000007;

    static long power(long a, long b) {
        if (b == 0) return 1;
        if (b == 1) return a;
        long pow = power(a, b / 2); //2^8
        if (b % 2 == 0) {
            return (pow * pow) % mod;
        } else {
            return ((a * pow) % mod * pow) % mod;
        }
    }

    static long modMultiplicativeInverse(long a) {
        return power(a, mod - 2);
    }

    public static void main(String[] args) {
        System.out.println(modMultiplicativeInverse(10));
        System.out.println(modMultiplicativeInverse(20));
//        System.out.println(power(2, 8));
    }
}
