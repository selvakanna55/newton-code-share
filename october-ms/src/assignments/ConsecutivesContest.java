package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class ConsecutivesContest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int X = sc.nextInt();
        for (X = 1; X <= n; X++) {
            // int X = i;
            boolean Y = (((X & (X ^ 2)) != 0) && X != 1);
            System.out.println((Y) ? "Yes" : "No");
        }
    }
}