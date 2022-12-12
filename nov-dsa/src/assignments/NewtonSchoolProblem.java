package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class NewtonSchoolProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("NewtonSchool ");
            } else if (i % 3 == 0) {
                System.out.print("Newton ");
            } else if (i % 5 == 0) {
                System.out.print("School ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}
// 15-> 3*5 -> 15
//1 2 Newton 4 School Newton 7 8 Newton School 11 Newton 13 14 NewtonSchool

// 1 2 Newton 4 School Newton 7 8 Newton School 11 Newton 13 14 NewtonSchool

// I%3==1
// multiple of 3 -> %3 == 0
// I%5==1
//multiple of 5, print "School"
// i%3==0 && I%5==0
// both 3 and 5, print "NewtonSchool"