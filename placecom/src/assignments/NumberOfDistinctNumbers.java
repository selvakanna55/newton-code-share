package assignments;


import java.util.HashSet;
import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class NumberOfDistinctNumbers {
    static void findAllUniq(long a, long b, HashSet<Long> hs) {
        hs.add(a);
        if (b == 0) return;
        findAllUniq(a + 3, b - 1, hs);
        findAllUniq(a - 3, b - 1, hs);
        findAllUniq(a * 2, b - 1, hs);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            long a = sc.nextInt();
            long b = sc.nextInt();
            HashSet<Long> hs = new HashSet<>();
            findAllUniq(a, b, hs);
            System.out.println(hs.size());
        }
    }
}