package arena;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class GrossSalaryContest {
    public static void main(String[] args) {
        // Your code here
        Scanner sc = new Scanner(System.in);
        long basicSalary = sc.nextLong();
        if (basicSalary <= 10000) {
            long grossSalary = basicSalary * 2;
            System.out.print(grossSalary);
        } else if (basicSalary <= 20000) {
            System.out.print((long) (basicSalary * 2.15));
        } else {
            System.out.print((long) (basicSalary * 2.25));
        }
    }
}