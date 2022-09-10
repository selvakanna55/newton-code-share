package recap;

class Calculator {
    static int add(int a, int b) {
        System.out.println("add int , int");
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println("add int , int, int");
        return a + b + c;
    }

    static double add(double a, double b) {
        System.out.println("add double , double");
        return a + b;
    }
}




public class Polymorphism {
    public static void main(String[] args) {
        System.out.println(Calculator.add(10, 20));
        System.out.println(Calculator.add(10, 10, 30));
        System.out.println(Calculator.add(10.9, 20.6));
    }
}
