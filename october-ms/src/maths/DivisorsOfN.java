package maths;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class DivisorsOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            int num = sc.nextInt();
            int sqrt = (int) Math.sqrt(num);
            int res = 0;
            for (int i = 1; i <= sqrt; i++) {
                if (num % i == 0) {
                    if (i % 2 == 0) res++;
                    if (num / i != i) {
                        if ((num / i) % 2 == 0) res++;
                    }
                }
            }
            System.out.println(res);
        }
    }
}