package maths;

public class PowerInLogn {
    // O(b) ?
//    static long powN(long a, long b) { //5^3  a = 5, b = 3
//        long ans = 1;
//        long mod = 1000000007;
//        for (int i = 1; i <= b; i++) {
//            ans = ans * a;
//            ans = ans % mod;
//        }
//        return ans;
//    }

    static long pow(long a, long b) {
        long mod = 1000000007;
        if (b == 0) return 1;
        else if (b == 1) return a;
        long ans = 1;
        long power = pow(a, b / 2);
        if (b % 2 == 0) ans = (power * power) % mod;
        else ans = ((power * power) % mod * a) % mod;
        return ans;
    }


    public static void main(String[] args) {
//        System.out.println(Math.pow(2, 3));
//        System.out.println(Math.pow(5, 10));
//        System.out.println(Math.pow(5, 500));
//        System.out.println(powN(5, 500));
        System.out.println(pow(3, 10));

    }
}
