package oops;

// compile time polymorphism
public class FunctionOverloading {
    static int add(int num1, int num2) {
        System.out.println("2 parameter - int ");
        return num1 + num2;
    }

    static int add(int num1, int num2, int num3, int num4) {
        System.out.println("4 parameter - int ");
        return num1 + num2 + num3 + num4;
    }

    static double add(double num1, double num2) {
        System.out.println("2 parameter - double ");
        return num1 + num2;
    }


    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(add(10, 20, 30, 40));
        System.out.println(add(1.3, 2.2));
    }
}
