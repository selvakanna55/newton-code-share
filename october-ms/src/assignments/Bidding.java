package assignments;

import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class Bidding {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t > 0) {                      // Your code here
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            if ((A > B) && (A > C)) {
                System.out.println("Alice");
            } else if ((B > A) && (B > C)) {
                System.out.println("Bob ");
            } else {
                System.out.println("Charlie");
            }
            t--;
        }
    }
}