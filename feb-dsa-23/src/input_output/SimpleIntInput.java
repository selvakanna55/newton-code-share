package input_output;

import java.util.*;
import java.io.*;

class SimpleIntInput {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int sum = a + b;
        System.out.println(sum);
    }
}