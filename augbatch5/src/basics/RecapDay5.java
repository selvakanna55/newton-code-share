package input_output_datatypes;

import com.sun.corba.se.impl.legacy.connection.USLPort;

import java.util.Scanner;

public class RecapDay5 {
    public static void main(String[] args) {
//        // datatype variable = value
//        int age = 10;
//        long bankBalance = 10000000L;
//
//        float percentage = 10.5f;
//        double average = 99.5;
//
//        String name = "Newton";
//        char gender = 'M';
//
//        short mark = 99;
//        boolean result = true; // passed
//
//        byte value = 10;
//
//        // output
//        System.out.println("hello");
//        // input
//        //
//        Scanner scan = new Scanner(System.in);
//
//        // 3 -> conditions, loop, jumps
//        //conditions
//        //if, if else, if else if, switch
//        int a = 20;
//        int b = 10;
//        // simple if
//        if (a > b) { //20>10 true
//            System.out.println(a);
//        }
//
//        //  if else find maximum between two
//        if (a > b) { // 100>200 false
//            System.out.println(a);
//        } else {
//            System.out.println(b);
//        }
//
//        // if else if
//// = -> assignment , == -> comparison
//        int num = 1;
//        if (num == 1) { // false
//            System.out.println("one");
//        } else if (num == 2) {//false
//            System.out.println("two");
//        } else if (num == 3) { // false
//            System.out.println("three");
//        } else {
//            System.out.println("enter number from 1 to 3");
//        }
//
//        // switch
//        switch (num) {
//            case 1: // num==1
//                System.out.println("one");
//                break;
//            case 2: // else if (num == 2)
//                System.out.println("two");
//                break;
//            case 3: // else if (num == 3)
//                System.out.println("three");
//                break;
//            default: //else
//                System.out.println("enter number from 1 to 3");
//        }
//
//        // ternary operator
//        // number is odd or even
//        num = 49;
//        if (num % 2 == 0) {
//            System.out.println("even");
//        } else {
//            System.out.println("odd");
//        }
//        //                  condition     ? true   : false
//        System.out.println((num % 2 == 0) ? "even" : "odd");
//
        // loops
        // again
        // break -> terminate the loop
        // continue -> skip, don't execute bellow, and go to next iteration
        int n = 4;
        for (int i = 5; i <= n; i++) {
            if (i == 2) {
                continue;
            }
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }

        int i = 5;
        do {
            System.out.println(i);
            i++;
        } while (i <= n);


//        int i = 1;
//        while (i <= 4) {
//            System.out.println(i);
//            i++;
//        }
//


    }
}
