package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Bidding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        for (int i = 1; i <= testcases; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if (a > b && a > c) {
                System.out.println("Alice");
            } else if (b > a && b > c) {
                System.out.println("Bob");
            } else {
                System.out.println("Charlie");
            }
        }
    }
}