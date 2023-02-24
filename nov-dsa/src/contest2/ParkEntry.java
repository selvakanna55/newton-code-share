package contest2;

import java.util.Scanner;

public class ParkEntry {
    public static void main(String[] args) {
        // min age should be atleast U, maximum age should be less than v
        // given age of kid, allowed or not
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int minAge = sc.nextInt(); //U
            int maxAge = sc.nextInt(); //V
            int currAge = sc.nextInt();
            if (currAge >= minAge && currAge < maxAge) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
