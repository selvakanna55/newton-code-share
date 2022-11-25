package assignments;

import java.util.Scanner;

class LeapYear {
    public static void main(String[] args) {
        //Capture the user's input
        Scanner scanner = new Scanner(System.in);
        //Storing the captured value in a variable
        int n = scanner.nextInt();
        LeapYear(n);
    }

    static void LeapYear(int year) {

        if (year % 400 == 0) {
            System.out.println("YES");
        } else if (year % 100 == 0) {
            System.out.println("NO");
        } else if (year % 4 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}