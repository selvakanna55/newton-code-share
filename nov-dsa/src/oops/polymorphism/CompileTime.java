package oops.polymorphism;

public class CompileTime {
    static void add(int a, int b) {
        System.out.println("2params " + (a + b));
    }


    static void add(double a, double b) {
        System.out.println("2params double" + (a + b));
    }

    static void add(int a, int b, int c) {
        System.out.println("3params " + (a + b + c));
    }

    static void add(int a, int b, int c, int d) {
        System.out.println("4params " + (a + b + d));
    }

    public static void main(String[] args) {
        add(10, 20);
        add(10, 20, 30);
        add(10, 20, 30, 40);
        add(10.5, 12.5);
    }
}
