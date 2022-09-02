package Assignments;

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class DataTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        long num2 = sc.nextLong();
        float num3 = sc.nextFloat();
        double num4 = sc.nextDouble();
        String s = sc.next();

        char ch = sc.next().charAt(0); //"c"

        System.out.println(num1);
        System.out.println(num2);
        System.out.printf("%.2f\n", num3);
        System.out.printf("%.4f\n", num4);
        System.out.println(ch);

    }
}