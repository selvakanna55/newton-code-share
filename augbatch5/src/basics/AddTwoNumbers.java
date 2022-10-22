package input_output_datatypes;

import java.util.Scanner;

class AddTwoNumbers {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in); // used to taking input from user

        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int sum = number1 + number2;
        System.out.println(sum);


//        System.out.println(10 + 20);
//        System.out.println(20 - 10);
//        System.out.println(20 * 10);
//        System.out.println(28 / 5);
//        System.out.println(28 % 5); // remainder modulo operator

    }
}
