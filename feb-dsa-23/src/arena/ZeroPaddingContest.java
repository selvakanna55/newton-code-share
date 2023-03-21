package arena;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class ZeroPaddingContest {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long p = sc.nextLong();
        long side = n + (p + p);
        System.out.print((side * side) - (n * n));
    }
}