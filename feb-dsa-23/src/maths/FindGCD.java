package maths;

import java.util.Queue;

public class FindGCD {

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    // a>0 b>0
    public static void main(String[] args) {
        int a = 104;
        int b = 169;

//        while (b != 0) {
//            int remainder = a % b;
//            a = b;
//            b = remainder;
//        }
        System.out.println(gcd(a, b));
        System.out.println(lcm(a, b));
    }
}
