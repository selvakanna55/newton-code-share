package oops.polymorphism;

public class CompileTimePoly {
    static double sum(double a, double b) {
        System.out.println("double sum 2");
        return a + b;
    }

    static int sum(int a, int b) {
        System.out.println("int sum 2");
        return a + b;
    }


    static int sum(int a, int b, int c) {
        System.out.println("int sum 3");
        return a + b + c;
    }

    static int sum(int a, int b, int c, int d) {
        System.out.println("int sum 4");
        return a + b + c + d;
    }



    public static void main(String[] args) {
//        int a = 2.2; // compile time error  -> grammatically wrong
//        int b = 10 / 0; // runtime error -> logically wrong
        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2, 3));
        System.out.println(sum(1, 2, 3, 4));
        System.out.println(sum(1.5, 2.5));
    }
}
