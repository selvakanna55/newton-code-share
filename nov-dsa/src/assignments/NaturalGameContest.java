package assignments;

import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class NaturalGameContest {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        long n = S.nextLong();
        long k = S.nextLong();
        long oddNoCount = (n + 1) / 2;
        if (k <= oddNoCount) { //odd
            System.out.println((2 * k) - 1);
        } else { //eve
            k = k - oddNoCount;
            System.out.println(2 * k);
        }
    }
}