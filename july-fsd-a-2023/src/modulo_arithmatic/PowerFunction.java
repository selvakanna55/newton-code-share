package modulo_arithmatic;


public class PowerFunction {
    // Newton School Online Java compiler to run Java online.
    // Write Java code in this online editor and run it.
    public static long pow(long a, long b) {
        int mod = 1000000007;
        // TC: (logb)
        if (b == 0) return 1;
        if (b == 1) return a;
        long powerVal = pow(a, b / 2);
        if (b % 2 == 0) {
            return (powerVal * powerVal) % mod;
        } else {
            return ((a * powerVal) % mod * powerVal) % mod;
        }
    }

    public static void main(String[] args) {
        int a = 2, b = 16;
        System.out.println(pow(2, 8));
        System.out.println(pow(2, 5));
        System.out.println(pow(2, 100));
    }

    public static void howToDoPow() {
        int a = 2, b = 5;
        System.out.println(Math.pow(a, b));

        int ans = 1;
        for (int i = 1; i <= b; i++) { //O(b)
            ans = ans * a;
            //    System.out.println(ans);
        }
        System.out.println(ans);
    }
}