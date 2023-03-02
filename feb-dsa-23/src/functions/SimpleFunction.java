package functions;

import java.io.PrintStream;


public class SimpleFunction {
    // public static return type functioname (){
    //  function body
    // }
    public static void printHello() {
        System.out.println("h1");
    }

    public static void add(int num1, int num2) {
        System.out.println(num1 + num2);
    }


    public static int addTwoNumber(int num1, int num2) {
        int answer = num1 + num2;
        return answer;
    }

    public static double avergeMark(int sub1, int sub2, int sub3) {
        int total = sub1 + sub2 + sub3;
        double avg = (double) total / 3;
        return avg;
    }


    public static void printBegin() {
        System.out.println("begin");
        System.out.println("begin");
        System.out.println("begin");
        System.out.println("begin");
        System.out.println("begin");
        System.out.println("begin");
        System.out.println("begin");
        System.out.println("begin");
    }

    static int addTwo(int a, int b) {
        a = a + 5; // no reason
        b = b + 5; // no reason
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;
//        int sum = addTwoNumber(a, b);
//        System.out.println(sum);
        int a = 10;
        int b = 20;
        System.out.println(a + " " + b);
        int sum = addTwo(a, b);
        System.out.println(sum);
        System.out.println(a + " " + b);

    }
}
