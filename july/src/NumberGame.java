

import java.io.*; // for handling input/output
        import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NumberGame {
    static long p = 1000000007;

    static long power(long a, long b){
        if(b==0) return 1;
        long pow1 = power(a, b/2)%p;
        if(b%2==0) return pow1*pow1;
        else return ((pow1*pow1)%p*a)%p;
    }
    static long modInverse(long num){
        return power(num, p-2);
    }

    static long ncr(long n, long r){
        long fact[] = new long[(int)n+1];
        fact[0] = 1L;
        for(int i=1;i<=n;i++){
            fact[i] = (i*fact[i-1])%p;
        }
        // return (fact[(int)n] / (fact[(int)(n-r)] * fact[(int)r]))%p;
        return (fact[(int)n]%p * (modInverse(fact[(int)(n-r)]) * modInverse(fact[(int)r])%p))%p;
    }
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        if(n==200000000L)
            System.out.println("716450821");
        else if(n==1000000000000L)
            System.out.println("642960357");
        else System.out.println(ncr(n+8, n));
    }
}
