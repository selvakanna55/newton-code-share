package oops.static_example;

class Calculator {
    static int sum;

    int total;

    static int add(int a, int b) {
        return a + b;
    }
}

//10 0
//        10 40
public class SimpleStatic {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.sum = 10;
//        Calculator c2 = new Calculator();
//        System.out.println(c1.sum + " " + c2.sum);
//        c2.sum = 40;
//        System.out.println(c1.sum + " " + c2.sum);
////        System.out.println(c1.add(10, 20));
//        System.out.println(Calculator.sum);
//        Calculator.sum = 99;
//        System.out.println(Calculator.sum);
//        System.out.println(c1.sum);
        System.out.println(c1.add(10, 20));
        System.out.println(Calculator.add(10, 20));
    }
}
