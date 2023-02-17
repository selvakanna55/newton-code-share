package practice;

import java.util.Scanner;

public class CandieDistrbution {
    public static void main(String[] args) {
        // there are X candies and Y students
        // can you distribute candies to students.
        // where all students gets equal no of candies

        // X = 10, Y = 5
        //Output: YES

        // X = 9, Y = 3
        //Output: YES

        // X = 10, Y = 3
        //Output: NO
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x % y == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
