package basics;

import java.util.Scanner;

public class ControlStructures {
    public static void main(String[] args) {
        System.out.println("begin");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        switch (number) {
            case 1: // if (number == 1)
                System.out.println("ONE");
                break;
            case 2: //if (number == 2)
                System.out.println("TWO");
                break;
            case 3: //if (number == 3)
                System.out.println("THREE");
                break;
            default: //else
                System.out.println("invalid");
        }

//        if (number == 1) {
//            System.out.println("ONE");
//        } else if (number == 2) {
//            System.out.println("TWO");
//        } else if (number == 3) {
//            System.out.println("THREE");
//        } else {
//            System.out.println("invalid");
//        }

//        //String[] args -> command line inputs
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        //print maximum one
//        if (a >= b) {
//            System.out.println(a);
//            System.out.println("a");
//        } else {
//            System.out.println(b);
//            System.out.println("b");
//        }
//
//        System.out.println(a * b);
//        if (a != 0) {
//            System.out.println(b / a);
//        } else {
//            System.out.println("cannot divide by zero");
//        }
//        System.out.println(a + b);
//        System.out.println(a - b);
//        // find the maximum of two number , a , b

        System.out.println("end");

    }
}
