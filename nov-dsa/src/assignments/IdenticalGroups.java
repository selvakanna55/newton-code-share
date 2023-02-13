package assignments;

import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class IdenticalGroups {
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(gcd(x, y));
    }
}