package oops;


public class CompileTimePolymorphism {
    // Newton School Online Java compiler to run Java online.
    // Write Java code in this online editor and run it.
    public static void add(int a, int b) {
        System.out.println("add two numbers " + (a + b));
    }

    static void add(int a, int b, int c) {
        System.out.println("add three numbers " + (a + b + c));
    }

    public static void add(double a, double b) {
        System.out.println("add two numbers double " + (a + b));
    }


    public static void main(String[] args) {
        add(10, 20, 30); // int,int,double
        add(10.4, 20.4);
        add(10, 20, 30);
    }
    // javac
}