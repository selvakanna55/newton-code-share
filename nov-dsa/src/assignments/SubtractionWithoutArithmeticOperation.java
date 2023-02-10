package assignments;

import java.util.Scanner;

// don't change the name of this class
// you can add inner classes if needed
class SubtractionWithoutArithmeticOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        while (y != 0) {
            int borrow = (~x) & y;
            x = x ^ y;
            y = borrow << 1;
            // System.out.println(borrow+" "+x+" "+y);
        }
        System.out.println(x);
    }
}