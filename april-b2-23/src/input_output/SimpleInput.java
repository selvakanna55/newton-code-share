package input_output;

import java.util.*;
import java.io.*;

public class SimpleInput {
    public static void main(String[] args) {
        // Scanner -> needs more memory
        // BufferedReader -> takes less memory as compared to scanner
        //next -> read one word
        //nextLine -> read whole line
        Scanner input = new Scanner(System.in); // creating scanner object
        String name = input.nextLine();
        System.out.println(name);


    }
}
//
//    int rollNo = input.nextInt();
//    double percentage = input.nextDouble();
//    char gender = input.next().charAt(0);
//        System.out.println("name: " + name);
//                System.out.println("rollNo: " + rollNo);
//                System.out.println("percentage: " + percentage);
//                System.out.println("gender: " + gender);
//// java - 1000k ill take it from libarary
