package Assignments;


import java.util.Scanner; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class IfLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}