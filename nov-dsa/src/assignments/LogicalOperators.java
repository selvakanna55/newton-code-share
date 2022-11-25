package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class LogicalOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print((a <= 10 && b >= 10) + " ");
        System.out.print((a % 2 == 0 || b % 2 == 0) + " ");
        System.out.print((a != b) + " ");
    }
}

// 10^15