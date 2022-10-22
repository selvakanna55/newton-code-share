package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sub1 = sc.nextInt();
        int sub2 = sc.nextInt();
        int sub3 = sc.nextInt();
        int sub4 = sc.nextInt();
        int sub5 = sc.nextInt();
        int percetage = (sub1 + sub2 + sub3 + sub4 + sub5) / 5;

        if (percetage >= 80) {
            System.out.println("A");
        } else if (percetage < 80 && percetage >= 60) {
            System.out.println("B");
        } else if (percetage < 60 && percetage >= 40) {
            System.out.println("C");
        } else {
            System.out.println("D");
        }
    }
}