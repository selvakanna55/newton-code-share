package assignments;


class EfficientPowerFunction {
    static long mod = 1000000007L;

    static long power(long a, long n) {
        if (n == 0) return 1;
        else if (n == 1) return a;

        long pow = power(a, n / 2);
        if (n % 2 == 0) {
            return (pow * pow) % mod;
        } else {
            return ((a * pow) % mod * pow) % mod;
        }

    }


    // public static long power(int a, int n){
    //   long ans = 1;
    //   for(int i=1;i<=n;i++){ //O(n)
    //     ans = (ans * a)%(1000000007L);
    //   }
    //   return ans%(1000000007L);

    // }

}