package oops.polymorphism;


class CompileTimePoly {
    public static int sum(int a, int b) {
        System.out.println("two int");
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        System.out.println("three int");
        return a + b + c;
    }


    public static double sum(double a, double b) {
        System.out.println("two double");
        return a + b;
    }

    public static void main(String args[]) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10.1, 6.5));
    }
}