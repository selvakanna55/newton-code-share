package assignments;


import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class NearestPerfectSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long num = sc.nextLong();
            long curr = (long) Math.sqrt(num);
            long op1;
            long op2;
            if (curr * curr == num) {
                op1 = (curr - 1) * (curr - 1);
            } else {
                op1 = curr * curr;
            }
            op2 = (curr + 1) * (curr + 1);
            long diff1 = Math.abs(op1 - num);
            long diff2 = Math.abs(op2 - num);
            if (diff1 <= diff2) {
                System.out.println(op1);
            } else {
                System.out.println(op2);
            }
        }
    }
}