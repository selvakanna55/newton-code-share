package modulo_arithmatic;


public class FactorialWithMod {
    // Newton School Online Java compiler to run Java online.
    // Write Java code in this online editor and run it.
    public static void main(String[] args) {
        long fact = 1;
        int mod = 1000000007;
        int n = 50;
        for (int i = 1; i <= n; i++) {
            fact = (fact * i) % mod;
            System.out.println(fact);
        }
        System.out.println(fact % mod);


        // 50!
    }
}


// AS answer will be a big value take modulo with 1000000007