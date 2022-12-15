package maths;

public class GcdLcm {
    // O(log(min(a,b))
    // numbers -> log (divide, reverse (div by 10))
    static int gcd(int a, int b) {
//        if (b == 0) {
//            return a;
//        }
//        return gcd(b, a % b);

        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    static int lcm(int a, int b) {
        // a*b = gcd(a,b) * lcm(a.b);
        // (a*b)/gcd(a.b) = lcm(a.b)
        int gcdAB = gcd(a, b);
        return a * b / gcdAB;
    }

    public static void main(String[] args) {
        System.out.println(gcd(21, 35) + " " + lcm(21, 35));
        System.out.println(gcd(45, 66) + " " + lcm(45, 66));
        System.out.println(gcd(101, 7) + " " + lcm(101, 7));
    }
}
