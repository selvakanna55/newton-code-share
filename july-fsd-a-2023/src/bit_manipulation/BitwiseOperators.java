package bit_manipulation;


import java.util.*;
import java.io.*;


public class BitwiseOperators {

    public static void main(String[] args) {


        // // >> divides by 2 - right shift
        System.out.println(10 >> 1); // 2^1
        System.out.println(12 >> 2); // 2^2
        System.out.println(20 >> 1);

        // << multiply by 2 -> left shift
        System.out.println(10 << 1); // 20
        System.out.println(14 << 1); // 28


        //    System.out.println(5|3);
        System.out.println(10 | 2);

        System.out.println(5 & 4);

        System.out.println(5 ^ 3);
        System.out.println(3 ^ 3);
        System.out.println(26 ^ 6);

        System.out.println(~6);


    }
}