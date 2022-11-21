import java.util.*;
import java.lang.*;

class Conditions {
    public static void main(String args[]) {
        // Scanner scan = new Scanner(System.in);
        // int num = scan.nextInt();
        // System.out.println(num);
        int num = 10;

//        arithmatic -> +, -, *, /
        System.out.println(10 + 20);
        System.out.println(10 - 20);
        System.out.println(10 * 20);
        System.out.println(20 / 2);

        // //conditional
        // //equal (==)
        System.out.println(20 == 20); // true
        System.out.println(20 == 10); // false

        //non equal (!=)
        //(!) -> not
        System.out.println(20 != 20); // false
        System.out.println(20 != 10); // true

        //logical OR (any one is true)
        num = 25;

        System.out.println(num % 2 == 0 || num % 3 == 0); // any one is true, print ans as True


        //logical OR (any one is true)
        num = 26;
        System.out.println(num % 2 == 0); // true
        System.out.println(num % 3 == 0); //false
        System.out.println(num % 2 == 0 && num % 3 == 0); // both true, print ans as True


        num = Integer.MAX_VALUE;
        System.out.println(num);
        System.out.println(num + 1);
        System.out.println(Integer.MIN_VALUE);


    }
}