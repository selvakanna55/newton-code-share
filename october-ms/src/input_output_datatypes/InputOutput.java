package input_output_datatypes;

import java.util.*;
import java.lang.*;

// rename this class as Main and
// remove line no 1 while running in newton school playground

class InputOutput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();// 2
        long b = scan.nextLong(); //  2312351235
        float c = scan.nextFloat(); // 1.21
        double d = scan.nextDouble();
        char e = scan.next().charAt(0);
        String name = scan.next();

        System.out.println(a);
        System.out.println(b);
        System.out.printf("%.2f", c);
        System.out.println();
        System.out.printf("%.4f", d);
        System.out.println();
        System.out.println(e);
        System.out.println(name);

        // print hello and then go to new line
        // String name = "newton";
        // int age = 20;
        // double percentage = 99.9;
        // // name: newton
        // System.out.println("Student Name: "+name);
        // System.out.println("Student Age: "+age+" years");
        // System.out.println("Student Mark: "+percentage+"%");
        // // System.out.print("jfv \n newton");
        // // System.out.print("jfv\n");
        // System.out.println("jfv");
        // \n -> new line

    }
}