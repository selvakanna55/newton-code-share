package assignments;


import java.io.*;
import java.util.*;

// unique paths leet
// params i,j
// return no.of paths
class CountPaths {
    static long mod = (long) (1e9) + 7;

    static long pow(long a, long b) { //logn
        if (b == 0) return 1;
        else if (b == 1) return a;
        long curr = pow(a, b / 2);
        if (b % 2 == 0) {
            return (curr * curr) % mod;
        } else {
            return ((a * curr) % mod * curr) % mod;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ar = br.readLine().split(" ");
        br.close();
        long x = Integer.parseInt(ar[0]);
        long y = Integer.parseInt(ar[1]);

        long n = x + y;
        long ans = 1;
        for (int i = 1; i <= y; i++) {
            ans = (ans * (n + 1 - i)) % mod;
            ans = (ans * pow(i, mod - 2)) % mod;
        }
        System.out.println(ans);
    }
}