package assignments;


import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Operators {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // to read input from keyboard
        int a = input.nextInt(); // 15
        int b = input.nextInt(); // 3
        System.out.println(a + b); //18
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
    }
}