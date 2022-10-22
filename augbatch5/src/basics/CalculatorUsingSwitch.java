package input_output_datatypes;

import java.util.Scanner;

public class CalculatorUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 52;
        // yes - it is divisible of 2 and 5 otherwise no
        if (n % 2 == 0 && n % 5 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }


//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        char oper = sc.next().charAt(0);
//
//        switch (oper) {
//            case '+':
//                System.out.println(a + b);
//                break;
//            case '-':
//                System.out.println(a - b);
//                break;
//            case '*':
//                System.out.println(a * b);
//                break;
//            case '/':
//                System.out.println(a / b);
//                break;
//            default:
//                System.out.println("invalid operation");
//    }
    }
}
