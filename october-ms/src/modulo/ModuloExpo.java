package modulo;

public class ModuloExpo {
    static long pow(long a, long b, long mod) {
        if (b == 0) {
            return 1;
        }
        long powAb = pow(a, b / 2, mod);
        if (b % 2 == 0) { //even
            return (powAb * powAb) % mod;
        } else { // odd
            return ((a * powAb) % mod * powAb) % mod;
        }
    }


    public static void main(String[] args) {
        System.out.println(pow(2456789, 100876567, 1000000007));
    }
}
