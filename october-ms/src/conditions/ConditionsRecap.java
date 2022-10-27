package conditions;

import java.util.Scanner;

public class ConditionsRecap {
    public static void main(String[] args) {
        //number is odd or even
//        int num1 = 16;
//////        System.out.println(num1 % 2 == 0);
//        if (num1 % 2 == 0) {
//            System.out.println("Even");
//        } else {
//            System.out.println("Odd");
//        }
//
////        System.out.println(num1 % 2 == 0 && num1 % 10 == 0);
//        //is number is divisible by 10 and 2 -> yes
//        if (num1 % 2 == 0 && num1 % 10 == 0) {
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }


        // num is div by 3 -> div by 3
        // num is div by 5 -> div by 5
        // num is div by 3 & 5 -> div by 3, 5
        // otherwise no
//        int num2 = 4;
        // if else if, -> if else if ladder
//        if (num2 % 3 == 0 && num2 % 5 == 0) {
//            System.out.println("div by 3, 5");
//        } else if (num2 % 3 == 0) {
//            System.out.println("div by 3");
//        } else if (num2 % 5 == 0) {
//            System.out.println("div by 5");
//        } else {
//            System.out.println("no");
//        }

//        if (num2 % 5 == 0) {
//            if (num2 % 3 == 0) {
//                System.out.println("div by 3, 5");
//            } else {
//                System.out.println("div by 5");
//            }
//        } else if (num2 % 3 == 0) {
//            System.out.println("div by 3");
//        } else {
//            System.out.println("no");
//        }

        // == -> switch
        // calculator
        // 10 + 20
//        Scanner sc = new Scanner(System.in);
//        int num1 = sc.nextInt();
//        char operator = sc.next().charAt(0); //"+"
//        int num2 = sc.nextInt();

//        if (operator == '+') {
//            System.out.println(num1 + num2);
//        } else if (operator == '*') {
//            System.out.println(num1 * num2);
//        } else if (operator == '/') {
//            // assuming num2 is not zero
//            System.out.println(num1 / num2);
//        } else if (operator == '-') {
//            System.out.println(num1 - num2);
//        } else {
//            System.out.println("Invalid  operator");
//        }

//        switch (operator) {
//            case '+':
//                System.out.println(num1 + num2);
//                break;
//            case '*':
//                System.out.println(num1 * num2);
//                break;
//            case '/':
//                // assuming num2 is not zero
//                System.out.println(num1 / num2);
//                break;
//            case '-':
//                System.out.println(num1 - num2);
//                break;
//            default:
//                System.out.println("Invalid  operator");
//        }

//        int num = 21;
//        //  ternary operator
//        String ans = (num % 2 == 0) ? "Even" : "Odd";
//        // condtion         ?  true   : false
//        int a = 10, b = 20;
//        int bigger = (a > b) ? a : b;
//
//        System.out.println(bigger);
//        if (a > b) {
//            System.out.println(a);
//        } else {
//            System.out.println(b);
//        }

//        if (num % 2 == 0) {
//            ans = "Even";
//        } else {
//            ans = "Odd";
//        }
        // ternary operator

//        System.out.println(ans);

        System.out.println(Math.abs(-1));
        System.out.println(Math.abs(-11));
        System.out.println(Math.abs(541));

    }
}
